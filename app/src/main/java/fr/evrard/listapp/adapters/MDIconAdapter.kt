package fr.evrard.listapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import fr.evrard.listapp.R
import fr.evrard.listapp.model.MDIcon
import kotlinx.android.synthetic.main.item_mdicon.view.*

class MDIconAdapter(var items: ArrayList<MDIcon>) :
    RecyclerView.Adapter<MDIconAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.inflate(R.layout.item_mdicon))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindMDIcon(items[position])
    }

    class ViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        fun bindMDIcon(mdIcon: MDIcon) {
            itemView.mdIcName.text = mdIcon.name
        }

    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }

}