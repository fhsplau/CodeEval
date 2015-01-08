package com.codeeval.easy.bitpositions

abstract class Bit(n: Int) {

  type Bit = () => Int

  def bit(p: Int): Bit = () => if((n & 1 << p) == (1 << p)) 1 else 0

  def areBitsOn(ps: Int*): Boolean

  def bitOn(p: Int): Int = if (bit(p)() == 1) n else n | 1 << p

  def bitOff(p: Int): Int = if (bit(p)()!=1) n else n ^ 1 << p
}

class BitLogic(b: () => Int){
  def isOn: Boolean = b()==1
}

class Bin(n: Int) extends Bit(n) {
  type Bin = List[Bit] => String

  def areBitsOn(ps: Int*): Boolean = if (ps.isEmpty) true else (bit(ps.head)()==1) && areBitsOn(ps.tail: _*)

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
  implicit def binImpl(n: Int): Bin = new Bin(n)
  implicit def logic(b: () => Int): BitLogic = new BitLogic(b)
}
