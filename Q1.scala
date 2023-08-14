object Q1 extends App {
  val calculateInterest: Double => Double = depositAmount =>
    if (depositAmount <= 20000) 0.02 * depositAmount
    else if (depositAmount <= 200000) 0.04 * depositAmount
    else if (depositAmount <= 2000000) 0.035 * depositAmount
    else 0.065 * depositAmount

  // Example usage
  val deposit = scala.io.StdIn.readLine("Enter the deposit amount: ").toDouble
  val interest = calculateInterest(deposit)
  println(s"The interest earned for a deposit of Rs. $deposit is Rs. $interest")

}
