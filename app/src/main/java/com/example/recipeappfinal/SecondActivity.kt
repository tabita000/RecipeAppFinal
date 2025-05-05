package com.example.recipeappfinal

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val imageView = findViewById<ImageView>(R.id.imageViewRecipe)
        val textView = findViewById<TextView>(R.id.textViewRecipeName)

        val recipeName = intent.getStringExtra("recipeName")
        val recipeImage = intent.getIntExtra("recipeImage", 0)

        val backButton = findViewById<Button>(R.id.buttonBack)
        backButton.setOnClickListener {
            finish() //GO BACK TO PREVI SCRN
        }


        textView.text = recipeName
        imageView.setImageResource(recipeImage)


    }
}