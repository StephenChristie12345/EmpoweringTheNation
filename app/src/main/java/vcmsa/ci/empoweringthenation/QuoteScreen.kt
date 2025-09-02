package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuoteScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quote_screen)

        // Set up the quote text - these IDs are in quote_card.xml
        val quoteText = findViewById<TextView>(R.id.quote_text)
        quoteText.text = getString(R.string.daily_quote)

        // Set up SMS sharing button
        findViewById<Button>(R.id.btn_share_sms).setOnClickListener {
            QuoteSharer.shareViaSMS(this, quoteText.text.toString())
        }

        // Set up Email sharing button
        findViewById<Button>(R.id.btn_share_email).setOnClickListener {
            QuoteSharer.shareViaEmail(this, quoteText.text.toString())
        }
    }
}