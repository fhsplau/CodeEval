package com.codeeval.easy.multiplesofanumber

class Multiples {
  def multiply(x: Int, n: Int): Int = {
    def multiplyImpl(prev: Int, next: Int): Int = if (next >= x) next else multiplyImpl(next, prev + next)

    if (isPowerOfTwo(n)) multiplyImpl(n, 2 * n) else throw new Exception
  }
  def isPowerOfTwo(number: Int): Boolean = (number & (number - 1)) == 0

  def multiply2(x: Int, n: Int): Int = if(isPowerOfTwo(n)) n + n * ((x - n) / n + 1) else throw new Exception
}
