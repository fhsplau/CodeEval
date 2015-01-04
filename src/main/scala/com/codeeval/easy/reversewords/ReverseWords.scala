package com.codeeval.easy.reversewords

class ReverseWords {
  def reverseWords(sentence: String): String = sentence.split(" ").reverse.mkString(" ")
}
