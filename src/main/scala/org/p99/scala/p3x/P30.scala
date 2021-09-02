package org.p99.scala.p3x

import org.p99.scala.Medium

object P30 extends Medium {
  /*
  * You need to do P29 first.
  * Again, we suppose that a list contains elements that are lists themselves.
  * But this time the objective is to sort the elements according to their length frequency;
  * i.e. in the default, sorting is done ascendingly, lists with rare lengths are placed,
  * others with a more frequent length come later.

  * Note that in the example, the first two lists in the result have length 4 and 1 and both lengths appear just once.
  * The third and fourth lists have length 3 and there are two list of this length.
  * Finally, the last three lists have length 2.
  * This is the most frequent length.

  * Example:
    scala> lsortFreq(List(List('a, 'b, 'c), List('d, 'e), List('f, 'g, 'h), List('d, 'e), List('i, 'j, 'k, 'l), List('m, 'n), List('o)))
    res1: List[List[Symbol]] = List(List('i, 'j, 'k, 'l), List('o), List('a, 'b, 'c), List('f, 'g, 'h), List('d, 'e), List('d, 'e), List('m, 'n))
  * */

  def lsortFreq[T](list: List[List[T]]): List[List[T]] = {
    val freq = (list map (_.length) groupBy (i => i)).values.toList sortBy (_.length) map (_.head)
    list sortWith ((s, t) => freq.indexOf(s.length) < freq.indexOf(t.length))
  }

}
