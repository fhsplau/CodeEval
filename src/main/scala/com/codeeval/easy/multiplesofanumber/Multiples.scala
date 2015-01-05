package com.codeeval.easy.multiplesofanumber

class Multiples {
  def multiply(x: Int, n: Int): Int = {
    def multiplyImpl(prev: Int, next: Int): Int = {
      if (next >= x) next
      else multiplyImpl(next, prev + next)
    }

    multiplyImpl(n, 2 * n)
  }

}
