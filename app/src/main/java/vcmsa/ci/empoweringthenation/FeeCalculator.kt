package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class FeeCalculator : AppCompatActivity() {

    private lateinit var checkboxFirstAid: CheckBox
    private lateinit var checkboxSewing: CheckBox
    private lateinit var checkboxLandscaping: CheckBox
    private lateinit var checkboxLifeSkills: CheckBox
    private lateinit var checkboxChildMinding: CheckBox
    private lateinit var checkboxCooking: CheckBox
    private lateinit var totalAmountTextView: TextView
    private lateinit var discountTextView: TextView
    private lateinit var originalAmountTextView: TextView

    // Course prices
    private val PRICE_6_MONTH = 1500
    private val PRICE_6_WEEK = 750
    private val DISCOUNT_PERCENTAGE = 10 // 10% discount for 2+ courses
    private val MIN_COURSES_FOR_DISCOUNT = 2

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
        discountTextView = findViewById(R.id.discount_text)
        originalAmountTextView = findViewById(R.id.original_amount)
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
        var selectedCount = 0

        // Calculate total and count selected courses
        if (checkboxFirstAid.isChecked) {
            total += PRICE_6_MONTH
            selectedCount++
        }
        if (checkboxSewing.isChecked) {
            total += PRICE_6_MONTH
            selectedCount++
        }
        if (checkboxLandscaping.isChecked) {
            total += PRICE_6_MONTH
            selectedCount++
        }
        if (checkboxLifeSkills.isChecked) {
            total += PRICE_6_WEEK
            selectedCount++
        }
        if (checkboxChildMinding.isChecked) {
            total += PRICE_6_WEEK
            selectedCount++
        }
        if (checkboxCooking.isChecked) {
            total += PRICE_6_WEEK
            selectedCount++
        }

        // Apply discount if 2 or more courses selected
        if (selectedCount >= MIN_COURSES_FOR_DISCOUNT) {
            applyDiscount(total, selectedCount)
        } else {
            showRegularPrice(total)
        }
    }

    private fun applyDiscount(originalTotal: Int, selectedCount: Int) {
        val discountAmount = (originalTotal * DISCOUNT_PERCENTAGE) / 100
        val finalTotal = originalTotal - discountAmount

        // Show original price with strikethrough
        originalAmountTextView.text = "R$originalTotal"
        originalAmountTextView.paintFlags = originalAmountTextView.paintFlags or android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
        originalAmountTextView.visibility = View.VISIBLE

        // Show discounted price
        totalAmountTextView.text = "R$finalTotal"
        totalAmountTextView.setTextColor(ContextCompat.getColor(this, R.color.gold))

        // Show discount information
        discountTextView.text = "🎉 $DISCOUNT_PERCENTAGE% Discount Applied! (Save R$discountAmount)"
        discountTextView.setTextColor(ContextCompat.getColor(this, R.color.gold))
        discountTextView.visibility = View.VISIBLE
    }

    private fun showRegularPrice(total: Int) {
        totalAmountTextView.text = "R$total"
        totalAmountTextView.setTextColor(ContextCompat.getColor(this, R.color.white))

        // Hide discount elements
        originalAmountTextView.visibility = View.GONE
        discountTextView.visibility = View.GONE
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