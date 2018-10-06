package fintech.homework02

import org.scalatest.{FlatSpec, Matchers}

class ComplexNumberSpec extends FlatSpec with Matchers {

  "Complex numbers" should "be added correctly" in {
    val c1 = new ComplexNumber(2, 3)
    val c2 = new ComplexNumber(1, 2)
    c1 + c2 shouldEqual new ComplexNumber(3, 5)
  }

  "Complex numbers" should "be substracted correctly" in {
    val c1 = new ComplexNumber(2, 3)
    val c2 = new ComplexNumber(1, 2)
    c1 - c2 shouldEqual new ComplexNumber(1, 1  )
  }

  "Complex numbers" should "be multiplied correctly" in {
    val c1 = new ComplexNumber(2, 3)
    val c2 = new ComplexNumber(1, 2)
    c1 * c2 shouldEqual new ComplexNumber(-4, 7)
  }

  "Complex numbers" should "be raised to a power correctly" in {
    val c1 = new ComplexNumber(2, 3)
    c1~4 shouldEqual new ComplexNumber(-119, -120)
  }

  "Complex numbers" should "be compared correctly1" in {
    var c1 = new ComplexNumber(1, 2)
    var c2 = new ComplexNumber(1, 1)
    var c3 = new ComplexNumber(2, 3.00000000001)
    var c4 = c3 - c2
    c4 == c1 should be (true)
  }

  "Complex numbers" should "be compared correctly2" in {
    var c1 = new ComplexNumber(1, 2)
    var c2 = new ComplexNumber(1, 1)
    var c3 = new ComplexNumber(2, 3.0001)
    var c4 = c3 - c2
    c4 == c1 should be (false)
  }

  "Complex numbers" should "be compared correctly3" in {
    val c1 = new ComplexNumber(2, 3)
    val c2 = new ComplexNumber(1, 3)
    c1 == c2 should be (false)
  }

}

