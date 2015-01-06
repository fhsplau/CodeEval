package com.codeeval.easy.bitpositions

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.bitpositions.BitPositions._

@RunWith(classOf[JUnitRunner])
class BitPositionsTest extends FunSuite with BeforeAndAfter{


  test("bit 2 and 3 are on in 86"){
    assert(bitsAreOn(int(86),2,4))
  }

  test("bit 1 and 2 are off in 125"){
    assert(!bitsAreOn(int(125),1,2))
  }
}
