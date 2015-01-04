package com.codeeval.easy.sumOfPrimes

class SumOfPrimes {
  val bound = 1000

  def sumPrimes: BigInt = {
    def sumPrimesImpl(nextNumber: Int, acc: Int, sum: BigInt): BigInt = {
      if (acc > bound) sum
      else if (isPrime(nextNumber)) sumPrimesImpl(nextNumber + 1, acc + 1, sum + nextNumber)
      else sumPrimesImpl(nextNumber + 1, acc, sum)
    }

    def isPrime(number: Int): Boolean = !List.range(2, number).exists(x => number % x == 0)

    sumPrimesImpl(4, 3, 5)
  }

}
