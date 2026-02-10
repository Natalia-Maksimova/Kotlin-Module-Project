class Archive() {
    var name: String
    var content: MutableList<Note> = mutableListOf()

    init {
        print("Введите название архива: ")
        name = readln()
        while (name == "") {
            print("Название не может быть пустым. Введите название ещё раз: ")
            name = readln()
        }
        println("Архив $name успешно создан.")
    }
}
