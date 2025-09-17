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
        Course("First Aid", "Comprehensive first aid training", 1500.0, "6 months", "Learn life-saving techniques and emergency response procedures including CPR, wound care, and emergency situation management."),
        Course("Sewing", "Professional sewing skills", 1500.0, "6 months", "Learn sewing techniques, pattern making, garment construction, and textile knowledge for professional sewing."),
        Course("Landscaping", "Garden and landscape design", 1500.0, "6 months", "Landscape design principles, plant selection, garden maintenance, and hardscaping techniques.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_list) // Using your existing courses_list.xml

        // Set title
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
        }
        startActivity(intent)
    }

    private fun setupBackButton() {
        findViewById<Button>(R.id.back_button).setOnClickListener {
            finish()
        }
    }
}