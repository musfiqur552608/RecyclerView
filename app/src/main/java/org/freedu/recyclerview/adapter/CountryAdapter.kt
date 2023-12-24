package org.freedu.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView
import org.freedu.recyclerview.R
import org.freedu.recyclerview.model.CountryModel

class CountryAdapter(private val countryList:List<CountryModel>):RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.country_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.flag.setImageResource(countryList[position].flagImage)
        holder.name.text = countryList[position].countryName
        holder.details.text = countryList[position].countryDeatails
    }

}
class MyViewHolder(val view: View):RecyclerView.ViewHolder(view){
    val name:TextView = view.findViewById(R.id.countryName)
    val details:TextView = view.findViewById(R.id.countryDetails)
    val flag:CircleImageView = view.findViewById(R.id.flagImage)
}