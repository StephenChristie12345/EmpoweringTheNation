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
        Course(
            name = "Life Skills",
            description = "Personal development and essential life skills",
            fee = 750.0,
            duration = "6 weeks",
            details = "Essential life skills including communication, problem-solving, financial literacy, time management, and personal development.",
            imageResId = R.drawable.life_skills2_bg
        ),
        Course(
            name = "Child Minding",
            description = "Professional childcare training",
            fee = 750.0,
            duration = "6 weeks",
            details = "Child development theories, safety procedures, educational activities, behavior management, and professional childcare practices.",
            imageResId = R.drawable.child_minding_bg
        ),
        Course(
            name = "Cooking",
            description = "Culinary arts and food preparation",
            fee = 750.0,
            duration = "6 weeks",
            details = "Basic cooking techniques, food preparation, nutrition fundamentals, menu planning, kitchen safety, and hygiene standards.",
            imageResId = R.drawable.cooking_bg
        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.courses_list)

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