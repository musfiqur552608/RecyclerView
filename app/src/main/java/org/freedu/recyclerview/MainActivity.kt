package org.freedu.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.freedu.recyclerview.adapter.CountryAdapter
import org.freedu.recyclerview.model.CountryModel

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val country = ArrayList<CountryModel>()

        for(i in 1..20){
            country.add(CountryModel("Bangladesh", "Dhaka is the capital of Bangladesh", R.string.bangladesh, R.drawable.bangladesh))
        }

        recyclerView.adapter = CountryAdapter(country)

    }
}