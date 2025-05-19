package za.ac.iie.androidweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android. widget.Button
import android.widget.TextView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val welcomeText: TextView = findViewById(R.id.welcomeText)
        welcomeText.text = "Welcome to SimpleWeather"

        val developerInfo: TextView = findViewById(R.id.developerInfo)
        developerInfo.text = "Mekhi Losper - ST10465811"

        val nextButton: Button = findViewById(R.id.nextButton)
        nextButton.setOnClickListener{
            val intent = Intent(this, WeatherActivity::class.java)
            startActivity(intent)
        }

        val logoImage: ImageView = findViewById(R.id.logoImage)

    }
}