package org.p99.scala

object P16 {

  def drop[T](n: Int, list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => if (n > 1) head :: tail.take(n - 2) ::: drop(n, tail.drop(n - 1)) else Nil
  }

}
