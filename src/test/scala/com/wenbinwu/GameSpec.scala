package com.wenbinwu

import org.scalatest._

class GameSpec extends FlatSpec with Matchers {
  "A game" should "be able to move right" in {
    assert(
      Game.transform(4, Seq(Seq(4, 0, 2, 0), Seq(0, 0, 0, 8), Seq(4, 0, 2, 4), Seq(2, 4, 2, 2)), "RIGHT") == Seq(Seq(0, 0, 4, 2), Seq(0, 0, 0, 8), Seq(0, 4, 2, 4), Seq(0, 2, 4, 4))
    )
  }
  "A game" should "be able to move left" in {
    assert(
      Game.transform(4, Seq(Seq(2, 0, 2, 0), Seq(0, 2, 0, 4), Seq(2, 8, 0, 8), Seq(0, 8, 0, 16)), "LEFT") == Seq(Seq(4, 0, 0, 0), Seq(2, 4, 0, 0), Seq(2, 16, 0, 0), Seq(8, 16, 0, 0))
    )

  }
  "A game" should "be able to move up" in {
    assert(
      Game.transform(4, Seq(Seq(2, 0, 2, 0), Seq(0, 2, 0, 4), Seq(2, 8, 0, 8), Seq(0, 8, 0, 16)), "UP") == Seq(Seq(4, 2, 2, 4), Seq(0, 16, 0, 8), Seq(0, 0, 0, 16), Seq(0, 0, 0, 0))
    )

  }
  "A game" should "be able to move down" in {
    assert(
      Game.transform(4, Seq(Seq(2, 0, 2, 0), Seq(0, 2, 0, 4), Seq(2, 8, 0, 8), Seq(0, 8, 0, 16)), "UP") == Seq(Seq(4, 2, 2, 4), Seq(0, 16, 0, 8), Seq(0, 0, 0, 16), Seq(0, 0, 0, 0))
    )
  }

}
