package com.codeeval.easy.fizzbuzz

class FizzBuzzMap {

  val divByFirst: String = "F"
  val divBySecond: String = "B"
  val divByBoth: String = "FB"

  def convert(inputList: List[Int]): List[String] = List.range(1, inputList.last + 1).map {
    case x if x % inputList.head == 0 => if (x % inputList(1) == 0) divByBoth else divByFirst
    case x if x % inputList.head != 0 => if (x % inputList(1) == 0) divBySecond else x.toString
  }
}
