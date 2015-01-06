package com.codeeval.easy.bitpositions

class BitPositions {

  def bitsAreOn(n: Int, p1: Int, p2: Int): Boolean = (n & 1 << p1) == (1 << p1) && (n & 1 << p2) == (1 << p2)

}
