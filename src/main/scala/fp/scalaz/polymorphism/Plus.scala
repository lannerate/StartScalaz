package fp.scalaz.polymorphism

/**
  * Created by hzhang3 on 12/6/2016.
  */
trait Plus[A] {
  def plus(a2: A): A

  def plus(a1:A, a2:A):A
}

object Plus {
  def plus[A <: Plus[A]](a1: A, a2: A): A = a1.plus(a2)

  def plus[A:Plus](a1:A, a2:A):A = implicitly[Plus[A]].plus(a1,a2)
}
