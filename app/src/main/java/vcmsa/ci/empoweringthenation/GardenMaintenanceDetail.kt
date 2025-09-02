package vcmsa.ci.empoweringthenation

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
}