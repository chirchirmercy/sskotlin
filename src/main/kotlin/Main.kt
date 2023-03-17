fun main(){
    oddNumbers()
    numbers()
    println(Names(arrayOf("eliud","mercy","josephine","brenda")))

    robotDescition(30)
    robotDescition(20)
    robotDescition(15)
}
//1. Create a function that prints out all the odd numbers between 1 and 100 (2pts)
fun oddNumbers(){
    for (num in 1..100){
        if(num % 2!=0){
            println(num)
        }

    }


}
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts)
fun Names(names:Array<String>):Int {

    var x = 0
    for (z in names) {
        if (z.length >=5) {
            x++
        }
    }
    return x++
}
//3. You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)

fun robotDescition (age:Int){
    when(age){
        in 0..6 -> println("glass of milk")
        in 7..15 -> println("bottle of fanta orange")
        else ->
            println ("botlle of cocacola")

    }
}

//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)

fun numbers() {
    for (num in 1..100) {
        if (num % 3 == 0 && num % 5 == 0) {
            println("FizzBuzz")
        } else if (num % 3 == 0) {
            println("Fizz")
        } else if (num % 5 == 0) {
            println("Buzz")
        } else {
            println(num)
        }
    }
}