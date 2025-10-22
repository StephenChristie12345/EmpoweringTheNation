package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CookingDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
        setupQuotationButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Cooking Course"
        findViewById<TextView>(R.id.detail_course_description).text = "Culinary arts and food preparation training"
        findViewById<TextView>(R.id.detail_course_fee).text = "R1500"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 months"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Basic cooking techniques
            • Food safety and hygiene
            • Knife skills and safety
            • Menu planning and costing
            • Nutrition and dietary requirements
            • Baking and pastry basics
            • South African cuisine
            • International cooking styles
            
            Includes: Chef's uniform provided
            Practical kitchen training
            Food handler's certificate
            Recipe portfolio development
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