class Note(private val name: String, private var text: String) {

    fun show() {
        println(name)
        println(text)
    }

    fun add(newText: String) {
        text += "\n" + newText
    }
}