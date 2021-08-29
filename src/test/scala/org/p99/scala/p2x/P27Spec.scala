package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P27._

class P27Spec extends UnitSpec {

  it should "Group the elements of a set into disjoint subsets" in {
    assert(group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).nonEmpty)
  }

}

