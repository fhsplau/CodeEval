package com.codeeval.easy.fizzbuzz

import scala.collection.mutable.ListBuffer

class FizzImplicit(input: List[Int]) {
  def convert: List[String] = {
    def convertImpl(range: List[Int], acc: ListBuffer[String]): ListBuffer[String] =
      if (range.isEmpty) acc
      else convertImpl(range.tail, acc += matcher(range.head))

    def matcher(numberToMatch: Int): String = {
      numberToMatch match {
        case x if x % input(0) == 0 => if (x % input(1) == 0) "FB" else "F"
        case x if x % input(0) != 0 => if (x % input(1) == 0) "B" else x.toString
      }
    }

    convertImpl(List.range(1, input(2) + 1), new ListBuffer()).toList
  }
}

object FizzBuzzImplicit {
  implicit def implicitConvert(input: List[Int]): FizzImplicit = new FizzImplicit(input)
}
