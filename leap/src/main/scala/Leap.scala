object Leap {
  def leapYear(year: Int): Boolean = if (year % 4 == 0) {
                                        if (year % 100 == 0) {
                                          if (year % 400 == 0)
                                            true
                                          else
                                            false
                                        }
                                        else
                                          true
                                      }
                                      else
                                        false

}
