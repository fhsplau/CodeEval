package com.codeeval.easy.fizzbuzz

class FizzImplicit(input: List[Int]) {
  def convert: List[String] = {
    def convertImpl(range: List[Int], acc: List[String]): List[String] =
      if (range.isEmpty) acc
      else convertImpl(range.tail, acc ::: List(matcher(range.head)))

    def matcher(numberToMatch: Int): String = {
      numberToMatch match {
        case x if x % input(0) == 0 => if (x % input(1) == 0) "FB" else "F"
        case x if x % input(0) != 0 => if (x % input(1) == 0) "B" else x.toString
      }
    }

    convertImpl(List.range(1, input(2) + 1), List())
  }
}

object FizzBuzzImplicit {

  implicit def implicitConvert(input: List[Int]): FizzImplicit = new FizzImplicit(input)
}
