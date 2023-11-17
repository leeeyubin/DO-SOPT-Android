package org.sopt.dosopttemplate.data.service

import org.sopt.dosopttemplate.data.model.response.ResponseFollowerDto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface FollowerService {

    @GET("api/users")
    fun getFollowerList(
        @Query("page") page: Int
    ): Call<ResponseFollowerDto>
}