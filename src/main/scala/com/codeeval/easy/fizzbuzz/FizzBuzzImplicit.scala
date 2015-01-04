package com.codeeval.easy.fizzbuzz

import scala.collection.mutable.ListBuffer

trait FizzTrait {
  def convert: List[String]
}

abstract class FizzAbstract(input: List[Int]) extends FizzTrait {
  def convert: List[String] = convertImpl(List.range(1, input(2) + 1), ListBuffer()).toList

  def convertImpl(range: List[Int], acc: ListBuffer[String]): ListBuffer[String]
}

class FizzImplicit(input: List[Int]) extends FizzAbstract(input) {
  def convertImpl(range: List[Int], acc: ListBuffer[String]): ListBuffer[String] =
    if (range.isEmpty) acc
    else convertImpl(range.tail, acc += matcher(range.head))

  private def matcher(numberToMatch: Int): String = {
    numberToMatch match {
      case x if x % input(0) == 0 => if (x % input(1) == 0) "FB" else "F"
      case x if x % input(0) != 0 => if (x % input(1) == 0) "B" else x.toString
    }
  }
}

object FizzBuzzImplicit {
  implicit def implicitConvert(input: List[Int]): FizzImplicit = new FizzImplicit(input)
}
