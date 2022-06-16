package com.devashish.myfirstlibrary.retorfit

import com.google.gson.annotations.SerializedName
import retrofit2.http.*

interface ApiService {

    @POST("/clone")
    suspend fun test(
        @Header("Content-Type") content_type: String,
        @Body jsonObject: Request
    ): Response

    @GET("/fact")
    suspend fun fact(
        @Header("Content-Type") content_type: String
    ): Response1

}

data class Request(
    @SerializedName("name") val name: String
)

data class Response(
    @SerializedName("name") val name: String
)

data class Response1(
    @SerializedName("fact") val fact: String,
    @SerializedName("length") val length: String
)