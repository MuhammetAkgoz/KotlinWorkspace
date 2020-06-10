package Kalitim

interface okuyabilme{

    fun oku()
}

class tarayici:okuyabilme{

    override fun oku() {
        println("Tarayici okuyor")
    }
}

fun main(args: Array<String>) {
    var oku=object :okuyabilme{

        override fun oku() {
            println("isimsiz sınıftaki oku calıstı")
        }
    }
    oku.oku()
}