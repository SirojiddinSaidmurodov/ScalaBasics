object slist extends App {
  def power(n: Int, k: Int): Int = {
    if (k == 0) {
      1
    } else {
      n * power(n, k - 1)
    }
  }

  def slist(a: Int, b: Int): List[Any] = {
    if (a == b) {
      return List(power(a, a));
    } else {
      return List(power(a, a)) ::: slist(a + 1, b);
    }
  }

  println(slist(1, 7))
}
