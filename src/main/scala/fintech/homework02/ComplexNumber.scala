package fintech.homework02

case class ComplexNumber(re:Int, im:Int) {

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

  def ~(power: Int): ComplexNumber ={
    var res = this
    var count = power
    while (count > 1) {
      res = res*this
      count -= 1
    }
    res
  }

  override def equals(complex: Any): Boolean = {
    complex match {
      case c:ComplexNumber => c.im == this.im && c.re == this.re
      case _ => false
    }
  }

  override def toString: String = {
    this.re + " + " + this.im + "i"
  }
}
