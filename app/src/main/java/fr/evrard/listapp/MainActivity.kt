package fr.evrard.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val nameArray by lazy { resources.getStringArray(R.array.nameArray) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainList.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nameArray)
    }

}
