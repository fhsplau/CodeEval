package com.codeeval.easy.oddnumbers

class Numbers(n: Int) {
  def isOdd: Boolean = (n & 1) == 1

  def isEven: Boolean = !isOdd
}

object OddNumbers {
  implicit def numbers(n: Int): Numbers = new Numbers(n)

  def oddNumbers: List[Int] = (1 to 100).filter(x=> x.isOdd).toList
}
