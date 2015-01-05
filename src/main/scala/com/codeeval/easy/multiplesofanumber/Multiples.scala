package com.codeeval.easy.multiplesofanumber

class Multiples {
  def multiply(x: Int, n: Int): Int = {
    def multiplyImpl(prev: Int, next: Int): Int = {
      if (next >= x) next
      else multiplyImpl(next, prev + next)
    }

    def isPowerOfTwo(number: Int): Boolean = (number & (number - 1)) == 0

    if (isPowerOfTwo(n)) multiplyImpl(n, 2 * n) else throw new Exception
  }

}
