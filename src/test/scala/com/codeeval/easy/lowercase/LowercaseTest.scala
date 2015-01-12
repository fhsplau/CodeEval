package com.codeeval.easy.lowercase

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import com.codeeval.easy.lowercase.Lowercase._

@RunWith(classOf[JUnitRunner])
class LowercaseTest extends FunSuite {

  test("to lowercase when all letters are uppercase"){
    assert(lowercase("HELLO WORLD") === "hello world")
    assert(lowercase2("HELLO WORLD") === "hello world")
    assert(lowercase3("HELLO WORLD") === "hello world")
  }

  test("empty string") {
    assert(lowercase3("") === "")
  }

  test("only special chars") {
    assert(lowercase3(",.><@!") === ",.><@!")
  }
}
