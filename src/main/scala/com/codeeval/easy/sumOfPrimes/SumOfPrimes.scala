package com.codeeval.easy.sumOfPrimes

class SumOfPrimes {
  val bound = 1000

  def sumPrimes: BigInt = {
    def sumPrimesImpl(previousNumbers: List[Int], nextNumber: Int, acc: Int, sum: BigInt): BigInt = {
      if (acc > bound) sum
      else if (isPrime(nextNumber, previousNumbers)) sumPrimesImpl(previousNumbers ::: List(nextNumber), nextNumber + 1, acc + 1, sum + nextNumber)
      else sumPrimesImpl(previousNumbers ::: List(nextNumber), nextNumber + 1, acc, sum)
    }

    def isPrime(number: Int, prevNumbers: List[Int]): Boolean = prevNumbers.filter(x => number % x == 0).sum == 0

    sumPrimesImpl(List(), 2, 1, 0)
  }

}
