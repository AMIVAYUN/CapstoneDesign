package com.example.capstona_a.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Ingame(
    @SerializedName("status")
    @Expose
    private val status: Int? = null,

    @SerializedName("gameMode")
    @Expose
    private val gameMode: String? = null,

    @SerializedName("gameType")
    @Expose
    private val gameType: String? = null,

    @SerializedName("players")
    @Expose
    private val players: List<Player>? = null,
)