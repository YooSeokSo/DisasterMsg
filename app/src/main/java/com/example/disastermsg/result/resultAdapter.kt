package com.example.disastermsg.result

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disastermsg.R

class ResultAdapter(private var data: Array<String>) : RecyclerView.Adapter<ResultViewHolder>() {
    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResultViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ResultViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResultViewHolder, position: Int) {
        holder.list_user
    }

    companion object {
        var list_user: ArrayList<ResultViewHolder.user> = ArrayList()
    }
}
class ResultViewHolder {
    var listItem = R.id.txt_local
}
