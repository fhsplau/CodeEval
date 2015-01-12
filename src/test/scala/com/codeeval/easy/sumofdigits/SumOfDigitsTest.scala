package com.codeeval.easy.sumofdigits

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.sumofdigits.SumOfDigits._

@RunWith(classOf[JUnitRunner])
class SumOfDigitsTest extends FunSuite {
  test("sum of digits") {
    assert(sum(23) == 5)
  }
}
