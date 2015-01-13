package com.codeeval.easy.fibonacciseries

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.fibonacciseries.FibonacciSeries._

@RunWith(classOf[JUnitRunner])
class FibonacciSeriesTest extends FunSuite {

  test("Fibonacci series") {
    assert(fib(5) === 5)
    assert(fib(12) === 144)
    assert(fib(0) === 0)
    assert(fib(1) === 1)
  }

}
