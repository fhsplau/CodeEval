package com.codeeval.easy.oddnumbers

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.oddnumbers.OddNumbers._

@RunWith(classOf[JUnitRunner])
class OddNumbersTest extends FunSuite {

  test("is odd") {
    assert(3.isOdd === true)
    assert(4.isOdd === false)
  }

  test("is even") {
    assert(4.isEven === true)
    assert(3.isEven === false)
  }

  test("odd numbers from 1 to 99"){
    assert(oddNumbers === List(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21,
      23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51,
      53, 55, 57, 59, 61, 63, 65, 67, 69, 71, 73, 75, 77, 79, 81,
      83, 85, 87, 89, 91, 93, 95, 97, 99))
  }

}
