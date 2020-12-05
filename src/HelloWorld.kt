fun main(args: Array<String>) {
    println("Hello, World!");
    val a: Int = 10000
    val d: Double = 100.00
    val f: Float = 100.00f
    val l: Long = 1000000004
    val s: Short = 10
    val b: Byte = 1

    println("Your Int Value is "+a);
    println("Your Double  Value is "+d);
    println("Your Float Value is "+f);
    println("Your Long Value is "+l);
    println("Your Short Value is "+s);
    println("Your Byte Value is "+b);

    val letter: Char    // defining a variable
    letter = 'A'        // Assigning a value to it
    println("$letter")
    val letter2: Boolean   // defining a variable
    letter2 = true         // Assinging a value to it
    println("Your character value is "+"$letter2")

    var rawString :String  = "I am Raw String!"
    val escapedString : String  = "I am escaped String!\n"

    println("Hello!"+escapedString)
    println("Hey!!"+rawString)
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println("Hey!! I am array Example"+numbers[2])
    val numbers2: MutableList<Int> = mutableListOf(1, 2, 3) //mutable List
    val readOnlyView: List<Int> = numbers2                // immutable list
    println("my mutable list--"+numbers2)        // prints "[1, 2, 3]"
    numbers2.add(4)
    println("my mutable list after addition --"+numbers2)        // prints "[1, 2, 3, 4]"
    println(readOnlyView)
    //readOnlyView.clear()    // ⇒ does not compile
// gives error

    val items = listOf(1, 2, 3, 4)
    println("First Element of our list----"+items.first())
    println("Last Element of our list----"+items.last())
    println("Even Numbers of our List----"+items.
    filter { it % 2 == 0 })   // returns [2, 4]

    val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
    println(readWriteMap["foo"])  // prints "1"

    val strings = hashSetOf("a", "b", "c", "c")
    println("My Set Values are"+strings)
    val i:Int  = 2
    for (j in 1..4)
        print(j) // prints "1234"

    if (i in 1..10) { // equivalent of 1 < = i && i < = 10
        println("we found your number --"+i)
    }
    //swithc
    val x:Int = 5
    when (x) {
        1 -> print("x = = 1")
        2 -> print("x = = 2")

        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
    //////
    var q=Question();
    q=Question();
    q.Answer="42";
    q.display();
    println("The answer is ${q.Answer}.The questions is ${q.Question}");
}

class Question{
    var Answer:String=""
    val Question:String = "What is the answer"
    fun display(){
        println("You said $Answer");
    }
}