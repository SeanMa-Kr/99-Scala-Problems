package org.p99.scala

import scala.annotation.tailrec

object P06 {

  @tailrec
  def isPalindrome[T](list: List[T]): Boolean = list match {
    case Nil => true
    case _ :: Nil => true
    case head :: tail => if (tail.last == head) isPalindrome(tail.dropRight(1)) else false
  }

}
