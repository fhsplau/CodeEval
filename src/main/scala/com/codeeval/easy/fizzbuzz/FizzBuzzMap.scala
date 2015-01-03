package com.codeeval.easy.fizzbuzz

class FizzBuzzMap(divByFirst: String, divBySecond: String, divByBoth: String) {

  def this() = this("F","B","FB")
  def this(divByFirst: String) = this(divByFirst,"B","FB")
  def this(divByFirst: String, divBySecond:String) = this(divByFirst,divBySecond,"FB")

  def convert(inputList: List[Int]): List[String] =
    if (inputList.size > 3) throw new Exception
    else List.range(1, inputList.last + 1).map {
      case x if x % inputList.head == 0 => if (x % inputList(1) == 0) divByBoth else divByFirst
      case x if x % inputList.head != 0 => if (x % inputList(1) == 0) divBySecond else x.toString
    }
}
