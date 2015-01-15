package com.codeeval.easy.oddnumbers

class Numbers(n:Int){
  def isOdd: Boolean = (n&1)==1
}

object OddNumbers {
  implicit def numbers(n: Int):Numbers = new Numbers(n)
}
