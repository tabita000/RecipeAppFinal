package com.example.recipeappfinal

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n") //get rid of the warning do not concatenate text display with setText
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

        val buttonNext = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent) //GO TO thirdActivity
        }



        textView.text = recipeName
        imageView.setImageResource(recipeImage)

        val textIngredients = findViewById<TextView>(R.id.textIngredients)
        val textSteps = findViewById<TextView>(R.id.textSteps)

        when (recipeName) {
            "Lasagna" -> {
                textIngredients.text = "• 1 box lasagna noodles\n" +
                        "• 2 cups mozzarella cheese\n" +
                        "• 1 lb ground beef\n" +
                        "• 2 cups marinara sauce\n" +
                        "• 1 cup ricotta cheese\n" +
                        "• 1 egg\n" +
                        "• Italian seasoning, salt, pepper"
                textSteps.text = "1. Boil lasagna noodles\n" +
                        "2. Cook beef with seasoning\n" +
                        "3. Mix ricotta with egg\n" +
                        "4. Layer noodles, sauce, beef, ricotta, and mozzarella\n" +
                        "5. Repeat layers and top with cheese\n" +
                        "6. Bake at 375°F for 25–30 mins"
            }

            "Biryani" -> {
                textIngredients.text = "• 2 cups basmati rice\n" +
                        "• 500g chicken\n" +
                        "• 1 cup yogurt\n" +
                        "• 1 sliced fried onion\n" +
                        "• 2 chopped tomatoes\n" +
                        "• 1 tbsp ginger garlic paste\n" +
                        "• Biryani masala, turmeric, green chilies\n" +
                        "• Mint, coriander, salt, oil"
                textSteps.text = "1. Marinate chicken with yogurt and spices\n" +
                        "2. Cook the marinated chicken\n" +
                        "3. Cook rice with whole spices\n" +
                        "4. Layer rice and chicken\n" +
                        "5. Top with onions and herbs\n" +
                        "6. Steam on low heat for 15 mins"
            }

            "Tika" -> {
                textIngredients.text = "• 500g boneless chicken\n" +
                        "• 1 cup yogurt\n" +
                        "• 1 tbsp ginger garlic paste\n" +
                        "• Tikka masala\n" +
                        "• Lemon juice, oil, salt"
                textSteps.text = "1. Marinate chicken with yogurt, masala, and lemon juice\n" +
                        "2. Let sit for 2–4 hours\n" +
                        "3. Grill or bake at 400°F until cooked and slightly charred"
            }

            "Naan" -> {
                textIngredients.text = "• 2 cups all-purpose flour\n" +
                        "• 1/2 cup yogurt\n" +
                        "• 1 tsp baking powder\n" +
                        "• Water, salt, oil"
                textSteps.text = "1. Mix flour, baking powder, salt, yogurt and knead into dough\n" +
                        "2. Let it rest 1 hour\n" +
                        "3. Roll and cook on hot tawa or pan until bubbles appear\n" +
                        "4. Flip and cook the other side"
            }

            "Nihaari" -> {
                textIngredients.text = "• 500g beef shank\n" +
                        "• 1 onion\n" +
                        "• Ginger garlic paste, nihari masala\n" +
                        "• Ghee, flour, water"
                textSteps.text = "1. Sauté onions, add meat and masala\n" +
                        "2. Add water and slow cook for 2–3 hours\n" +
                        "3. Add flour paste to thicken\n" +
                        "4. Serve with lemon, ginger, and naan"
            }

            "Steak" -> {
                textIngredients.text = "• 1 beef steak\n" +
                        "• Salt, pepper, garlic powder\n" +
                        "• Butter, oil"
                textSteps.text = "1. Season steak on both sides\n" +
                        "2. Sear in hot pan with oil and butter\n" +
                        "3. Cook to desired doneness, let rest before slicing"
            }

            "Seekh kebab" -> {
                textIngredients.text = "• 500g ground beef or chicken\n" +
                        "• Onion, green chili, coriander\n" +
                        "• Seekh kebab masala, salt"
                textSteps.text = "1. Mix all ingredients well\n" +
                        "2. Shape onto skewers\n" +
                        "3. Grill or bake until cooked through"
            }

            "Salmon Salad" -> {
                textIngredients.text = "• Cooked salmon\n" +
                        "• Lettuce, cucumber, tomato\n" +
                        "• Olive oil, lemon juice, salt"
                textSteps.text = "1. Mix veggies and salmon in a bowl\n" +
                        "2. Add dressing and toss well"
            }

            "Beef Ramen" -> {
                textIngredients.text = "• Ramen noodles\n" +
                        "• Sliced beef\n" +
                        "• Soy sauce, garlic, egg, green onion"
                textSteps.text = "1. Cook beef with garlic and soy sauce\n" +
                        "2. Boil noodles and egg\n" +
                        "3. Add beef and garnish with green onion"
            }

            "Paratha" -> {
                textIngredients.text = "• 2 cups wheat flour\n" +
                        "• Water, salt, oil or ghee"
                textSteps.text = "1. Knead flour with water and salt into dough\n" +
                        "2. Roll out and cook on hot pan with oil/ghee\n" +
                        "3. Flip until both sides are golden"
            }

            "Karahi" -> {
                textIngredients.text = "• 500g chicken\n" +
                        "• 2 tomatoes, chopped\n" +
                        "• 1 onion, sliced\n" +
                        "• Ginger garlic paste\n" +
                        "• Red chili powder, garam masala, salt\n" +
                        "• Oil, green chilies"
                textSteps.text = "1. Heat oil, fry onion and garlic paste\n" +
                        "2. Add chicken and cook until it changes color\n" +
                        "3. Add tomatoes and spices, cook till thick\n" +
                        "4. Garnish with green chilies"
            }

            "Mongolian Beef" -> {
                textIngredients.text = "• 300g flank steak, sliced thin\n" +
                        "• 1/2 cup soy sauce\n" +
                        "• 1/4 cup brown sugar\n" +
                        "• Garlic, cornstarch, oil"
                textSteps.text = "1. Coat steak in cornstarch and fry\n" +
                        "2. Cook garlic, soy sauce, and sugar to make sauce\n" +
                        "3. Toss fried steak in sauce until coated"
            }

            "Mac n Cheese" -> {
                textIngredients.text = "• 2 cups elbow pasta\n" +
                        "• 2 cups cheddar cheese\n" +
                        "• 2 tbsp butter\n" +
                        "• 2 tbsp flour\n" +
                        "• 1.5 cups milk, salt, pepper"
                textSteps.text = "1. Boil pasta\n" +
                        "2. Make cheese sauce by combining butter, flour, milk, and cheese\n" +
                        "3. Mix pasta with sauce and serve warm"
            }

            "Lomein" -> {
                textIngredients.text = "• 1 pack lo mein noodles\n" +
                        "• Carrots, bell peppers, cabbage\n" +
                        "• Soy sauce, garlic, sesame oil"
                textSteps.text = "1. Cook noodles\n" +
                        "2. Stir-fry veggies with garlic\n" +
                        "3. Add noodles and sauces, toss everything together"
            }

            "Kimchi Salad" -> {
                textIngredients.text = "• 1 cup chopped kimchi\n" +
                        "• Green onions, sesame seeds\n" +
                        "• Soy sauce, vinegar, sugar, sesame oil"
                textSteps.text = "1. Mix kimchi and green onions\n" +
                        "2. Add all dressing ingredients\n" +
                        "3. Toss and serve chilled"
            }

            "Kachori" -> {
                textIngredients.text = "• 1 cup all-purpose flour\n" +
                        "• 1/2 cup moong dal (boiled)\n" +
                        "• Spices: cumin, garam masala, salt\n" +
                        "• Water, oil for frying"
                textSteps.text = "1. Make stiff dough with flour and water\n" +
                        "2. Mix boiled dal with spices for filling\n" +
                        "3. Stuff dough balls with filling, flatten, and deep fry"
            }

            "Haleem" -> {
                textIngredients.text = "• 1 cup broken wheat\n" +
                        "• 300g meat (beef or chicken)\n" +
                        "• 1/2 cup lentils (mixed)\n" +
                        "• Onions, garlic, spices, ghee"
                textSteps.text = "1. Boil lentils, wheat, and meat separately\n" +
                        "2. Blend everything together\n" +
                        "3. Cook with fried onions, spices, and ghee until thick"
            }

            "Gyoza" -> {
                textIngredients.text = "• Gyoza wrappers\n" +
                        "• Ground chicken or pork\n" +
                        "• Cabbage, green onion, garlic\n" +
                        "• Soy sauce, sesame oil"
                textSteps.text = "1. Mix filling ingredients\n" +
                        "2. Place spoonful into wrapper, fold and seal\n" +
                        "3. Pan-fry bottoms, then steam until fully cooked"
            }

            "Chapal kebab" -> {
                textIngredients.text = "• 500g ground beef\n" +
                        "• Onion, tomato, green chilies\n" +
                        "• Crushed coriander, salt, egg\n" +
                        "• Gram flour (besan)"
                textSteps.text = "1. Mix all ingredients\n" +
                        "2. Shape into flat patties\n" +
                        "3. Shallow fry until golden and cooked"
            }

            "Chilli Cheese" -> {
                textIngredients.text = "• 1 cup grated cheese\n" +
                        "• Green chilies, onion\n" +
                        "• Butter, spices"
                textSteps.text = "1. Melt butter, sauté onion and chilies\n" +
                        "2. Add cheese and cook until melted\n" +
                        "3. Serve hot with bread or chips"
            }

            "Gimbap" -> {
                textIngredients.text = "• Cooked rice\n" +
                        "• Seaweed sheets (nori)\n" +
                        "• Veggies (carrot, cucumber), egg\n" +
                        "• Cooked meat or imitation crab"
                textSteps.text = "1. Spread rice on seaweed sheet\n" +
                        "2. Add fillings in the center\n" +
                        "3. Roll tightly and slice into pieces"
            }

            "Dumplings" -> {
                textIngredients.text = "• Dumpling wrappers\n" +
                        "• Ground chicken or veggies\n" +
                        "• Garlic, ginger, soy sauce"
                textSteps.text = "1. Mix filling ingredients\n" +
                        "2. Fill wrappers and fold into half-moons\n" +
                        "3. Steam, boil, or pan-fry as preferred"
            }

            "Chicken Karahi" -> {
                textIngredients.text = "• 500g chicken\n" +
                        "• 2 chopped tomatoes\n" +
                        "• 1 sliced onion\n" +
                        "• 1 tbsp ginger garlic paste\n" +
                        "• Red chili powder, turmeric, salt\n" +
                        "• Oil, green chilies, coriander"
                textSteps.text = "1. Heat oil, sauté onions and ginger garlic paste\n" +
                        "2. Add chicken and cook until white\n" +
                        "3. Add tomatoes and spices, cook until soft\n" +
                        "4. Fry until oil separates\n" +
                        "5. Garnish with green chilies and coriander"
            }


        }
    }
}