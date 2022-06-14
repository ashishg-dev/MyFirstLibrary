package com.devashish.myfirstlibrary

class Calculate {

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

}