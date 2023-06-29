package com.example.a1homework6kotlinfragments

import java.io.Serializable

data class Songs(
    var imageId : Int=0,
    var songName : String? = "Unknown Song",
    var singerName: String? = "Unknown Singer",

): Serializable
