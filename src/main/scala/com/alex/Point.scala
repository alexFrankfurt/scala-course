package com.alex

import math._

case class Point(x: Double, y: Double)

object PointOrdering extends Ordering[Point] {
  override def compare(x: Point, y: Point): Int =
    sqrt(pow(x.x, 2.0) + pow(x.y, 2)) compare sqrt(pow(y.x, 2) + pow(y.y, 2))
}
