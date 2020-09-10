package org.p99.scala

object P08 {

  def compress[T](list:List[T]):List[T] = list match {
    case Nil => Nil
    case head :: Nil => head :: Nil
    case head :: tail => if (head == tail.head) compress(tail) else head :: compress(tail)
  }

}
