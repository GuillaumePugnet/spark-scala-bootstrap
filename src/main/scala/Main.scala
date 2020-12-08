package guillaumepugnet.scala.template.helloworld

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]) {
    val spark = SparkSession
                  .builder
                  .appName("Simple Application")
                  .config("spark.master", "local")
                  .getOrCreate()

    spark.stop()
  }
}