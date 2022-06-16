package com.devashish.myfirstlibrary.repository

import com.devashish.myfirstlibrary.constants.ConstantKey
import com.devashish.myfirstlibrary.retorfit.*

class TestRepository(private val apiService: ApiService) {

    suspend fun getData(request: Request): Response {
        return apiService.test(ConstantKey.Content_Type, request)
    }

    suspend fun getDataFact(): Response1 {
        return apiService.fact(ConstantKey.Content_Type)
    }

}