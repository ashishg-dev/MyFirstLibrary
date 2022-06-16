package com.devashish.myfirstlibrary

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.devashish.myfirstlibrary.retorfit.Request
import com.devashish.myfirstlibrary.viewmodel.TestViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Calculate(private val context: ViewModelStoreOwner) : KoinComponent {

//    private val testViewModel by lazy {
//        ViewModelProvider(context).get(TestViewModel::class.java)
//    }

    private val viewModel: TestViewModel by inject()

    companion object {

        fun add(num1: Int, num2: Int) = num1 + num2
        fun add(num1: Float, num2: Float) = num1 + num2
        fun add(num1: Float, num2: Int) = num1 + num2
        fun add(num1: Int, num2: Float) = num1 + num2

        fun subtract(num1: Int, num2: Int) = num1 - num2
        fun subtract(num1: Float, num2: Float) = num1 - num2
        fun subtract(num1: Float, num2: Int) = num1 - num2
        fun subtract(num1: Int, num2: Float) = num1 - num2

        fun multiply(num1: Int, num2: Int) = num1 * num2
        fun multiply(num1: Float, num2: Float) = num1 * num2
        fun multiply(num1: Float, num2: Int) = num1 * num2
        fun multiply(num1: Int, num2: Float) = num1 * num2

        @Throws(ArithmeticException::class)
        fun divide(num1: Int, num2: Int): Int {
            checkDivideByZero(num2)
            return num1 / num2
        }

        @Throws(ArithmeticException::class)
        fun divide(num1: Float, num2: Float): Float {
            checkDivideByZero(num2)
            return num1 / num2
        }

        @Throws(ArithmeticException::class)
        fun divide(num1: Float, num2: Int): Float {
            checkDivideByZero(num2)
            return num1 / num2
        }

        @Throws(ArithmeticException::class)
        fun divide(num1: Int, num2: Float): Float {
            checkDivideByZero(num2)
            return num1 / num2
        }


        private fun checkDivideByZero(num2: Int) {
            if (num2 == 0) {
                throw ArithmeticException("Undefined: cannot divide by 0")
            }
        }

        private fun checkDivideByZero(num2: Float) {
            if (num2 == 0f) {
                throw ArithmeticException("Undefined: cannot divide by 0")
            }
        }


    }

//    fun test(name: String): MutableLiveData<String> {
//        return testViewModel.getData(Request(name))
//    }

    fun test1(name: String): MutableLiveData<String> {
        return viewModel.getData(Request(name))
    }

    fun fact(): MutableLiveData<String> {
        return viewModel.getFact()
    }

//    fun fact(): MutableLiveData<String> {
//        return testViewModel.getFact()
//    }

}