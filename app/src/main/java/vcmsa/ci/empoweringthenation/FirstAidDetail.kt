package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstAidDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        setupCourseDetails()
        setupBackButton()
    }

    private fun setupCourseDetails() {
        findViewById<TextView>(R.id.detail_course_name).text = "First Aid Training"
        findViewById<TextView>(R.id.detail_course_description).text = "Comprehensive first aid and emergency response training"
        findViewById<TextView>(R.id.detail_course_fee).text = "R1500"
        findViewById<TextView>(R.id.detail_course_duration).text = "6 months"
        findViewById<TextView>(R.id.detail_course_details).text = """
            Course Details:
            
            • CPR and resuscitation techniques
            • Wound care and bandaging
            • Emergency situation management
            • First aid for burns and fractures
            • Poisoning and allergic reactions
            • Basic life support skills
            • Emergency equipment usage
            
            Certification: First Aid Level 1-3
            Practical hands-on training
            Industry-recognized certificate
        """.trimIndent()
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}