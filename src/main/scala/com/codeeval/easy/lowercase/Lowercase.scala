package com.codeeval.easy.lowercase

object Lowercase {

  def lowercase(s: String): String = s.toList.map(_.toLower).mkString

  def lowercase2(s: String): String = if (s.isEmpty) "" else s.head.toLower + lowercase2(s.tail)

  def lowercase3(s: String): String = s.toList.map {
    i => if (i.toInt >= 65 && i <= 90) (i + 32).toChar else i
  }.mkString

}
