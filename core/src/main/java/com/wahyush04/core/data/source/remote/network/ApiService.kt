package com.wahyush04.core.data.source.remote.network

import com.wahyush04.core.data.source.remote.response.ListNewsResponse
import retrofit2.http.GET

interface ApiService {

    @GET("search?q=android&token=2bf4768668d0c1b52884741695e57f51&lang=en")
    suspend fun getGnewsAndroid(): ListNewsResponse
}