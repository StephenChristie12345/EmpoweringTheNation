package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LandscapingDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Landscaping"
        findViewById<TextView>(R.id.detail_course_description).text = "Garden design and landscape maintenance"
        findViewById<TextView>(R.id.detail_course_fee).text = "R1500"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 months"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Landscape design principles
            • Plant selection and care
            • Soil preparation and analysis
            • Irrigation system installation
            • Garden maintenance techniques
            • Hardscaping and paving
            • Pest and disease control
            • Sustainable gardening practices
            
            Equipment: Basic tools provided
            Practical field training
            Business startup guidance
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}