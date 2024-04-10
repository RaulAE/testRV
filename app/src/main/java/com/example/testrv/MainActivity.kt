package com.example.testrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.testrv.adapter.MyAdapter
import com.example.testrv.models.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
//        recyclerView.layoutManager = gridLayoutManager
        recyclerView.layoutManager = staggered
        recyclerView.setHasFixedSize(true)

        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }


    private fun setupData(): ArrayList<MyModel>{
        val items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.dovah,"My parakeet"))
        items.add(MyModel(R.drawable.pepper,"Melanistic Parakeet"))
        items.add(MyModel(R.drawable.dovaholdcage,"Dovah in his old cage"))
        items.add(MyModel(R.drawable.pepperdovah,"Both my Birds"))
        items.add(MyModel(R.drawable.pepperoldcage,"Pepper in her old cage"))

        items.add(MyModel(R.drawable.coffebag,"A bag of Coffee"))
        items.add(MyModel(R.drawable.coffeeshop,"A coffee shop"))
        items.add(MyModel(R.drawable.cupcoffee,"A simple cup of coffee"))
        items.add(MyModel(R.drawable.blackcoffee,"Coffee without sugar"))
        items.add(MyModel(R.drawable.icecoffee,"Iced Coffee"))

        items.add(MyModel(R.drawable.lattecoffee,"Fancy Coffee"))
        items.add(MyModel(R.drawable.simplelatte,"A simpler fancy coffee"))
        items.add(MyModel(R.drawable.mug,"A mug"))
        items.add(MyModel(R.drawable.coasters,"A set of coasters"))
        items.add(MyModel(R.drawable.perch,"A perch holding parakeets"))

        items.add(MyModel(R.drawable.macroon,"A macaroon"))
        items.add(MyModel(R.drawable.donuts,"Donuts"))
        items.add(MyModel(R.drawable.cupcake,"A cupcake"))
        items.add(MyModel(R.drawable.travelcups,"Coffee to go"))
        items.add(MyModel(R.drawable.croissant,"A croissant"))

        items.add(MyModel(R.drawable.plant1,"A potted plant"))
        items.add(MyModel(R.drawable.plant2,"More plants"))
        items.add(MyModel(R.drawable.plant3,"Even more plants"))
        items.add(MyModel(R.drawable.dovahoneleg,"Dovah standing on one leg"))
        items.add(MyModel(R.drawable.dovahstare,"Dovah looking at me"))

        return items
    }
}