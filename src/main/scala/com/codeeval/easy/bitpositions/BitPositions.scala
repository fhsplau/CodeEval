package com.codeeval.easy.bitpositions

class Bits(n: Int) {
  type Bit = Int => Boolean

  private def bit(n: Int): Bit = (p: Int) => (n & 1 << p) == (1 << p)

  def isBitOn(p: Int): Boolean = bit(n)(p)

  def areBitsOn(p: Int*): Boolean = if (p.isEmpty) true else isBitOn(p.head) && areBitsOn(p.tail: _*)

  def bitOn(p: Int): Int = if (isBitOn(p)) n else n | 1 << p

  def bitOff(p: Int): Int = if (!isBitOn(p)) n else n | 1 << p

  def numOfBits: Int = {
    def numOfBitsImpl(num: Int, acc: Int): Int = if (num == 0) acc else numOfBitsImpl(num >> 1, acc + 1)

    numOfBitsImpl(n, 0)
  }

  def convertToBin: String = {
    def convertImpl(num: Int, acc: String): String = 
      if (num == 0) acc
      else convertImpl(num >> 1, acc + (if ((num & 1) != 0) "1" else "0"))

    convertImpl(n, "").reverse
  }
}

object Bits {
  implicit def bitsImpl(n: Int): Bits = new Bits(n)
}
