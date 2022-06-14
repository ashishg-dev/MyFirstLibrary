package com.devashish.myfirstlibrary

import android.content.Context
import androidx.lifecycle.MutableLiveData
import com.devashish.myfirstlibrary.retorfit.Request
import com.devashish.myfirstlibrary.viewmodel.TestViewModel
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class Calculate(private val context: Context) : KoinComponent {


    private val testViewModel: TestViewModel by inject()

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

    fun test(name: String): MutableLiveData<String> {
        return testViewModel.getData(Request(name))
    }

}