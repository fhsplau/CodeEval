package com.codeeval.easy.reversewords

class ReverseWords {
  def reverse(sentence: String): String = sentence.split(" ").reverse.mkString(" ")

  def reverse2(sentence: String): String = {
    def reverseImpl(listWithWords: Array[String], acc: Array[String]): Array[String] = {
      if(listWithWords.isEmpty) acc
      else reverseImpl(listWithWords.tail, Array(listWithWords.head) ++ acc)
    }

    reverseImpl(sentence.split(" "), Array()).mkString(" ")
  }
}
