package ru.myapplication.schet
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int = 0
    private var homaCounter: Int = 0
    private lateinit var grText: TextView
    private lateinit var countText: TextView
    private lateinit var image: TextView
    private lateinit var grBtn: Button
    private lateinit var countBtn: Button
    private lateinit var homaBtn: ImageButton
    @SuppressLint("MissingInflatedId", "SetTextI18n", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        grText = findViewById(R.id.teext)
        image = findViewById(R.id.Text)
        countText = findViewById(R.id.textCount)
        grBtn = findViewById(R.id.greetingsBtn)
        countBtn = findViewById(R.id.countBtn)
        homaBtn = findViewById(R.id.homyakBtn)

        grBtn.setOnClickListener { grText.text = "Добро пожаловать!" }
        countBtn.setOnClickListener {
            countText.text = "На кнопку я нажал ${++counter} раз"
        }
        homaBtn.setOnClickListener {
            image.text = "На мем нажал я  ${++homaCounter} раз"
        }
    }
}