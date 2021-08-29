package org.p99.scala.p0x

object P04 {

  def length[T](list: List[T]): Int = list match {
    case Nil => 0
    case _ :: tail => 1 + length(tail)
  }

}
