package com.codeeval.easy.oddnumbers

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.oddnumbers.OddNumbers._

@RunWith(classOf[JUnitRunner])
class OddNumbersTest extends FunSuite{

  test("is odd"){
    assert(3.isOdd === true)
    assert(4.isOdd === false)
  }

}
