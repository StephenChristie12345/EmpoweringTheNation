package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChildMindingDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Child Minding"
        findViewById<TextView>(R.id.detail_course_description).text = "Professional childcare and early childhood development"
        findViewById<TextView>(R.id.detail_course_fee).text = "R1500"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 months"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Child development stages
            • Safety and first aid for children
            • Educational activity planning
            • Behavior management techniques
            • Nutrition and meal preparation
            • Health and hygiene standards
            • Communication with parents
            • Legal requirements and certifications
            
            Certification: Childcare Assistant
            First Aid certification included
            Practical placement opportunity
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}