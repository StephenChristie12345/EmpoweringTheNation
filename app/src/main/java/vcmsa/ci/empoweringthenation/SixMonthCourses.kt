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
        Course("Business Management", "Professional business skills", 1500.0, "6 months", "Management principles, business operations, financial planning, and leadership skills for entrepreneurs and managers."),
        Course("Computer Literacy", "Digital skills training", 1500.0, "6 months", "Basic to advanced computer skills including Microsoft Office, internet usage, email, and digital communication."),
        Course("Child Minding", "Professional childcare", 1500.0, "6 months", "Child development theories, safety procedures, educational activities, and professional childcare practices."),
        Course("Cooking", "Culinary arts training", 1500.0, "6 months", "Cooking techniques, food preparation, nutrition, menu planning, and kitchen safety standards."),
        Course("Landscaping", "Garden and landscape design", 1500.0, "6 months", "Landscape design principles, plant selection, garden maintenance, and hardscaping techniques."),
        Course("Life Skills", "Personal development", 1500.0, "6 months", "Essential life skills including communication, problem-solving, financial literacy, and personal development.")
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