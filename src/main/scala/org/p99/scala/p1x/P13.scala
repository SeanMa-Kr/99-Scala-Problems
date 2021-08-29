package org.p99.scala.p1x

object P13 {

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {
    def innerEncodeDirect(tList: List[(Int, T)]): List[(Int, T)] = tList match {
      case Nil => Nil
      case head :: Nil => head :: Nil
      case head :: tail => if (head._2 == tail.head._2) innerEncodeDirect((head._1 + 1, head._2) :: tail.drop(1)) else head :: innerEncodeDirect(tail)
    }

    innerEncodeDirect(list.map(elem => (1, elem)))
  }

}
