object Etl {
    // define scrabble types
    type scrabblePoints = Map[Int, Seq[String]]
    type scrabbleLetters = Map[String, Int]

    def transform(points: scrabblePoints): scrabbleLetters = {
        // init scrabble Letters
        var myScrabble: scrabbleLetters = Map.empty[String, Int]
        // for each point
        for(p <- points.keys){
            // get the combination letter-point
            var listLetterPoint = (points.getOrElse(p, Seq("")) map { l => (l.toLowerCase() -> p) })
            // add it to scrabble Letters
            listLetterPoint.foreach(g => myScrabble += g)
        }
        // return scrabble Letters
        myScrabble
    }
}