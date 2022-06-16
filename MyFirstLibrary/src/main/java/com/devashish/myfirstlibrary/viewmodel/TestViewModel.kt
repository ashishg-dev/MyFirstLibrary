package com.devashish.myfirstlibrary.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devashish.myfirstlibrary.repository.TestRepository
import com.devashish.myfirstlibrary.retorfit.Request
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

class TestViewModel(private val repository: TestRepository) : ViewModel() {

    var observer = MutableLiveData<String>()

    fun getData(request: Request): MutableLiveData<String> {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = repository.getData(request)
                observer.postValue(response.name)
            } catch (e: Exception) {
                observer.postValue(e.message.toString())
            }
        }

        return observer

    }

    fun getFact(): MutableLiveData<String> {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = repository.getDataFact()
                observer.postValue(response.fact)
            } catch (e: Exception) {
                observer.postValue(e.message.toString())
            }
        }

        return observer

    }
}