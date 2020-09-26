package org.p99.scala

import org.p99.scala.P30.lsortFreq
import org.scalatest._

class P30Spec extends UnitSpec {

  it should "return sorted list to length of its sublists according to their length frequency" in {
    assert(lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) == List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n)))
  }

}

