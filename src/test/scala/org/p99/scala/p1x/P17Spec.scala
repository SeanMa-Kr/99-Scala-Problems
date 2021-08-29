package org.p99.scala.p1x

import org.p99.scala.UnitSpec
import org.p99.scala.p1x.P17._

class P17Spec extends UnitSpec {

  it should "split a list into two parts" in {
    assert(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}

