package com.codeeval.easy.sumofdigits

object SumOfDigits {
  val divisor = 10

  def sum(n: Int): Int = if (n == 0) n else (n % divisor) + sum(n / divisor)
}
