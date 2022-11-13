package com.wahyush04.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class ListNewsResponse (
    val totalArticles: Int,
    val articles: List<NewsResponse>
)