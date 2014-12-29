package com.codeeval.easy.fizzbuzz

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 * Created by paverell on 29.12.14.
 */
@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSuite {

  test("only F and B") {
    val numbers = List(3,5,10)
    val f = new FizzBuzz()

    assert(f.convert(numbers) === List("1", "2", "F", "4", "B", "F", "7", "8", "F", "B"))
  }

}
