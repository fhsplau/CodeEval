package com.codeeval.easy.fizzbuzz

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FizzBuzzMapTest extends FunSuite with BeforeAndAfter{

  var f: FizzBuzzMap = _

  before {
    f = new FizzBuzzMap
  }

  test("only F and B") {
    assert(f.convert(List(3,5,10)) === List("1", "2", "F", "4", "B", "F", "7", "8", "F", "B"))
  }

  test("only FB"){
    assert(f.convert(List(3,3,10)) === List("1", "2", "FB", "4", "5", "FB", "7", "8", "FB", "10"))
  }

  test("exception if input list's size is bigger than 3") {
    intercept[Exception] {
      f.convert(List(1,2,3,10))
    }
  }

  test("multiple constructors") {
    val f1 = new FizzBuzzMap("A","C","AB")
    val f2 = new FizzBuzzMap("A","C")
    val f3 = new FizzBuzzMap("A")

    assert(f2.convert(List(3,5,10)) === List("1", "2", "A", "4", "C", "A", "7", "8", "A", "C"))
    assert(f3.convert(List(3,5,10)) === List("1", "2", "A", "4", "B", "A", "7", "8", "A", "B"))
    assert(f1.convert(List(3,3,10)) === List("1", "2", "AB", "4", "5", "AB", "7", "8", "AB", "10"))
  }


}