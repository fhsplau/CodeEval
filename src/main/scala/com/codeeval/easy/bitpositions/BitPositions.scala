package com.codeeval.easy.bitpositions

object BitPositions {
  type BitInt = Int => Boolean

  def int(n: Int): BitInt = (p: Int) => (n & 1 << p) == (1 << p)

  implicit def bitsAreOn(n: BitInt, p1: Int, p2: Int): Boolean = n(p1) && n(p2)
}
