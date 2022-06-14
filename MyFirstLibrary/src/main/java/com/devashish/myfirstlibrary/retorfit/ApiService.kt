package com.devashish.myfirstlibrary.retorfit

import com.google.gson.annotations.SerializedName
import retrofit2.http.*

interface ApiService {

    @POST("/cloner")
    suspend fun test(
        @Header("Content-Type") content_type: String,
        @Body jsonObject: Request
    ): Response

}

data class Request(
    @SerializedName("name") val name: String
)

data class Response(
    @SerializedName("name") val name: String
)