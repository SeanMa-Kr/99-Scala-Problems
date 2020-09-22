package org.p99.scala

object P15 {

  def duplicateN[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => ((0 until n) map (_ => head)).toList ::: duplicateN(n, tail)
  }

}
