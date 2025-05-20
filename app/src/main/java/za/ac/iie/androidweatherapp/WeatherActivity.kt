package za.ac.iie.androidweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android. widget.Button
import android.widget.TextView
import android.content.Intent

class WeatherActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather)

        val days = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
        val maxTemps = arrayOf(25, 29, 22, 24, 20, 18, 16)
        val conditions = arrayOf("sunny", "Rainy", "Cloudy", "Sunny", "Stormy", "Windy", "Clear")

        val weatherText: TextView = findViewById(R.id.weatherText)
        var output = ""
        var totalTemp = 0

        for (i in days.indices) {
            output += "${days[i]}: ${maxTemps[i]}°C\n - ${conditions[i]}\n"
            totalTemp += maxTemps[i]

        }

        val averageTemp = totalTemp / days.size
        output += "\nAverage Max Temperature: $averageTemp°C"

        weatherText.text = output

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        val editButton: Button = findViewById(R.id.editButton)
        editButton.setOnClickListener {
            val intent = Intent(this, EditActivity::class.java)
            startActivity(intent)
        }


    }

}