package com.example.submissionandroidpemula

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListRumahSakitAdapter(private val listRs: ArrayList<RumahSakit>) : RecyclerView.Adapter<ListRumahSakitAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvAlamat: TextView = itemView.findViewById(R.id.tv_item_alamat)
        var tvTelepon: TextView = itemView.findViewById(R.id.tv_item_telepon)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_rs, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listRs.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val rs = listRs[position]

        Glide.with(holder.itemView.context)
            .load(rs.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = rs.nama
        holder.tvAlamat.text = rs.alamat
        holder.tvTelepon.text = rs.telepon

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(rs, position) }
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: RumahSakit, position: Int)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }
}