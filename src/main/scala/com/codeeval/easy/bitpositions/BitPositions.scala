package com.codeeval.easy.bitpositions

trait Bit {
  type Bit = (Int) => Int

  protected val n: Int
  protected val b: Bit = (p: Int) => if ((n & 1 << p) == (1 << p)) 1 else 0
}

trait BitLogic extends Bit {

  def isOn(p: Int): Boolean = b(p) == 1

  def isOff(p: Int): Boolean = !isOn(p)

  def areOn(ps: Int*): Boolean = if (ps.isEmpty) true else (b(ps.head) == 1) && areOn(ps.tail: _*)
}

trait BitOperations extends Bit {

  def bitOn(p: Int): Int = if (b(p)==1) n else n | 1 << p

  def bitOff(p: Int): Int = if (b(p)!=1) n else n ^ 1 << p

}

class Bin(number: Int) extends BitOperations with BitLogic {
  val bit: Bit = b
  override protected val n: Int = number

  def numOfBits: Int = {
    def numOfBitsImpl(num: Int, acc: Int): Int = if (num == 0) acc else numOfBitsImpl(num >> 1, acc + 1)

    numOfBitsImpl(n, 0)
  }

  def toBin: String = List.range(0, numOfBits).map(bit).reverse.mkString
}

object BinaryOperations {
  implicit def binImpl(n: Int): Bin = new Bin(n)
}
