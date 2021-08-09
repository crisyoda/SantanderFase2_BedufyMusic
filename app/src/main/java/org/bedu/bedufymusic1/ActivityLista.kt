package org.bedu.bedufymusic1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView

class activity_lista : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        val recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = RecyclerAdapter(listOf(
            Song("Symphony No.1 Do", duracion = "1:30") ,
            Song("Symphony No.2 Re ", duracion = "2:31"),
            Song("Symphony No.3 Mi ", duracion = "3:32"),
            Song("Symphony No.4 Fa", duracion = "4:33") ,
            Song("Symphony No.5 Sol ", duracion = "5:34"),
            Song("Symphony No.6 La ", duracion = "6:45"),
            Song("Symphony No.7 Si ", duracion = "7:36"),
            ))
    }}