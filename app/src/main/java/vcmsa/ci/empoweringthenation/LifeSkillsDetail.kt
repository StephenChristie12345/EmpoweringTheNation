package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LifeSkillsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "Life Skills"
        findViewById<TextView>(R.id.detail_course_description).text = "Essential personal and professional development skills"
        findViewById<TextView>(R.id.detail_course_fee).text = "R1500"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 months"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • Effective communication skills
            • Financial literacy and budgeting
            • Time management techniques
            • Problem-solving strategies
            • Conflict resolution
            • Personal goal setting
            • Stress management
            • Interview preparation
            
            Benefits: Improved confidence
            Better employment opportunities
            Enhanced personal relationships
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}