package com.codeeval.easy.fibonacciseries

object FibonacciSeries {

  def fib(n: Int): Int = {
    var fibDict = Map(0 -> 0, 1 -> 1)

    def fibImpl(v: Int): Int = if (v > n) fibDict(v - 1)
    else {
      fibDict += (v -> (fibDict(v - 1) + fibDict(v - 2)))
      fibImpl(v + 1)
    }

    if (n == 0 || n == 1) fibDict(n) else fibImpl(2)
  }

}
