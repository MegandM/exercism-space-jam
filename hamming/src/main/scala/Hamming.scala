object Hamming {
    def distance(x:String, y: String): Option[Int] = {
        // convert strings to lists
        val x_list = x.split("").toList
        val y_list = y.split("").toList
        
        // if different length not possibkle to compare
        if (x_list.length != y_list.length) None
            // if equal then no mismatches
            else if (x == y) Some(0)
                // else compare element by element and increase counter 
                else {
                    var cnt = 0
                    for( a <- 0 to (x_list.length - 1)) {
                        if (x_list.apply(a) != y_list.apply(a)) cnt += 1
                    }
                    Some(cnt)
                }
    }
        
    
}