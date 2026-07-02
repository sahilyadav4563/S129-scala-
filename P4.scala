import breeze.linalg._
import breeze.stats._

object P4 {
  def main(args: Array[String]): Unit = {

    // Ticket sales of Counter A
    val counterA = DenseVector(120.0, 150.0, 180.0, 200.0, 170.0)

    // Ticket sales of Counter B
    val counterB = DenseVector(110.0, 140.0, 190.0, 210.0, 160.0)

    // Sum of Counter A tickets
    val totalTickets = sum(counterA)

    // Mean of Counter A tickets
    val averageTickets = mean(counterA)

    // Dot Product of both counters
    val salesComparison = counterA dot counterB

    println("Counter A Ticket Sales: " + counterA)
    println("Counter B Ticket Sales: " + counterB)
    println("Total Tickets Sold (Counter A): " + totalTickets)
    println("Average Tickets Sold (Counter A): " + averageTickets)
    println("Dot Product of Ticket Sales: " + salesComparison)
  }

}
