package org.p99.scala.p0x

object P05 {

  def reverse[T](list: List[T]): List[T] = list match {
    case Nil => list
    case head :: tail => reverse(tail) :+ head
  }

}
