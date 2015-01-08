package com.codeeval.easy.bitpositions

abstract class Bit(n: Int) {
  type Bit = Int => Int

  def bitWrapper: Bit = (p: Int) => if((n & 1 << p) == (1 << p)) 1 else 0

  def bit(p: Int): Int = bitWrapper(p)

  def areBitsOn(ps: Int*): Boolean

  def bitOn(p: Int): Int = if (bit(p)==1) n else n | 1 << p

  def bitOff(p: Int): Int = if (bit(p)!=1) n else n ^ 1 << p
}

class Bin(n: Int) extends Bit(n) {
  type Bin = List[Bit] => String

  def areBitsOn(ps: Int*): Boolean = if (ps.isEmpty) true else (bit(ps.head)==1) && areBitsOn(ps.tail: _*)

  def numOfBits: Int = {
    def numOfBitsImpl(num: Int, acc: Int): Int = if (num == 0) acc else numOfBitsImpl(num >> 1, acc + 1)

    numOfBitsImpl(n, 0)
  }

  private def areBitsOnList(ps: List[Int]): List[Boolean] = ???
//    if (ps.nonEmpty) List(bit(ps.head)) ::: areBitsOnList(ps.tail)
//    else List()

  def convertToBin: String = areBitsOnList(List.range(0, numOfBits)).reverse.map {
    case true => "1"
    case false => "0"
  }.mkString

  def bin: Bin = ???
}

object BinaryOperations {
  implicit def bitsImpl(n: Int): Bin = new Bin(n)
}
