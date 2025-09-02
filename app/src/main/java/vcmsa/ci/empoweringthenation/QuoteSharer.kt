package vcmsa.ci.empoweringthenation

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast

object QuoteSharer {

    fun shareViaSMS(context: Context, quote: String) {
        try {
            val message = context.getString(R.string.share_message, quote)
            val intent = Intent(Intent.ACTION_VIEW).apply {
                data = Uri.parse("sms:")
                putExtra("sms_body", message)
            }
            context.startActivity(intent)
        } catch (e: Exception) {
            Toast.makeText(context, "Unable to share via SMS", Toast.LENGTH_SHORT).show()
        }
    }

    fun shareViaEmail(context: Context, quote: String) {
        try {
            val message = context.getString(R.string.share_message, quote)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.email_subject))
                putExtra(Intent.EXTRA_TEXT, message)
            }
            context.startActivity(Intent.createChooser(intent, "Share Quote via"))
        } catch (e: Exception) {
            Toast.makeText(context, "Unable to share via Email", Toast.LENGTH_SHORT).show()
        }
    }
}