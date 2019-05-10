package fr.evrard.listapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.evrard.listapp.model.MDIcon

class RecyclerViewApp : AppCompatActivity() {
    // var mdArray = mutableListOf<MDIcon>()
    var mdArray = ArrayList<MDIcon>(9)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_app)
        seedItems()
    }

    private fun seedItems() {
        val nameArray = resources.getStringArray(R.array.mdNameArray)
        for (name in nameArray) {
            mdArray.add(MDIcon(name))
        }
    }
}
