package com.codeeval.easy.bitpositions

class Bits(n: Int) {
  type Bit = Int => Boolean

  private def bit(n: Int): Bit = (p: Int) => (n & 1 << p) == (1 << p)

  def areBitsOn(p1: Int, p2: Int): Boolean = bit(n)(p1) && bit(n)(p2)
}

object Bits {
  implicit def bitsImpl(n: Int): Bits = new Bits(n)
}
