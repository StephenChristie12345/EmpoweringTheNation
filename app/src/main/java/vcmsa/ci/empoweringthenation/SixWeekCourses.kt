package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SixWeekCourses : AppCompatActivity() {

    private val sixWeekCourses = listOf(
        Course("Sewing", "Basic sewing skills", 750.0, "6 weeks", "Sewing techniques, pattern reading, garment construction, and basic alterations."),
        Course("Garden Maintenance", "Garden care basics", 750.0, "6 weeks", "Basic garden maintenance, plant care, pruning, watering systems, and pest control."),
        Course("Basic Computer Skills", "Introduction to computers", 750.0, "6 weeks", "Fundamental computer operation, typing skills, basic software usage, and internet navigation."),
        Course("Home Care", "Home maintenance skills", 750.0, "6 weeks", "Basic home maintenance, cleaning techniques, organization, and household management."),
        Course("Food Handling", "Food safety training", 750.0, "6 weeks", "Food safety standards, hygiene practices, storage methods, and preparation techniques."),
        Course("Customer Service", "Service skills training", 750.0, "6 weeks", "Customer interaction, communication skills, conflict resolution, and service excellence."),
        Course("Communication Skills", "Effective communication", 750.0, "6 weeks", "Verbal and written communication, presentation skills, listening techniques, and professional etiquette.")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_list) // Using your existing courses_list.xml

        // Set title
        findViewById<TextView>(R.id.title_text).text = "6-Week Courses"

        setupRecyclerView()
        setupBackButton()
    }

    private fun setupRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.courses_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CourseAdapter(sixWeekCourses) { course ->
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