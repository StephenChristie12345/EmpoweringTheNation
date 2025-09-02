package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SewingDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Sewing Course"
        findViewById<TextView>(R.id.detail_course_description).text = "Basic to advanced sewing and garment construction"
        findViewById<TextView>(R.id.detail_course_fee).text = "R750"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 weeks"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Basic hand sewing techniques
            • Machine operation and maintenance
            • Pattern reading and cutting
            • Garment construction
            • Alterations and repairs
            • Fabric selection and care
            • Basic embroidery skills
            
            Includes: Sewing kit provided
            Practical project-based learning
            Certificate of completion
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}