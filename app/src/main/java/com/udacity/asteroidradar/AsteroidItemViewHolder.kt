package com.udacity.asteroidradar

import android.view.View
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.udacity.asteroidradar.databinding.AsteroidItemBinding
import com.udacity.asteroidradar.main.MainFragmentDirections

class AsteroidItemViewHolder(val itemBinding: AsteroidItemBinding) :
    RecyclerView.ViewHolder(itemBinding.root) {
    fun bind(item: Asteroid) {
        itemBinding.textCodeName.text = item.codename
        itemBinding.dayText.text = item.closeApproachDate
        itemBinding.iconImage.let {
            if (item.isPotentiallyHazardous) {
                it.setImageResource(R.drawable.ic_status_potentially_hazardous)
                it.contentDescription = "Potentially Hazardous"
            } else {
                it.setImageResource(R.drawable.ic_status_normal)
                it.contentDescription = "Normal Status"
            }
        }
        itemBinding.itemElement.setOnClickListener { v: View ->
            run {
                v.findNavController().navigate(MainFragmentDirections.actionShowDetail(item))
            }
        }
    }
}