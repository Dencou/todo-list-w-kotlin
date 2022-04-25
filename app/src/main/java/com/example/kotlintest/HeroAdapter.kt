package com.example.kotlintest

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*

class HeroAdapter(val superHero:List<SuperHero>):RecyclerView.Adapter<HeroAdapter.HeroHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return HeroHolder(layoutInflater.inflate(R.layout.recyclerview_item_row, parent, false))
    }

    override fun onBindViewHolder(holder: HeroHolder, position: Int) {
        holder.render(superHero[position])

    }


    override fun getItemCount():Int = superHero.size

    class HeroHolder(val view: View):RecyclerView.ViewHolder(view){
        fun render(superHero:SuperHero){
            view.task.text = superHero.task
        }

    }

}