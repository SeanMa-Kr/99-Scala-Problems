package org.p99.scala.p0x

object P07 {

  def flatten[T](list: List[Any]): List[T] = list match {
    case Nil => Nil
    case (head: List[T]) :: tail => flatten(head) ::: flatten(tail)
    case (head: T) :: tail => head :: flatten(tail)
  }

}
