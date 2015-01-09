package com.codeeval.easy.bitpositions

trait Bit {
  type bit = (Int) => Int

  val n: Int
  val b: bit = (p: Int) => if ((n & 1 << p) == (1 << p)) 1 else 0
}

trait BitLogic extends Bit {

  def isOn(p: Int): Boolean = b(p) == 1

  def isOff(p: Int): Boolean = !isOn(p)
  
  def areOn(ps: Int*): Boolean = if (ps.isEmpty) true else (b(ps.head) == 1) && areOn(ps.tail: _*)
}

abstract class BitOperations extends BitLogic {
  
  val bit: bit = b

  def bitOn(p: Int): Int = if (bit(p) == 1) n else n | 1 << p

  def bitOff(p: Int): Int = if (bit(p) != 1) n else n ^ 1 << p
}


class Bin(number: Int) extends BitOperations {
  override val n: Int = number

  def numOfBits: Int = {
    def numOfBitsImpl(num: Int, acc: Int): Int = if (num == 0) acc else numOfBitsImpl(num >> 1, acc + 1)

    numOfBitsImpl(n, 0)
  }

  def toBin: String = {
    def areBitsOnList(ps: List[Int]): List[Int] =
      if (ps.isEmpty) List()
      else List(bit(ps.head)) ::: areBitsOnList(ps.tail)

    areBitsOnList(List.range(0, numOfBits)).reverse.mkString
  }
}

object BinaryOperations {
  implicit def binImpl(n: Int): Bin = new Bin(n)
}
