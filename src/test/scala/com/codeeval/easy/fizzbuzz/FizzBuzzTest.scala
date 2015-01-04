package com.codeeval.easy.fizzbuzz

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSuite with BeforeAndAfter{

  var f: FizzBuzz = _

  before {
    f = new FizzBuzz
  }

  test("F and B") {
    assert(f.convert(List(3,5,10)) === List("1", "2", "F", "4", "B", "F", "7", "8", "F", "B"))
  }

  test("only FB"){
    assert(f.convert(List(3,3,10)) === List("1", "2", "FB", "4", "5", "FB", "7", "8", "FB", "10"))
  }


}
