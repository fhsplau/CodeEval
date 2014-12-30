package com.codeeval.easy.fizzbuzz

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.fizzbuzz.FizzBuzzImplicit._

@RunWith(classOf[JUnitRunner])
class FizzBuzzImplicitTest extends FunSuite with BeforeAndAfter{

  test("only F and B") {
    assert(List(3,5,10).convert === List("1", "2", "F", "4", "B", "F", "7", "8", "F", "B"))
  }

  test("only FB"){
    assert(List(3,3,10).convert === List("1", "2", "FB", "4", "5", "FB", "7", "8", "FB", "10"))
  }


}