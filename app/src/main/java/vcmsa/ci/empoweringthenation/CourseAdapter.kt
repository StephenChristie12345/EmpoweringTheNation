package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CourseAdapter(
    private val courses: List<Course>,
    private val onItemClick: (Course) -> Unit
) : RecyclerView.Adapter<CourseAdapter.CourseViewHolder>() {

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val courseName: TextView = itemView.findViewById(R.id.course_name)
        val courseDescription: TextView = itemView.findViewById(R.id.course_description)
        val courseFee: TextView = itemView.findViewById(R.id.course_fee)
        val courseDuration: TextView = itemView.findViewById(R.id.course_duration)
        val backgroundImage: ImageView = itemView.findViewById(R.id.course_background)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_course, parent, false)
        return CourseViewHolder(view)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        val course = courses[position]

        holder.courseName.text = course.name
        holder.courseDescription.text = course.description
        holder.courseFee.text = "R${course.fee.toInt()}"
        holder.courseDuration.text = course.duration
        holder.backgroundImage.setImageResource(course.imageResId)

        holder.itemView.setOnClickListener {
            onItemClick(course)
        }
    }

    override fun getItemCount(): Int = courses.size

    private fun openCourseDetail(context: android.content.Context, course: Course) {
        val intent = when (course.name) {
            "First Aid" -> Intent(context, FirstAidDetail::class.java)
            "Sewing" -> Intent(context, SewingDetail::class.java)
            "Life Skills" -> Intent(context, LifeSkillsDetail::class.java)
            "Landscaping" -> Intent(context, LandscapingDetail::class.java)
            "Child Minding" -> Intent(context, ChildMindingDetail::class.java)
            "Cooking" -> Intent(context, CookingDetail::class.java)
            "Garden Maintenance" -> Intent(context, GardenMaintenanceDetail::class.java)
            else -> Intent(context, CourseDetailActivity::class.java)
        }

        intent.apply {
            putExtra("COURSE_NAME", course.name)
            putExtra("COURSE_DESCRIPTION", course.description)
            putExtra("COURSE_FEE", course.fee)
            putExtra("COURSE_DURATION", course.duration)
            putExtra("COURSE_DETAILS", course.details)
            putExtra("COURSE_IMAGE", course.imageResId)
        }
        context.startActivity(intent)
    }
}