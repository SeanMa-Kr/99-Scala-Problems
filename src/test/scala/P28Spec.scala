package org.p99.scala

import org.p99.scala.P28.group
import org.scalatest._

class P28Spec extends UnitSpec {

  it should "generalize the predicate from P27 in a way that we can specify a list of group sizes and the predicate will return a list of groups" in {
    assert(group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida")).nonEmpty)
  }

}

