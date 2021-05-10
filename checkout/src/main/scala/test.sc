def createToBuyMap (items: String): Map[Char, Int] = {
  (for {
    x <- items
    i = items.count(_ == x)
  } yield (x -> i)).toMap
}

