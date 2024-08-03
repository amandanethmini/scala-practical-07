object even {
  def filterEvenNumbers(numbers: List[Int]): List[Int] = {
    numbers.filter(num => num % 2 == 0)
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers seperated by spaces: ");
    val input = scala.io.StdIn.readLine()

    val inputList = input.split("\\s+").map(_.toInt).toList

    val evenNumbers = filterEvenNumbers(inputList)

    println("Even numbers: " + evenNumbers.mkString(", "))
  }
}
