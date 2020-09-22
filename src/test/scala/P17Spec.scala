package org.p99.scala

import org.p99.scala.P17.split
import org.scalatest._

class P17Spec extends UnitSpec {

  it should "split a list into two parts" in {
    assert(split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

}

