package com.example.recipeappfinal

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeappfinal.adapter.MyAdapter
import com.example.recipeappfinal.model.MyModel

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(this, 3)
        recyclerView.layoutManager = gridLayoutManager
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(this, arrayList)
        recyclerView.adapter = thisAdapter
    }

    private fun setupData(): ArrayList<MyModel> {
        val items = ArrayList<MyModel>()
        items.add(MyModel(R.drawable.biryani, "Biryani"))
        items.add(MyModel(R.drawable.lasagna, "Lasagna"))
        items.add(MyModel(R.drawable.tika, "Tika"))
        items.add(MyModel(R.drawable.naan, "Naan"))
        items.add(MyModel(R.drawable.nihari, "Nihaari"))
        items.add(MyModel(R.drawable.steak, "Steak"))
        items.add(MyModel(R.drawable.seekhkabab, "Seekh kebab"))
        items.add(MyModel(R.drawable.salmonsalad, "Salmon Salad"))
        items.add(MyModel(R.drawable.ramen, "Beef Ramen"))
        items.add(MyModel(R.drawable.paratha, "Paratha"))
        items.add(MyModel(R.drawable.mongolianbeef, "Mongolian Beef"))
        items.add(MyModel(R.drawable.macncheese, "Mac n Cheese"))
        items.add(MyModel(R.drawable.lomein, "Lomein"))
        items.add(MyModel(R.drawable.kimchisalad, "Kimchi Salad"))
        items.add(MyModel(R.drawable.karahi, "Chicken Karahi"))
        items.add(MyModel(R.drawable.kachori, "Kachori"))
        items.add(MyModel(R.drawable.haleem, "Haleem"))
        items.add(MyModel(R.drawable.gyoza, "Gyoza"))
        items.add(MyModel(R.drawable.chpal, "Chapal kebab"))
        items.add(MyModel(R.drawable.chillicheese, "Chilli Cheese"))
        items.add(MyModel(R.drawable.gimbap, "Gimbap"))
        items.add(MyModel(R.drawable.dumplings, "Dumplings"))

        // Add more here
        return items
    }
}
