package com.codeeval.easy.oddnumbers

class Numbers(n: Int) {
  def isOdd: Boolean = (n & 1) == 1

  def isEven: Boolean = !isOdd
}

object OddNumbers {
  implicit def numbers(n: Int): Numbers = new Numbers(n)

  def oddNumbers: List[Int] = (1 to 100).filter(x => x.isOdd).toList

  def oddNumbers2: List[Int] = {
    val bound = 99

    def impl(next: Int, acc: List[Int]): List[Int] =
      if (next > bound) acc
      else impl(next + 1, if (next.isOdd) acc ::: List(next) else acc)

    impl(1, List())
  }

  def oddNumbers3: List[Int] = (1 to 100).par.filter(_.isOdd).toList
}
