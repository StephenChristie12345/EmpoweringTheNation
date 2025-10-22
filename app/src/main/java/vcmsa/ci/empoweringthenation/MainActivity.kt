package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupMenuButton()
        setupNavigationButtons()
        setupQuotationButton()
    }

    private fun setupMenuButton() {
        findViewById<View>(R.id.main_menu_button)?.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun setupNavigationButtons() {
        findViewById<View>(R.id.about_card)?.setOnClickListener {
            startActivity(Intent(this, AboutScreen::class.java))
        }

        findViewById<View>(R.id.six_month_card)?.setOnClickListener {
            startActivity(Intent(this, SixMonthCourses::class.java))
        }

        findViewById<View>(R.id.six_week_card)?.setOnClickListener {
            startActivity(Intent(this, SixWeekCourses::class.java))
        }

        findViewById<View>(R.id.calculator_card)?.setOnClickListener {
            startActivity(Intent(this, FeeCalculator::class.java))
        }

        findViewById<View>(R.id.quotation_card)?.setOnClickListener {
            openQuotationActivity()
        }
    }

    private fun setupQuotationButton() {
    }

    private fun openQuotationActivity() {
        val intent = Intent(this, QuotationActivity::class.java)

        intent.putExtra("COURSE_NAME", "Android Development")
        intent.putExtra("COURSE_PRICE", "$299")
        intent.putExtra("COURSE_DURATION", "8 weeks")

        startActivity(intent)
    }

    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)

        popup.menu.add("Get Quotation")

        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_home -> true
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
                R.id.menu_calculator -> {
                    startActivity(Intent(this, FeeCalculator::class.java))
                    true
                }
                R.id.menu_locations -> {
                    startActivity(Intent(this, Locations::class.java))
                    true
                }
                else -> {
                    if (item.title == "Get Quotation") {
                        openQuotationActivity()
                        true
                    } else {
                        false
                    }
                }
            }
        }
        popup.show()
    }
}