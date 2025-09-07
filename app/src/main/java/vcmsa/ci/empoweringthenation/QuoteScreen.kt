package vcmsa.ci.empoweringthenation

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuoteScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quote_screen)


        val quoteText = findViewById<TextView>(R.id.quote_text)
        quoteText.text = getString(R.string.daily_quote)


        findViewById<Button>(R.id.btn_share_sms).setOnClickListener {
            QuoteSharer.shareViaSMS(this, quoteText.text.toString())
        }


        findViewById<Button>(R.id.btn_share_email).setOnClickListener {
            QuoteSharer.shareViaEmail(this, quoteText.text.toString())
        }
    }
}