package org.p99.scala

import org.p99.scala.P26.combinations

object P27 {

  def group3[T](list:List[T]): List[List[List[List[T]]]] = {
    combinations(2, list) map {
      subList2Item => combinations(3, list filter (l2st => !subList2Item.contains(l2st))) map {
        subList3Item => subList2Item :: subList3Item :: List(list filter(lst => !(subList2Item.contains(lst) || subList3Item.contains(lst))))
      }
    }
  }

}
