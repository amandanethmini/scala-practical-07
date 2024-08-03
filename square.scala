object square {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(num => num * num)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers seperated by spaces: ");
    val input = scala.io.StdIn.readLine()

    val inputList = input.split("\\s+").map(_.toInt).toList

    val squareNumbers = calculateSquare(inputList)

    println("Square numbers: " + squareNumbers.mkString(", "))
  }
}
