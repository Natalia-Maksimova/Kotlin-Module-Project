fun main(args: Array<String>) {

    val archives: MutableList<Archive> = mutableListOf()

    while(true) {
        println("0. Создать архив")
        Menu.show(archives)
    }
}