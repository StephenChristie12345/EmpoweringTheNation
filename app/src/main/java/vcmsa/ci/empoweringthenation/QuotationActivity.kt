package vcmsa.ci.empoweringthenation

import android.content.Intent
import android.graphics.pdf.PdfDocument
import android.graphics.Typeface
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import java.io.File
import java.io.FileOutputStream
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class QuotationActivity : AppCompatActivity() {

    private lateinit var courseName: TextView
    private lateinit var coursePrice: TextView
    private lateinit var courseDuration: TextView
    private lateinit var quotationDetails: TextView
    private lateinit var btnShareSms: Button
    private lateinit var btnShareEmail: Button
    private lateinit var btnGetQuotation: Button
    private lateinit var btnBackArrow: Button

    private var pdfFile: File? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quotation_screen)

        initializeViews()
        setupQuotationData()
        setupClickListeners()
        generatePdfQuotation()
    }

    private fun initializeViews() {
        courseName = findViewById(R.id.course_name)
        coursePrice = findViewById(R.id.course_price)
        courseDuration = findViewById(R.id.course_duration)
        quotationDetails = findViewById(R.id.quotation_details)
        btnShareSms = findViewById(R.id.btn_share_sms)
        btnShareEmail = findViewById(R.id.btn_share_email)
        btnGetQuotation = findViewById(R.id.btn_get_quotation)
        btnBackArrow = findViewById(R.id.btn_back_arrow)
    }

    private fun setupQuotationData() {
        val selectedCourse = intent.getStringExtra("COURSE_NAME") ?: "Course Not Specified"
        val price = intent.getStringExtra("COURSE_PRICE") ?: "R0"
        val duration = intent.getStringExtra("COURSE_DURATION") ?: "Duration Not Specified"

        courseName.text = "Course: $selectedCourse"
        coursePrice.text = "Price: $price"
        courseDuration.text = "Duration: $duration"
    }

    private fun setupClickListeners() {
        btnShareSms.setOnClickListener { shareViaSMS() }
        btnShareEmail.setOnClickListener { shareViaEmail() }
        btnGetQuotation.setOnClickListener { generateNewQuotation() }
        btnBackArrow.setOnClickListener { finish() }
    }

    private fun generatePdfQuotation(): File {
        val timestamp = SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(Date())
        val fileName = "Quotation_$timestamp.pdf"

        val storageDir = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS)
        val file = File(storageDir, fileName)

        try {
            val document = PdfDocument()
            val pageInfo = PdfDocument.PageInfo.Builder(595, 842, 1).create()
            val page = document.startPage(pageInfo)
            val canvas = page.canvas

            val paint = android.graphics.Paint()
            paint.isAntiAlias = true
            paint.textSize = 12f
            paint.color = android.graphics.Color.BLACK

            try {
                val arial = Typeface.create("Arial", Typeface.NORMAL)
                paint.typeface = arial
            } catch (e: Exception) {
                paint.typeface = Typeface.DEFAULT
            }

            var yPosition = 50f

            paint.textSize = 16f
            paint.isFakeBoldText = true
            canvas.drawText("EMPOWERING THE NATION", 50f, yPosition, paint)
            yPosition += 25

            paint.textSize = 14f
            canvas.drawText("OFFICIAL QUOTATION", 50f, yPosition, paint)
            yPosition += 30

            paint.textSize = 12f
            paint.isFakeBoldText = false
            canvas.drawText("Quotation Date: ${SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(Date())}", 50f, yPosition, paint)
            yPosition += 20
            canvas.drawText("Quotation Number: Q${System.currentTimeMillis()}", 50f, yPosition, paint)
            yPosition += 30

            paint.isFakeBoldText = true
            canvas.drawText("COURSE DETAILS:", 50f, yPosition, paint)
            yPosition += 20
            paint.isFakeBoldText = false
            canvas.drawText("Course: ${courseName.text.toString().replace("Course: ", "")}", 50f, yPosition, paint)
            yPosition += 15
            canvas.drawText("Price: ${coursePrice.text.toString().replace("Price: ", "")}", 50f, yPosition, paint)
            yPosition += 15
            canvas.drawText("Duration: ${courseDuration.text.toString().replace("Duration: ", "")}", 50f, yPosition, paint)
            yPosition += 30

            paint.isFakeBoldText = true
            canvas.drawText("INCLUDED IN THIS QUOTATION:", 50f, yPosition, paint)
            yPosition += 20
            paint.isFakeBoldText = false

            val features = listOf(
                "• Full course materials and resources",
                "• Professional instruction and guidance",
                "• Certificate of completion",
                "• 24/7 student support",
                "• Career guidance and placement assistance",
                "• Money-back guarantee"
            )

            features.forEach { feature ->
                canvas.drawText(feature, 50f, yPosition, paint)
                yPosition += 15
            }
            yPosition += 15

            paint.isFakeBoldText = true
            canvas.drawText("PRICING:", 50f, yPosition, paint)
            yPosition += 20
            paint.isFakeBoldText = false
            canvas.drawText("R1500 per 6-month course", 50f, yPosition, paint)
            yPosition += 15
            canvas.drawText("R750 per 6-week course", 50f, yPosition, paint)
            yPosition += 15
            canvas.drawText("Special Offer: 10% discount for 2+ courses!", 50f, yPosition, paint)
            yPosition += 30

            paint.isFakeBoldText = true
            canvas.drawText("TERMS AND CONDITIONS:", 50f, yPosition, paint)
            yPosition += 20
            paint.isFakeBoldText = false

            val terms = listOf(
                "• This quotation is valid for 30 days",
                "• Payment plans available upon request",
                "• All prices include VAT where applicable",
                "• Course materials are included in the price"
            )

            terms.forEach { term ->
                canvas.drawText(term, 50f, yPosition, paint)
                yPosition += 15
            }
            yPosition += 15

            paint.isFakeBoldText = true
            canvas.drawText("CONTACT INFORMATION:", 50f, yPosition, paint)
            yPosition += 20
            paint.isFakeBoldText = false

            val contactInfo = listOf(
                "Empowering the Nation",
                "Email: info@empoweringthenation.co.za",
                "Phone: +27 11 123 4567",
                "Website: www.empoweringthenation.co.za"
            )

            contactInfo.forEach { info ->
                canvas.drawText(info, 50f, yPosition, paint)
                yPosition += 15
            }

            document.finishPage(page)

            val outputStream = FileOutputStream(file)
            document.writeTo(outputStream)
            document.close()
            outputStream.close()

            pdfFile = file
            Toast.makeText(this, "PDF quotation generated successfully!", Toast.LENGTH_SHORT).show()

        } catch (e: Exception) {
            e.printStackTrace()
            Toast.makeText(this, "Error generating PDF: ${e.message}", Toast.LENGTH_LONG).show()
        }

        return file
    }

    private fun shareViaSMS() {
        if (pdfFile == null || !pdfFile!!.exists()) {
            pdfFile = generatePdfQuotation()
        }

        val quotationText = generateQuotationText()

        try {
            val smsIntent = Intent(Intent.ACTION_SEND)
            smsIntent.type = "text/plain"
            smsIntent.putExtra(Intent.EXTRA_TEXT, quotationText)
            smsIntent.putExtra("sms_body", quotationText)

            val pdfUri = FileProvider.getUriForFile(
                this,
                "${packageName}.provider",
                pdfFile!!
            )
            smsIntent.putExtra(Intent.EXTRA_STREAM, pdfUri)
            smsIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

            startActivity(Intent.createChooser(smsIntent, "Send Quotation via"))
        } catch (e: Exception) {
            val smsIntent = Intent(Intent.ACTION_VIEW)
            smsIntent.data = Uri.parse("sms:")
            smsIntent.putExtra("sms_body", quotationText)
            startActivity(smsIntent)
        }
    }

    private fun shareViaEmail() {
        if (pdfFile == null || !pdfFile!!.exists()) {
            pdfFile = generatePdfQuotation()
        }

        try {
            val emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.type = "application/pdf"
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Course Quotation - Empowering the Nation")

            val emailBody = """
                Dear Student,
                
                Please find attached your official course quotation from Empowering the Nation.
                
                ${generateQuotationText()}
                
                We look forward to helping you achieve your educational goals!
                
                Best regards,
                Empowering the Nation Team
                📧 info@empoweringthenation.co.za
                📞 +27 11 123 4567
            """.trimIndent()

            emailIntent.putExtra(Intent.EXTRA_TEXT, emailBody)

            val pdfUri = FileProvider.getUriForFile(
                this,
                "${packageName}.provider",
                pdfFile!!
            )
            emailIntent.putExtra(Intent.EXTRA_STREAM, pdfUri)
            emailIntent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)

            startActivity(Intent.createChooser(emailIntent, "Send Quotation via Email"))
        } catch (e: Exception) {
            Toast.makeText(this, "Error sharing PDF: ${e.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun generateNewQuotation() {
        pdfFile?.delete()
        pdfFile = generatePdfQuotation()
        Toast.makeText(this, "New quotation generated!", Toast.LENGTH_SHORT).show()
    }

    private fun generateQuotationText(): String {
        return """
            📋 OFFICIAL QUOTATION - EMPOWERING THE NATION
            
            ${courseName.text}
            ${coursePrice.text}
            ${courseDuration.text}
            
            📦 INCLUDED:
            • Full course materials
            • Professional instruction
            • Certificate of completion
            • 24/7 student support
            • Career guidance
            
            💰 PRICING:
            R1500 per 6-month course
            R750 per 6-week course
            Special Offer: 10% discount for 2+ courses!
            
            📞 CONTACT US:
            Email: info@empoweringthenation.co.za
            Phone: +27 11 123 4567
            
            This quotation is valid for 30 days.
            
            Empower yourself with quality education!
        """.trimIndent()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}