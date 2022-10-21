import collection.immutable.TreeMap

class School {
  type DB = Map[Int, Seq[String]]

  // store my school database TreeMap (it is sorted by default using the natural order the its key)
  private var myDB : DB = TreeMap()

  // add a new student, get the value of the grade it belongs and add the name
  def add(name: String, g: Int) = { myDB += (g -> (grade(g) :+ name))}

  // get the current School Map
  def db: DB = myDB
  
  // get the list of students given a grade
  def grade(g: Int): Seq[String] = myDB.getOrElse(g, Seq.empty)
  
  // sort values, key are sorted by default as i is a TreeMap
  def sorted: DB = myDB.map { case (k, v) => k -> v.sorted }
}

