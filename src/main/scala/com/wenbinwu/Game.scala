package com.wenbinwu

object Game {

  def transform(n: Int, grid: Seq[Seq[Int]], direction: String): Seq[Seq[Int]] = {
    direction match {
      case "RIGHT" => foldRight(grid)
      case "LEFT" => foldLeft(grid)
      case "UP" => foldLeft(grid.transpose).transpose
      case "DOWN" => foldRight(grid.transpose).transpose
    }
  }
  def foldRight(grid: Seq[Seq[Int]]): Seq[Seq[Int]] = {
    return for {row <- grid} yield
      row.foldRight(Nil: List[(Int, Boolean)]) {
        case (0, acc) => acc
        case (x, (y, false)::acc) if (x == y) => (x + x, true)::acc
        case (x, acc) => (x, false)::acc
      }.reverse.padTo(4, (0, false)).reverse.map(v => v._1)
  }

  def foldLeft(grid: Seq[Seq[Int]]): Seq[Seq[Int]] = {
    return for {row <- grid} yield
      row.foldLeft(Nil: List[(Int, Boolean)]) {
        case (acc, 0) => acc
        case ((y, false)::acc, x) if (x == y) => (x + x, true)::acc
        case (acc, x) => (x, false)::acc
      }.reverse.padTo(4, (0, false)).map(v => v._1)
  }
}
