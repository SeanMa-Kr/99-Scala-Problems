package org.p99.scala.p2x

import org.p99.scala.Medium
import org.p99.scala.p2x.P26.combinations

object P27 extends Medium {
  /*
  * Group the elements of a set into disjoint subsets.
  * In how many ways can a group of 9 people work in 3 disjoint subgroups of 2, 3 and 4 persons?
  * Write a function that generates all the possibilities.

  * Example:
    scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
  * */

  def group3[T](list: List[T]): List[List[List[T]]] =
    for {
      lst3 <- combinations(2, list)
      tgt4 = list filterNot (lst3 contains _)
      lst4 <- combinations(3, tgt4)
    } yield List(lst3, lst4, tgt4 filterNot (lst4 contains _))

}
