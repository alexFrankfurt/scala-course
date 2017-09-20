package com.alex

object Main {
  def main(args: Array[String]): Unit = {

    val arr =Array(Point(3, 4), Point(2, 8), Point(1, 10))
    util.Sorting.quickSort(arr)(PointOrdering)
    println(arr.mkString(", "))
  }
}
