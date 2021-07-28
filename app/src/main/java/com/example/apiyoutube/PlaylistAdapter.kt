

package com.example.apiyoutube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.apiyoutube.models.Playlist
import kotlinx.android.synthetic.main.res_item_playlist.view.*


class PlaylistAdapter (
    private val onItemClicked: (Playlist) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: List<Playlist> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return PlaylistViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_playlist, parent, false)
        )


    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is PlaylistViewHolder -> {
                holder.bind(items[position], onItemClicked)
            }
        }


    }

    override fun getItemCount(): Int {

        return items.size

    }

    fun setDataSet(playlist: List<Playlist>) {
        this.items = playlist
    }

    class PlaylistViewHolder(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val playListtitle = itemView.title
        private val playListAuthor = itemView.author
        private val playListThumbnail = itemView.thumbnail

        fun bind(playlist: Playlist, onItemClicked: (Playlist) -> Unit) {

            playListtitle.text = playlist.title
            playListAuthor.text = playlist.author

            val requestOptions = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(playlist.thumbnailUrl)
                .into(playListThumbnail)

            itemView.setOnClickListener {
                onItemClicked(playlist)

            }
        }

    }

}