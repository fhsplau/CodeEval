package com.codeeval.easy.fibonacciseries

object FibonacciSeries {

  type Fib = Int => Int

  var fibDict = Map(0 -> 0, 1 -> 1)

  private def f: Fib = (n: Int) => {

    def fibImpl(v: Int): Int = if (v > n) fibDict(v - 1)
    else {
      fibDict += (v -> (fibDict(v - 1) + fibDict(v - 2)))
      fibImpl(v + 1)
    }

    if (n == 0 || n == 1) fibDict(n) else fibImpl(2)
  }

  private def getFib(i: Int): Option[Int] = {
    try{
      Some(fibDict(i))
    } catch {
      case e: NoSuchElementException => None
    }
  }

  def fib(n: Int): Int = getFib(n) match {
    case Some(i) => println("In Dict"); i
    case None => f(n)
  }
}
