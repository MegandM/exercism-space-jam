import scala.util.matching.Regex

object Bob {
  def response(statement: String): String = {
    val yellingPattern: Regex = "[0-9A-Z\\W]".r
    val yellingCondition: String = (yellingPattern findAllIn statement).mkString
    
    val yellingQuestionPattern: Regex = "[A-Z? ]".r
    val yellingQuestionCondition: String = (yellingQuestionPattern findAllIn statement).mkString
    val yellingQuestionConditionStripped: String = yellingQuestionCondition.replaceAll("\\s+", "")
    
    val lowerCasePattern: Regex = "[a-z]".r
    val lowerCasePatternCondition: String = (lowerCasePattern findFirstIn statement).mkString
    
    val noLettersPattern: Regex = "[0-9\\W]".r
    val noLettersCondition: String = (noLettersPattern findAllIn statement).mkString
    
    val statementStripped: String = statement.replaceAll("\\s+", "")
     
    // normal sentence: contains question mark at the end (whitespace after question mark allowed) and, either contains at least one lower case letter or it does not contains letters at all
    if ((statement contains "?") & ((statement.trim() indexOf "?") == statement.trim().length() - 1) & ((lowerCasePatternCondition.length() != 0) | (noLettersCondition.length() == statement.length()))) "Sure."
    
    // yelling: capital letters, numbers (not only), special characters (no question mark) and/or exclamation mark
      else if ((yellingCondition.length() == statement.length()) & (noLettersCondition.length() != statement.length()) & !(statement contains "?")) "Whoa, chill out!"
      
      // yelling question: capital letters and question mark
        else if ((yellingQuestionConditionStripped.length() == statementStripped.length()) & (yellingQuestionConditionStripped.length() != 0)) "Calm down, I know what I'm doing!"
          
          // no input
          else if (statementStripped.length() == 0) "Fine. Be that way!"
            
            // any other case
            else "Whatever."
  }
}