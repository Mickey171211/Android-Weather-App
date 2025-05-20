package za.ac.iie.androidweatherapp

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        val submitButton: Button = findViewById(R.id.submitButton)
        val inputTemp: EditText = findViewById(R.id.inputTemp)

        submitButton.setOnClickListener {
            val tempInput = inputTemp.text.toString()
            if (tempInput.isNotEmpty()) {
                Toast.makeText(this, "Temperature update to $tempInput°C", Toast.LENGTH_SHORT).show()
                finish()
            }else {
                Toast.makeText(this, "Please enter a valid temperature", Toast.LENGTH_SHORT).show()
            }
        }

    }
}