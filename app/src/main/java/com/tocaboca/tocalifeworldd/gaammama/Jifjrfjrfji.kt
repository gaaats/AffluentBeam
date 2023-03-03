package com.tocaboca.tocalifeworldd.gaammama

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.tocaboca.tocalifeworldd.R
import com.tocaboca.tocalifeworldd.databinding.ElelelelleBinding


class Jifjrfjrfji :
    ListAdapter<OKfoorfkorfkfr, Jifjrfjrfji.Skoojfrijrjf>(KOkrfoor()) {


    class Skoojfrijrjf(view: View) : RecyclerView.ViewHolder(view) {
        val hy95hy5hy = ElelelelleBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Skoojfrijrjf {
        LayoutInflater.from(parent.context)
            .inflate(R.layout.elelelelle, parent, false).also {
                return Skoojfrijrjf(it)
            }
    }

    override fun onBindViewHolder(holder: Skoojfrijrjf, position: Int) {
        getItem(position).also {
            holder.hy95hy5hy.imgOnSingleItem.setImageResource(it.hy59hy59hy59hy)
        }

    }
}

