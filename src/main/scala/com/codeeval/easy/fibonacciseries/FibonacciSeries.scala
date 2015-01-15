package com.codeeval.easy.fibonacciseries

object FibonacciSeries {

  type Fib = Int => Int

  var fibDict = scala.collection.mutable.Map(0 -> 0, 1 -> 1)

  def fib: Fib = { (n: Int) =>
    def fImpl(v: Int): Int = getFib(v) match {
      case Some(i) => i
      case None =>
        fibDict += (v -> (fImpl(v - 1) + fImpl(v - 2)))
        fibDict(v)
    }

    def getFib(i: Int): Option[Int] = {
      try {
        Some(fibDict(i))
      } catch {
        case e: NoSuchElementException => None
      }
    }

    fImpl(n)
  }
}
