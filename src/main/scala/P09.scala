package org.p99.scala

object P09 {

  def pack[T](list:List[T]):List[List[T]] = {
    def innerPack[T](nlist:List[List[T]]):List[List[T]] = nlist match {
      case Nil => Nil
      case head :: Nil => head :: Nil
      case head :: tail => if (head.last == tail.head.last) innerPack((head :+ tail.head.last) :: tail.drop(1)) else head :: innerPack(tail)
    }
    innerPack(list map(i => List(i)))
  }

  def packAny(list:List[Any]):List[Any] = list match {
    case Nil => Nil
    case head :: Nil => head :: Nil
    case (head:List[Any]) :: tail => if (head.last == tail.head) packAny((head :+ tail.head) :: tail.drop(1)) else head :: packAny(tail)
    case head :: tail => if (head == tail.head) packAny(List(head) :: tail) else List(head) :: packAny(tail)
  }

}
