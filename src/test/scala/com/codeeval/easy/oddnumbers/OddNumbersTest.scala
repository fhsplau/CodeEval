
package com.codeeval.easy.oddnumbers

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.oddnumbers.OddNumbers._

@RunWith(classOf[JUnitRunner])
class OddNumbersTest extends FunSuite {

  val oddNumbersFromOneTo99: List[Int] = (1 to 100).filter(x => (x & 1) == 1).toList

  test("is odd") {
    assert(3.isOdd === true)
    assert(4.isOdd === false)
  }

  test("is even") {
    assert(4.isEven === true)
    assert(3.isEven === false)
  }

  test("odd numbers from 1 to 99") {
    assert(oddNumbers === oddNumbersFromOneTo99)
  }

  test("odd numbers from 1 to 99 v2.0") {
    assert(oddNumbers2 === oddNumbersFromOneTo99)
  }
}
