package km.company.com.androiddevkit.kotlin.recyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import km.company.com.androiddevkit.R
import kotlinx.android.synthetic.main.item_recyclerview.view.*

class RecyclerViewAdapter(val context: Context, val modelList: ArrayList<RecyclerViewModel>) : RecyclerView.Adapter<RecyclerViewAdapter.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recyclerview, parent, false)

        return Holder(view)
    }

    override fun getItemCount(): Int {
        return modelList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(modelList[position], context)
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind (recyclerViewModel: RecyclerViewModel, context: Context) {
            itemView.item_recyclerview_image.setImageResource(R.drawable.anchovy)
            itemView.item_recyclerview_title.text = recyclerViewModel.title
        }
    }
}