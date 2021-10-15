object sumexp extends App {
  def power(n: Int, k: Int): Int = {
    if (k == 0) {
      1
    } else {
      n * power(n, k - 1)
    }
  }

  def sumexp(n: Int): Int = {
    if (n == 0) {
      0
    } else {
      sumexp(n - 1) + power(n, n)
    }
  }

  println(sumexp(3))
}