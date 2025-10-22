package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SixMonthCourses : AppCompatActivity() {

    private val sixMonthCourses = listOf(
        Course(
            name = "First Aid",
            description = "Comprehensive first aid training",
            fee = 1500.0,
            duration = "6 months",
            details = "Learn life-saving techniques and emergency response procedures including CPR, wound care, and emergency situation management.",
            imageResId = R.drawable.first_aid_bg
        ),
        Course(
            name = "Sewing",
            description = "Professional sewing skills",
            fee = 1500.0,
            duration = "6 months",
            details = "Learn sewing techniques, pattern making, garment construction, and textile knowledge for professional sewing.",
            imageResId = R.drawable.sewing_bg
        ),
        Course(
            name = "Landscaping",
            description = "Garden and landscape design",
            fee = 1500.0,
            duration = "6 months",
            details = "Landscape design principles, plant selection, garden maintenance, and hardscaping techniques.",
            imageResId = R.drawable.landscaping_bg
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_list)

        // Set title - use direct text for now to fix the error
        findViewById<TextView>(R.id.title_text).text = "6-Month Courses"

        setupRecyclerView()
        setupBackButton()
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.courses_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CourseAdapter(sixMonthCourses) { course ->
            openCourseDetail(course)
        }
    }

    private fun openCourseDetail(course: Course) {
        val intent = Intent(this, CourseDetailActivity::class.java).apply {
            putExtra("COURSE_NAME", course.name)
            putExtra("COURSE_DESCRIPTION", course.description)
            putExtra("COURSE_FEE", course.fee)
            putExtra("COURSE_DURATION", course.duration)
            putExtra("COURSE_DETAILS", course.details)
            putExtra("COURSE_IMAGE", course.imageResId)
        }
        startActivity(intent)
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.back_button).setOnClickListener {
            finish()
        }
    }
}