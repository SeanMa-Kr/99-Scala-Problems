package org.p99.scala.p2x

import org.p99.scala.UnitSpec
import org.p99.scala.p2x.P28._

class P28Spec extends UnitSpec {

  it should "generalize the predicate from P27 in a way that we can specify a list of group sizes and the predicate will return a list of groups" in {
    assert(group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).nonEmpty)
  }

}

