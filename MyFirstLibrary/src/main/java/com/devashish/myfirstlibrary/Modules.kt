package com.devashish.myfirstlibrary

import com.devashish.myfirstlibrary.retorfit.provideApiService
import com.devashish.myfirstlibrary.retorfit.provideOkHttpClient
import com.devashish.myfirstlibrary.retorfit.provideRetrofit
import org.koin.dsl.module

val networkModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    single { provideApiService(get()) }
}