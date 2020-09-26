package org.p99.scala

import org.p99.scala.P29.lsort
import org.scalatest._

class P29Spec extends UnitSpec {

  it should "return sorted list to length of its sublists" in {
    assert(lsort(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o))) == List(List('o), List('d, 'e), List('d, 'e), List('m, 'n), List('a, 'b, 'c), List('f, 'g, 'h), List('i, 'j, 'k, 'l)))
  }

}

