package com.codeeval.easy.bitpositions

abstract class Bit(n: Int) {
  type Bit = Int => Boolean

  def bit(n: Int): Bit = (p: Int) => (n & 1 << p) == (1 << p)

  def isBitOn(p: Int): Boolean = bit(n)(p)

  def bitOn(p: Int): Int = if (isBitOn(p)) n else n | 1 << p

  def bitOff(p: Int): Int = if (!isBitOn(p)) n else n ^ 1 << p
}

class Bin(n: Int) extends Bit(n){

  def areBitsOn(ps: Int*): Boolean = if (ps.isEmpty) true else isBitOn(ps.head) && areBitsOn(ps.tail: _*)

  def numOfBits: Int = {
    def numOfBitsImpl(num: Int, acc: Int): Int = if (num == 0) acc else numOfBitsImpl(num >> 1, acc + 1)

    numOfBitsImpl(n, 0)
  }

  def convertToBin: String = {

    def convertImpl(num: Int, acc: String): String =
      if (num == 0) acc
      else convertImpl(num >> 1, acc + (if (bit(num)(0)) "1" else "0"))

    convertImpl(n, "").reverse
  }
}

object BinaryOperations {
  implicit def bitsImpl(n: Int): Bin = new Bin(n)
}
