fun main(args: Array<String>) {

    var s1 = "Die Hard"
    var s2 = "End Game"
    var s3 = "Titanic"
    var s4 = "Contact"
    var s5 = "Grease"
    var s1Inp: String
    var s2Inp: String
    var s3Inp: String
    var s4Inp: String
    var s5Inp: String
    var correctAnswer:Int = 0

    println("What movie did Bruce Willis star in about terrorists taking over a building?")
    s1Inp = readLine()!!.toString()
    // compare the input string with the answer to the first question
    var result1:Int = s1.compareTo(s1Inp,true)
    if (result1 == 0) {
        println("You're answer is correct!")
        correctAnswer=correctAnswer + 1 }
    println("What movie did Thor of the Marvel Avengers gain a lot of weight?")
    s2Inp = readLine()!!.toString()
    // compare the input string with the answer to the second question
    var result2:Int = s2.compareTo(s2Inp,true)
    if (result2 == 0) {
        println("You're answer is correct!")
        correctAnswer = correctAnswer + 1 }
    println("What movie did Kate Winslet's character have to let go of her love to stay alive?")
    s3Inp = readLine()!!.toString()
    // compare the input string with the answer to the third question
    var result3:Int = s3.compareTo(s3Inp,true)
    if (result3 == 0) {
        println("You're answer is correct!")
        correctAnswer = correctAnswer + 1 }
    println("What movie did Jodie Foster make contact with aliens?")
    s4Inp = readLine()!!.toString()
    // compare the input string with the answer to the fourth question
    var result4:Int = s4.compareTo(s4Inp,true)
    if (result4 == 0) {
        println("You're answer is correct!")
        correctAnswer = correctAnswer + 1  }
    println("What movie did John Travolta and Olivia Newton John star as Rydell High School students?")
    s5Inp = readLine()!!.toString()
    // compare the input string with the answer to the fifth question
    var result5:Int = s5.compareTo(s5Inp,true)
    if (result5 == 0) {
        println("You're answer is correct!")
        correctAnswer = correctAnswer + 1 }
    println("   ")
    println("The number answers you have correct are: $correctAnswer")
    // Ask if the number of correct answers is all five questions.
    if (correctAnswer == 5)
    // reward the user for getting all five questions correct.
        println("Congratulations perfect score!")
}