package com.codeeval.easy.reversewords

class ReverseWords {
  def reverse(sentence: String): String = sentence.split(" ").reverse.mkString(" ")

  def reverse2(sentence: String): String = {
    def reverseImpl(listWithWords: Array[String], acc: List[String]): List[String] = {
      if(listWithWords.isEmpty) acc
      else reverseImpl(listWithWords.tail, List(listWithWords.head) ::: acc)
    }

    reverseImpl(sentence.split(" "), List()).mkString(" ")
  }
}
