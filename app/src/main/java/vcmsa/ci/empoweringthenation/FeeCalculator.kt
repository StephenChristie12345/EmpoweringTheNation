package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FeeCalculator : AppCompatActivity() {

    private lateinit var checkboxFirstAid: CheckBox
    private lateinit var checkboxSewing: CheckBox
    private lateinit var checkboxLandscaping: CheckBox
    private lateinit var checkboxLifeSkills: CheckBox
    private lateinit var checkboxChildMinding: CheckBox
    private lateinit var checkboxCooking: CheckBox
    private lateinit var totalAmountTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fee_calculator)

        initializeViews()
        setupCheckboxListeners()
        setupBackButton()
        setupMenuButton()
    }

    private fun initializeViews() {
        checkboxFirstAid = findViewById(R.id.checkbox_first_aid)
        checkboxSewing = findViewById(R.id.checkbox_sewing)
        checkboxLandscaping = findViewById(R.id.checkbox_landscaping)
        checkboxLifeSkills = findViewById(R.id.checkbox_life_skills)
        checkboxChildMinding = findViewById(R.id.checkbox_child_minding)
        checkboxCooking = findViewById(R.id.checkbox_cooking)
        totalAmountTextView = findViewById(R.id.total_amount)
    }

    private fun setupCheckboxListeners() {
        val checkboxes = listOf(
            checkboxFirstAid, checkboxSewing, checkboxLandscaping,
            checkboxLifeSkills, checkboxChildMinding, checkboxCooking
        )

        checkboxes.forEach { checkbox ->
            checkbox.setOnCheckedChangeListener { _, _ -> calculateTotal() }
        }
    }

    private fun calculateTotal() {
        var total = 0
        if (checkboxFirstAid.isChecked) total += 1500
        if (checkboxSewing.isChecked) total += 1500
        if (checkboxLandscaping.isChecked) total += 1500
        if (checkboxLifeSkills.isChecked) total += 750
        if (checkboxChildMinding.isChecked) total += 750
        if (checkboxCooking.isChecked) total += 750
        totalAmountTextView.text = "R$total"
    }

    private fun setupBackButton() {
        findViewById<View>(R.id.back_button)?.setOnClickListener { finish() }
    }

    private fun setupMenuButton() {
        findViewById<View>(R.id.calculator_menu_button)?.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)

        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    startActivity(Intent(this, MainActivity::class.java))
                    true
                }
                R.id.menu_about -> {
                    startActivity(Intent(this, AboutScreen::class.java))
                    true
                }
                R.id.menu_six_month -> {
                    startActivity(Intent(this, SixMonthCourses::class.java))
                    true
                }
                R.id.menu_six_week -> {
                    startActivity(Intent(this, SixWeekCourses::class.java))
                    true
                }
                R.id.menu_calculator -> true
                R.id.menu_locations -> {
                    startActivity(Intent(this, Locations::class.java))
                    true
                }
                else -> false
            }
        }
        popup.show()
    }
}