package com.codeeval.easy.multiplesofanumber

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MultiplesTest extends FunSuite with BeforeAndAfter {
  var m: Multiples = _

  before {
    m = new Multiples
  }

  test("13 and 8 will give 16") {
    assert(m.multiply(13, 8) === 16)
    assert(m.multiply2(13, 8) === 16)
  }

  test("100 and 8 will give 104") {
    assert(m.multiply(100, 8) === 104)
    assert(m.multiply2(100, 8) === 104)
  }

  test("exception if n is not a power of 2") {
    intercept[Exception] {
      m.multiply(100, 7)
    }
    intercept[Exception] {
      m.multiply2(100, 7)
    }
  }

}
