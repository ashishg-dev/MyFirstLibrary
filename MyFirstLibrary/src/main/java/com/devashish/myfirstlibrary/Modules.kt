package com.devashish.myfirstlibrary

import com.devashish.myfirstlibrary.repository.TestRepository
import com.devashish.myfirstlibrary.retorfit.provideApiService
import com.devashish.myfirstlibrary.retorfit.provideOkHttpClient
import com.devashish.myfirstlibrary.retorfit.provideRetrofit
import com.devashish.myfirstlibrary.viewmodel.TestViewModel
import org.koin.dsl.module

val networkModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get()) }
    single { provideApiService(get()) }
}

val testModule = module {
    single { TestRepository(get()) }
    factory { TestViewModel(get()) }
}