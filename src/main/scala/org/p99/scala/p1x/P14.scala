package org.p99.scala.p1x

object P14 {

  def duplicate[T](list: List[T]): List[T] = list match {
    case Nil => Nil
    case head :: tail => head :: head :: duplicate(tail)
  }

}
