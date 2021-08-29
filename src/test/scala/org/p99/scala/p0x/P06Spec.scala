package org.p99.scala.p0x

import org.p99.scala.UnitSpec
import org.p99.scala.p0x.P06._

class P06Spec extends UnitSpec {

  it should "find out whether List(1, 2, 3, 2, 1) is a palindrome." in {
    assert(isPalindrome(List(1, 2, 3, 2, 1)))
  }

  it should "find out whether List(1, 2, 3, 3, 2, 1) is a palindrome." in {
    assert(isPalindrome(List(1, 2, 3, 3, 2, 1)))
  }

  it should "find out whether List(1, 2, 3, 4, 2, 1) is not a palindrome." in {
    assert(!isPalindrome(List(1, 2, 3, 4, 2, 1)))
  }

  it should "find out whether List(1, 2, 3, 4, 1) is not a palindrome." in {
    assert(!isPalindrome(List(1, 2, 3, 4, 1)))
  }

}

