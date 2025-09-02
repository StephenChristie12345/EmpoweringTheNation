package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import androidx.appcompat.app.AppCompatActivity

class AboutScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_screen)

        setupBackButton()
        setupMenuButton()
    }

    private fun setupBackButton() {
        findViewById<View>(R.id.back_button)?.setOnClickListener {
            finish()
        }
    }

    private fun setupMenuButton() {
        findViewById<View>(R.id.about_menu_button)?.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu) // FIXED

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
                else -> false
            }
        }
        popup.show()
    }
}