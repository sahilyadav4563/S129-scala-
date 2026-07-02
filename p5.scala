import breeze.linalg._

object p5 {
  def main(args: Array[String]): Unit = {

    // Football Team Performance Matrix
    val performanceMatrix = DenseMatrix(
      (8.0, 7.0, 9.0),
      (6.0, 5.0, 8.0),
      (7.0, 9.0, 6.0)
    )

    println("=== Football Team Performance Matrix ===")
    println(performanceMatrix)

    // Transpose
    val transposeMatrix = performanceMatrix.t
    println("\n=== Transpose Matrix ===")
    println(transposeMatrix)

    // Determinant
    val determinant = det(performanceMatrix)
    println("\nDeterminant = " + determinant)
  }
}