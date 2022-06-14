package com.devashish.myfirstlibrary.repository

import com.devashish.myfirstlibrary.constants.ConstantKey
import com.devashish.myfirstlibrary.retorfit.ApiService
import com.devashish.myfirstlibrary.retorfit.Request
import com.devashish.myfirstlibrary.retorfit.Response

class TestRepository(private val apiService: ApiService) {

    suspend fun getData(request: Request): Response {
        return apiService.test(ConstantKey.Content_Type, request)
    }

}