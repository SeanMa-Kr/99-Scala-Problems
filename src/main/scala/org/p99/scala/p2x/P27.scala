package org.p99.scala.p2x

object P27 {

  def group3[T](list: List[T]): List[List[List[T]]] =
    for {
      lst3 <- combinations(2, list)
      tgt4 = list filterNot (lst3 contains _)
      lst4 <- combinations(3, tgt4)
    } yield List(lst3, lst4, tgt4 filterNot (lst4 contains _))

}
