class Menu (){

    companion object {
        fun show (options: MutableList<Archive>) {
            for (item in options) println("${options.indexOf(item)+1}. ${item.name}")
            println("${options.count()+1}. Выход")
            when(val act: Int = chooseItem()) {
                0 -> options.add(Archive())
                (options.count()+1) -> return
                in 1..(options.count()) -> {
                    println(options[act-1].name)
                }
                else -> println("Этого пункта меню не существует. Попробуйте ещё раз.")
            }
        }

        private fun chooseItem(): Int {
            var act: String = readln()
            var flag = true
            while(flag) {
                for(ch in act) {
                    if (!ch.isDigit()) {
                        flag = true
                        println("Неверный выбор. Попробуйте ещё раз.")
                        break
                    }
                    flag = false
                }
                if (flag) act = readln()
            }
            return act.toInt()
        }
    }



}