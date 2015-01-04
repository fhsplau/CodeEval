package com.codeeval.easy.sumOfPrimes

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SumOfPrimesTest extends FunSuite with BeforeAndAfter{
  var sum: SumOfPrimes = _
  before {
    sum = new SumOfPrimes
  }

  test("sum of first 1000 primes is equal to 3682913") {
    assert(sum.sumPrimes === 3682913)
  }

}
