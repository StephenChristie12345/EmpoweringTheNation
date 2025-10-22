package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_detail)

        val courseName = intent.getStringExtra("COURSE_NAME") ?: "Course"
        val courseDescription = intent.getStringExtra("COURSE_DESCRIPTION") ?: ""
        val courseFee = intent.getDoubleExtra("COURSE_FEE", 0.0)
        val courseDuration = intent.getStringExtra("COURSE_DURATION") ?: ""
        val courseDetails = intent.getStringExtra("COURSE_DETAILS") ?: ""

        findViewById<TextView>(R.id.detail_course_name).text = courseName
        findViewById<TextView>(R.id.detail_course_description).text = courseDescription
        findViewById<TextView>(R.id.detail_course_fee).text = "R$courseFee"
        findViewById<TextView>(R.id.detail_course_duration).text = courseDuration
        findViewById<TextView>(R.id.detail_course_details).text = courseDetails

        // Get Quotation button - navigate to quotation screen
        findViewById<Button>(R.id.detail_get_quotation_button).setOnClickListener {
            val quotationIntent = Intent(this, QuotationActivity::class.java).apply {
                putExtra("COURSE_NAME", courseName)
                putExtra("COURSE_PRICE", "R$courseFee")
                putExtra("COURSE_DURATION", courseDuration)
            }
            startActivity(quotationIntent)
        }

        // Back button
        findViewById<Button>(R.id.detail_back_button).setOnClickListener {
            finish()
        }
    }
}