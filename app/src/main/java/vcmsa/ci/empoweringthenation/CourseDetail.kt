package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail) // Using your existing course_detail.xml

        // Get course data from intent
        val courseName = intent.getStringExtra("COURSE_NAME") ?: "Course"
        val courseDescription = intent.getStringExtra("COURSE_DESCRIPTION") ?: ""
        val courseFee = intent.getDoubleExtra("COURSE_FEE", 0.0)
        val courseDuration = intent.getStringExtra("COURSE_DURATION") ?: ""
        val courseDetails = intent.getStringExtra("COURSE_DETAILS") ?: ""

        // Set up views
        findViewById<TextView>(R.id.detail_course_name).text = courseName
        findViewById<TextView>(R.id.detail_course_description).text = courseDescription
        findViewById<TextView>(R.id.detail_course_fee).text = "R$courseFee"
        findViewById<TextView>(R.id.detail_course_duration).text = courseDuration
        findViewById<TextView>(R.id.detail_course_details).text = courseDetails

        // Back button
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}