package com.codeeval.easy.bitpositions

import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.bitpositions.BinaryOperations._

@RunWith(classOf[JUnitRunner])
class BitPositionsTest extends FunSuite with BeforeAndAfter {

  test("check if bit is on") {
    assert(86.isOn(2))
  }

  test("check if bit is off") {
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

  test("switch bit on") {
    assert(86.bitOn(0) === 87)
  }

  test("try to switch bit when it's on") {
    assert(86.bitOn(2) === 86)
  }

  test("switch bit off") {
    assert(86.bitOn(0).bitOff(0) === 86)
  }

  test("try to switch bit off when it's off") {
    assert(86.bitOff(0) === 86)
  }

  test("number of bits") {
    assert(4.numOfBits === 3)
  }

  test("proper bit") {
    assert(4.bit(0) === 0)
    assert(5.bit(0) === 1)
  }

  test("convert") {
    assert(4.toBin === "100")
    assert(5.toBin === "101")
    assert(4.bitOn(0).toBin === "101")
  }

  test("if proper value after shift Left") {
    assert(4.shiftLeft(1) === 2)
    assert(87.shiftLeft(4) === 5)
    assert(0.shiftLeft(10) === 0)
  }

  test("if proper value after shift right") {
    assert(4.shiftRight(1) === 8)
    assert(87.shiftRight(4) === 1392)
    assert(0.shiftRight(10) === 0)
  }

}
