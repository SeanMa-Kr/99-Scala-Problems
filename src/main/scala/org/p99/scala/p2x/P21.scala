package org.p99.scala.p2x

object P21 {

  def insertAt[T](elem: T, n: Int, list: List[T]): List[T] = list match {
    case Nil => if (n == 0) elem :: Nil else throw new IndexOutOfBoundsException
    case head :: tail => if (n > 0) head :: insertAt(elem, n - 1, tail) else elem :: head :: tail
  }

}
