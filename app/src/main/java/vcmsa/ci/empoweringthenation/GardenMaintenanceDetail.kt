package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GardenMaintenanceDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
        setupQuotationButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Garden Maintenance"
        findViewById<TextView>(R.id.detail_course_description).text = "Basic garden care and maintenance skills"
        findViewById<TextView>(R.id.detail_course_fee).text = "R750"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 weeks"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Basic gardening techniques
            • Lawn care and maintenance
            • Pruning and trimming
            • Weed and pest control
            • Planting and propagation
            • Irrigation system basics
            • Tool maintenance and safety
            • Seasonal garden care
            
            Tools: Basic gardening tools provided
            Hands-on practical training
            Certificate of competence
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }

    private fun setupQuotationButton() {
        findViewById<Button>(R.id.detail_get_quotation_button).setOnClickListener {
            val quotationIntent = Intent(this, QuotationActivity::class.java).apply {
                putExtra("COURSE_NAME", findViewById<TextView>(R.id.detail_course_name).text.toString())
                putExtra("COURSE_PRICE", findViewById<TextView>(R.id.detail_course_fee).text.toString())
                putExtra("COURSE_DURATION", findViewById<TextView>(R.id.detail_course_duration).text.toString())
                putExtra("COURSE_DETAILS", findViewById<TextView>(R.id.detail_course_details).text.toString())
            }
            startActivity(quotationIntent)
        }
    }
}