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
        Course("Life Skills", "Personal development and essential life skills", 750.0, "6 weeks", "Essential life skills including communication, problem-solving, financial literacy, time management, and personal development."),
        Course("Child Minding", "Professional childcare training", 750.0, "6 weeks", "Child development theories, safety procedures, educational activities, behavior management, and professional childcare practices."),
        Course("Cooking", "Culinary arts and food preparation", 750.0, "6 weeks", "Basic cooking techniques, food preparation, nutrition fundamentals, menu planning, kitchen safety, and hygiene standards.")
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