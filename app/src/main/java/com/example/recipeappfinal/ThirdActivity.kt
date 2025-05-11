package com.example.recipeappfinal
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val checkBox = findViewById<CheckBox>(R.id.checkBoxMakeAgain)
        val editText = findViewById<EditText>(R.id.editTextComment)
        val submitButton = findViewById<Button>(R.id.buttonSubmit)

        val backButton = findViewById<Button>(R.id.buttonBackThird)
        backButton.setOnClickListener {
            finish() // return to second scrn
        }

        submitButton.setOnClickListener {
            val selectedRadioId = radioGroup.checkedRadioButtonId

            if (selectedRadioId == -1) {
                Toast.makeText(this, "Please select a rating!", Toast.LENGTH_SHORT).show()
            } else {
                val radioButton = findViewById<RadioButton>(selectedRadioId)
                radioButton.text.toString()
                if (checkBox.isChecked) "Yes" else "No"
                editText.text.toString()

                Toast.makeText(this, "Thank you for your feedback!", Toast.LENGTH_SHORT).show()

            }
        }

    }
}