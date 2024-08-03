object prime {
  def filterPrime(numbers: List[Int]): List[Int] = {
    numbers.filter(n => {
      if (n <= 1) false
      else if (n == 2) true
      else !(2 to math.sqrt(n).toInt).exists(d => n % d == 0)
    })
  }

  def main(args: Array[String]): Unit = {
    println("Enter a list of integers seperated by spaces: ");
    val input = scala.io.StdIn.readLine()

    val inputList = input.split("\\s+").map(_.toInt).toList

    val primeNumbers = filterPrime(inputList)

    println("Even numbers: " + primeNumbers.mkString(", "))
  }
}
