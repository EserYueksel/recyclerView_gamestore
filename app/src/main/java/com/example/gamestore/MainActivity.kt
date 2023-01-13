package com.example.gamestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.gamestore.adapter.CategoryAdapter
import com.example.gamestore.data.Datasource
import com.example.gamestore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val datasource = Datasource()
        val categoryList = datasource.getGames()

        binding.categoryRecycler.adapter = CategoryAdapter(categoryList)
    }
}