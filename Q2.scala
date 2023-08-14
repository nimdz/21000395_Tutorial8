object Q2 extends App {
  print("Enter a Number:")
  val input = scala.io.StdIn.readInt()

  val result = input match {
    case n if n < 0 => "Negative input"
    case n if n== 0 => "Zero input"
    case n if n % 2 == 0 => "Even number is given"
    case n if n % 2 != 0 => "Odd number is given"
  }

  println(result)
}
