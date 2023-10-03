class FirstTask {

    fun sum(firstNumber: Int, secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

    fun showArray(someArray: Array<Int>) {
        for (item in someArray) {
            println(item)
        }
    }

    fun showListIndex(list: MutableList<String>, name: String) {
        val index = list.indexOf(name)

        if (index != -1) {
            println(index)
        } else {
            println("There is no that name in this list")
        }
    }

}