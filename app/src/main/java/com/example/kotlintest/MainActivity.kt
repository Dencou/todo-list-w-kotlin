package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.BaseTransientBottomBar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recyclerview_item_row.*


class MainActivity : AppCompatActivity() {

    val superHeroes:MutableList<SuperHero> = mutableListOf(
        SuperHero("juan"),
        SuperHero("supeman"),
        SuperHero("supeman"),
        SuperHero("supeman"),
        SuperHero("asd")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()

        var a = etTodo.text

        addbtn.setOnClickListener {
            superHeroes.add(SuperHero(a.toString()))

            Snackbar.make(
                findViewById(R.id.textview),
                "Task Added Successfully",
                BaseTransientBottomBar.LENGTH_SHORT
            ).show()

        }

    }

    fun initRecycler(){
        recyclerview.layoutManager = LinearLayoutManager(this)
        val adapter = HeroAdapter(superHeroes)
        recyclerview.adapter = adapter
    }



}