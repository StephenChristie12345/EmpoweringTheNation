package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupMenuButton()
        setupNavigationButtons()
        setupQuoteSharing()
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

        // Add navigation to QuoteScreen from the quote section
        findViewById<View>(R.id.quote_section)?.setOnClickListener {
            startActivity(Intent(this, QuoteScreen::class.java))
        }
    }

    private fun setupQuoteSharing() {
        val quoteText = findViewById<TextView>(R.id.quote_text)
        val btnShareSMS = findViewById<Button>(R.id.btn_share_sms)
        val btnShareEmail = findViewById<Button>(R.id.btn_share_email)

        val currentQuote = getString(R.string.daily_quote)

        btnShareSMS?.setOnClickListener {
            QuoteSharer.shareViaSMS(this, currentQuote)
        }

        btnShareEmail?.setOnClickListener {
            QuoteSharer.shareViaEmail(this, currentQuote)
        }

        // Add click listener to navigate to QuoteScreen when clicking on the quote text
        quoteText?.setOnClickListener {
            startActivity(Intent(this, QuoteScreen::class.java))
        }
    }

    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)

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
                R.id.menu_quotes -> {
                    startActivity(Intent(this, QuoteScreen::class.java))
                    true
                }
                else -> false
            }
        }
        popup.show()
    }
}