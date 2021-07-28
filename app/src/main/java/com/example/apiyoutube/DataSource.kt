package com.example.apiyoutube

import com.example.apiyoutube.models.Playlist

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<Playlist>{
            val list = ArrayList<Playlist>()
            list.add(
                Playlist(
                    "Michael Jackson - Beat It (Official Video)",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/oRdxUFDoQe0/hqdefault.jpg",
                    "https://www.youtube.com/watch?v=oRdxUFDoQe0"
                )
            )
            list.add(
                Playlist(
                    "Michael Jackson - Smooth Criminal",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/h_D3VFfhvs4/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=sFvENQBc-F8&list=PLDAF4A641B8857DFA&index=10"
                )
            )
            list.add(
                Playlist(
                    "Michael Jackson - Billie Jean (Official Video)",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/Zi_XLOBDo_Y/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=Zi_XLOBDo_Y&list=PL135553AD7F1D0ABF&index=1"
                )
            )
            list.add(
                Playlist(
                    "Michael Jackson - Thriller (Official Video)",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/sOnqjkJTMaA/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=sOnqjkJTMaA&list=PL135553AD7F1D0ABF&index=3"
                )
            )
            list.add(
                Playlist(
                    "Michael Jackson - Don’t Stop 'Til You Get Enough (Official Video)",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/yURRmWtbTbo/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=yURRmWtbTbo&list=PLE1F27AEE770AD638&index=1"
                )
            )
            list.add(
                Playlist(
                    "Michael Jackson - Black Or White (Official Video - Shortened Version)",
                    "Michael Jackson",
                    "https://i3.ytimg.com/vi/pTFE8cirkdQ/maxresdefault.jpg",
                    "https://www.youtube.com/watch?v=F2AitTPI5U0"
                )
            )
            return list
        }

    }
}