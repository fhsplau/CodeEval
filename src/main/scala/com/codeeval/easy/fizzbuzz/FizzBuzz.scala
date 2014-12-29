package com.codeeval.easy.fizzbuzz

/**
 * Created by paverell on 29.12.14.
 */
class FizzBuzz {
  def convert(ints: List[Int]): List[String] = {
    def convertImpl(range: List[Int], acc: List[String]): List[String] =
      if (range.isEmpty) acc
      else convertImpl(range.tail, acc ::: List(matcher(range.head, ints(0), ints(1))))

    def matcher(numberToMatch: Int, first: Int, second: Int): String = {
      numberToMatch match {
        case x if x % first == 0 && x % second != 0 => "F"
        case x if x % first != 0 && x % second == 0 => "B"
        case x if x % first == 0 && x % second == 0 => "FB"
        case _ => numberToMatch.toString
      }
    }

    convertImpl(List.range(1, ints(2) + 1), List())
  }

}
