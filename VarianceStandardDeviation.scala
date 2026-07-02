import scala.util.Random

object VarianceStdDev {
  def main(args: Array[String]): Unit = {

    // Generate 10 random numbers
    val numbers = List.fill(10)(Random.nextInt(100) + 1)

    println("Random Numbers: " + numbers)

    // Calculate Mean
    val mean = numbers.sum.toDouble / numbers.length

    // Calculate Variance
    val variance = numbers.map(x => math.pow(x - mean, 2)).sum / numbers.length

    // Calculate Standard Deviation
    val standardDeviation = math.sqrt(variance)

    // Display Results
    println("Mean: " + mean)
    println("Variance: " + variance)
    println("Standard Deviation: " + standardDeviation)
  }
}