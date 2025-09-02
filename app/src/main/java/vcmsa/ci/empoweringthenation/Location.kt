package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Locations : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.locations)

        setupBackButton()
        setupMenuButton()
        setupLocationButtons()
    }

    private fun setupBackButton() {
        findViewById<View>(R.id.back_button_locations)?.setOnClickListener {
            finish()
        }
    }

    private fun setupMenuButton() {
        findViewById<View>(R.id.locations_menu_button)?.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun showPopupMenu(view: View) {
        val popup = PopupMenu(this, view)
        popup.menuInflater.inflate(R.menu.main_menu, popup.menu)

        popup.setOnMenuItemClickListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {

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
                R.id.menu_calculator -> {
                    startActivity(Intent(this, FeeCalculator::class.java))
                    true
                }
                R.id.menu_locations -> {

                    true
                }
                else -> false
            }
        }
        popup.show()
    }

    private fun setupLocationButtons() {
        // Johannesburg buttons
        findViewById<View>(R.id.call_jhb)?.setOnClickListener {
            makePhoneCall("+27111234567")
        }
        findViewById<View>(R.id.directions_jhb)?.setOnClickListener {
            openDirections(-26.1043, 28.0583, "Johannesburg Campus")
        }

        // Cape Town buttons
        findViewById<View>(R.id.call_cpt)?.setOnClickListener {
            makePhoneCall("+27219876543")
        }
        findViewById<View>(R.id.directions_cpt)?.setOnClickListener {
            openDirections(-33.9249, 18.4241, "Cape Town Campus")
        }

        // Durban buttons
        findViewById<View>(R.id.call_dbn)?.setOnClickListener {
            makePhoneCall("+27315559876")
        }
        findViewById<View>(R.id.directions_dbn)?.setOnClickListener {
            openDirections(-29.8587, 31.0218, "Durban Campus")
        }
    }

    private fun makePhoneCall(phoneNumber: String) {
        try {
            val intent = Intent(Intent.ACTION_DIAL).apply {
                data = Uri.parse("tel:$phoneNumber")
            }
            startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(this, "Unable to make call", Toast.LENGTH_SHORT).show()
        }
    }

    private fun openDirections(latitude: Double, longitude: Double, locationName: String) {
        try {
            val gmmIntentUri = Uri.parse("geo:$latitude,$longitude?q=$latitude,$longitude($locationName)")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            } else {
                val webIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://maps.google.com/?q=$latitude,$longitude")
                )
                startActivity(webIntent)
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Unable to open directions", Toast.LENGTH_SHORT).show()
        }
    }
}