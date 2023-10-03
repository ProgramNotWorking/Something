open class Person(personName: String, personAge: Int): SomeInterface {

    protected val name = personName
    protected val age = personAge

    open fun sayHello() {
        println("Hello, my name is $name, I am $age years old")
    }

    override fun someFunction() {
        println("I am fun from interface")
    }

    fun getName(): String = name

    fun getAge(): Int = age

}

class Student(
    personName: String,
    personAge: Int,
    studentCourse: Int
): Person(personName, personAge) {

    private val course = studentCourse

    override fun sayHello() {
        println("Hello, my name is ${super.name}, I am ${super.age} years old, studying on $course course")
    }

}

interface SomeInterface {
    fun someFunction()
}