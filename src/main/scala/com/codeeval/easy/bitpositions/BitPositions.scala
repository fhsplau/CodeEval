package com.codeeval.easy.bitpositions

class Bits(n: Int) {
  type Bit = Int => Boolean

  private def bit(n: Int): Bit = (p: Int) => (n & 1 << p) == (1 << p)

  def areBitsOn(p: Int*): Boolean = if (p.isEmpty) true else bit(n)(p.head) && areBitsOn(p.tail: _*)
}

object Bits {
  implicit def bitsImpl(n: Int): Bits = new Bits(n)
}
