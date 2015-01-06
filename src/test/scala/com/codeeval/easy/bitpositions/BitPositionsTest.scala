package com.codeeval.easy.bitpositions

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BitPositionsTest extends FunSuite with BeforeAndAfter{
  var b: BitPositions = _

  before {
    b = new BitPositions
  }

  test("bit 2 and 3 are on in 86"){
    assert(b.bitsAreOn(86,2,4))
  }

  test("bit 1 and 2 are off in 125"){
    assert(!b.bitsAreOn(125,1,2))
  }
}
