package com.codeeval.easy.bitpositions

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.bitpositions.BinaryOperations._

@RunWith(classOf[JUnitRunner])
class BitPositionsTest extends FunSuite with BeforeAndAfter {

  test("check if bit is on"){
    assert(86.isOn(2))
  }

  test("check if bit is off"){
    assert(86.isOff(0))
  }

  test("bit 2 and 3 are on in 86") {
    assert(86.areOn(2, 4))
  }

  test("arbitrary number of arguments") {
    assert(!86.areOn(2, 4, 5, 6))
  }

  test("bit 1 and 2 are off in 125") {
    assert(!125.areOn(1, 2))
  }

  test("switch bit on"){
    assert(86.bitOn(0) === 87)
  }

  test("try to switch bit when it's on") {
    assert(86.bitOn(2) === 86)
  }

  test("switch bit off"){
    assert(86.bitOn(0).bitOff(0) === 86)
  }

  test("try to switch bit off when it's off"){
    assert(86.bitOff(0) === 86)
  }

  test("number of bits"){
    assert(4.numOfBits === 3)
  }

  test("convert"){
    println(4.bit(1))
    assert(4.toBin === "100")
    assert(5.toBin === "101")
  }
}
