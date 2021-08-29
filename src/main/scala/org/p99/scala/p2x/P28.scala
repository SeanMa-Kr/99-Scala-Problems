package org.p99.scala.p2x

object P28 {

  def group[T](groupSizeList: List[Int], list: List[T]): List[List[List[T]]] = {
    if (groupSizeList.sum != list.length) throw new IllegalArgumentException
    groupSizeList match {
      case Nil => List(Nil)
      case head :: tail => combinations(head, list) flatMap {
        elems => group(tail, list filterNot (elems contains _)) map (result => elems :: result)
      }
    }
  }

}
