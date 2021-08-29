package org.p99.scala.p1x

object P12 {

  def decode[T](list: List[(Int, T)]): List[T] = list match {
    case Nil => Nil
    case head :: tail => if (head._1 > 0) head._2 :: decode((head._1 - 1, head._2) :: tail) else decode(tail)
  }

}
