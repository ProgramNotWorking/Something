fun main(args: Array<String>) {

    println("Enter task number: ")
    var taskNumber = readln().toInt()

    while (taskNumber <= 0 || taskNumber > 2) {
        println("Enter correct number pls (1 or 2): ")
        taskNumber = readln().toInt()
    }







    when (taskNumber) {
        1 -> {
            val firstTask = FirstTask()

            println("Enter what u wanna do:\n" +
                    "1 - Find sum of two numbers\n" +
                    "2 - Input and then show array\n" +
                    "3 - Enter some list and then find index of some element of this list")
            val task = readln().toInt()

            when (task) {
                1 -> {
                    println("Enter first number: ")
                    val firstNumber = readln().toInt()
                    println("Enter second number: ")
                    val secondNumber = readln().toInt()

                    firstTask.sum(firstNumber, secondNumber)
                }
                2 -> {
                    val array: Array<Int>? = null

                    print("Enter size of array: ")
                    val arraySize = readln().toInt()
                    print("Enter array elements:\n")

                    for (item in 0..arraySize) {
                        array?.set(item, readln().toInt())
                    }

                    array?.let { firstTask.showArray(it) }
                }
                3 -> {
                    val list: MutableList<String>? = null

                    print("Enter size of list: ")
                    val size = readln().toInt()
                    print("Enter something in this list:\n")

                    for (item in 0..size) {
                        list?.set(item, readln())
                    }

                    print("Enter which element index u are interested in: ")
                    val element = readln()

                    list?.let { firstTask.showListIndex(list, element) }
                }
                else -> {
                    print("You are an idiot tho")
                }
            }
        }
        2 -> {
            print("Enter person name: ")
            val name = readln()
            print("Enter person age: ")
            val age = readln().toInt()

            val person = Person(
                name, age
            )
            person.sayHello()

            print("Enter student course: ")
            val course = readln().toInt()

            val student = Student(
                person.getName(),
                person.getAge(),
                course
            )
            student.sayHello()
        }
    }

}