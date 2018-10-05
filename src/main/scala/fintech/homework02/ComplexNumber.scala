package fintech.homework02

case class ComplexNumber(re:Double, im:Double) {

  def +(n2: ComplexNumber): ComplexNumber ={
    ComplexNumber(this.re + n2.re, this.im + n2.im)
  }

  def -(n2: ComplexNumber): ComplexNumber ={
    ComplexNumber(this.re - n2.re, this.im - n2.im)
  }

  def *(n2: ComplexNumber): ComplexNumber ={
    ComplexNumber(this.re * n2.re - this.im * n2.im,
      this.im*n2.re + this.re * n2.im)
  }

  def c(n2: ComplexNumber): ComplexNumber ={
    ComplexNumber(n2.re, -1*n2.im)
  }

  def ~(power: Int): ComplexNumber ={
    var res = this
    var count = power
    if (power > 0) {
      while (count > 1) {
        res = res*this
        count -= 1
      }
    }
    else {
      count = -power
      while (count > 1) {
        res = res*this
        count -= 1
      }
      val divider = (res * c(res)).re
      res = ComplexNumber(res.re/divider, res.im/divider)
    }
    res
  }

   def =~=(complex: Any): Boolean = {
    complex match {
      case c:ComplexNumber => Math.abs(c.im - this.im) < 0.00000001 &&
        Math.abs(c.re - this.re) < 0.00000001
      case _ => false
    }
  }

  override def toString: String = {
    this.re + " + " + this.im + "i"
  }
}

  object test {

    def main(args: Array[String]): Unit = {
      var c1 = ComplexNumber(2, 3)
      var c2 = ComplexNumber(1, -2)
      println(c1~(-2))
    }
  }

