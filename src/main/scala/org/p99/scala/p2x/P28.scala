package org.p99.scala.p2x

import org.p99.scala.Medium
import org.p99.scala.p2x.P26.combinations

object P28 extends Medium {
  /*
  * You need to do P27 first.
  * Generalize the predicate from P27 in a way that we can specify a list of group sizes and the predicate will return a list of groups.
  *
  * Note that we do not want permutations of the group members;
  * i.e. `((Aldo, Beat), ...)` is the same solution as `((Beat, Aldo), ...)`.
  * However, we make a difference between `((Aldo, Beat), (Carla, David), ...)` and `((Carla, David), (Aldo, Beat), ...)`.

  * Example:
    scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
    res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
  * */

  def group[T](groupSizeList: List[Int], list: List[T]): List[List[List[T]]] = {
    if (groupSizeList.sum != list.length) throw new IllegalArgumentException
    groupSizeList match {
      case Nil => List(Nil)
      case head :: tail => combinations(head, list) flatMap {
        elems => group(tail, list filterNot (elems contains _)) map (result => elems :: result)
      }
    }
  }

}
