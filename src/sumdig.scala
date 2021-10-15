object sumdig extends App {
  
  def sumdig(n:Int):Int={
  if((n / 10) == 0){
    n
  }else{
    sumdig(n / 10) + (n % 10)
  }
}

  println(sumdig(156))
}
