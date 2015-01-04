package com.codeeval.easy.reversewords

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ReverseWordsTest extends FunSuite with BeforeAndAfter{
  var r: ReverseWords = _

  before {
    r = new ReverseWords
  }

  test("proper string after reverse operation") {
    assert(r.reverse("Hello World") === "World Hello")
    assert(r.reverse2("Hello World") === "World Hello")
  }

  test("the same sentence if only one word") {
    assert(r.reverse("Hello") === "Hello")
    assert(r.reverse2("Hello") === "Hello")
  }
}
