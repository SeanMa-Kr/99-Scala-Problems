package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P09._

class P09Spec extends UnitSpec {

  it should "return sublists which packed consecutive duplicates of list elements (with innerPack func)." in {
    assert(pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

  it should "return sublists which packed consecutive duplicates of list elements (without innerPack func)." in {
    assert(packAny(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) == List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

}

