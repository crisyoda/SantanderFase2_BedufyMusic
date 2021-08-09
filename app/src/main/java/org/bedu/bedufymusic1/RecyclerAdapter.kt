package org.bedu.bedufymusic1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter (val songs : List<Song>) :
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        private val name = view.findViewById<TextView>(R.id.nombreCancion)
        private val time = view.findViewById<TextView>(R.id.timelong)

        fun bind(song: Song){
            name.text = song.nameSong
            time.text = song.duracion
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_song, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val songs = songs[position]
        holder.bind(songs)
    }

    override fun getItemCount(): Int {
        return songs.size
    }
}