package org.p99.scala.p0x

import org.p99.scala.Easy

import scala.annotation.tailrec

object P06 extends Easy {
  /*
  * Find out whether a list is a palindrome.

  * Example:
    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
  * */

  @tailrec
  def isPalindrome[T](list: List[T]): Boolean = list match {
    case Nil => true
    case _ :: Nil => true
    case head :: tail => if (tail.last == head) isPalindrome(tail.dropRight(1)) else false
  }

}
