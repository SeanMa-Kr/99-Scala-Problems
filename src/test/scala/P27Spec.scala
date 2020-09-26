package org.p99.scala

import org.p99.scala.P27.group3
import org.scalatest._

class P27Spec extends UnitSpec {

  it should "Group the elements of a set into disjoint subsets" in {
    assert(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).nonEmpty)
  }

}

