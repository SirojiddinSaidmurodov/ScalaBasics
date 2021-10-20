import java.util

object listInvert extends App {
  def invert(in: List[Any]): List[Any] = {
    if (in.isEmpty) {
      return List();
    } else {
      return invert(in.tail) ::: List(in.head);
    }
  }

  print(invert(List(1, 2, 3, 4, 5, 6)))
}
