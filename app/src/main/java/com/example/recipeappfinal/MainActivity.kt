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
        items.add(MyModel(R.drawable.biryani, "Rice"))
        items.add(MyModel(R.drawable.lasagna, "Lasagna"))
        // Add more here
        return items
    }
}
