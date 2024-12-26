package com.donkor.mvvm.sample.repository

import com.donkor.mvvm.sample.repository.data.HomeListData
import retrofit2.http.GET
import com.zoe.wan.android.http.ApiAddress.Article_List
import com.zoe.wan.android.http.BaseResponse
import retrofit2.http.Path

interface ApiService {
    @GET("$Article_List{pageCount}/json")
    suspend fun homeList(@Path("pageCount") pageCount: String): BaseResponse<HomeListData?>?
}