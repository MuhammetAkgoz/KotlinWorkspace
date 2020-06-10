package Kalitim

open class Asker{

     open fun selamVer(){
        println("Asker selam ver ")
    }

}

class Er:Asker(){

    override fun selamVer() {
        println("Er selam ver ")
    }

}
class yuzBasi:Asker(){

    override fun selamVer() {
        println("Yuzbası selam ver ")
    }
}

fun main(args: Array<String>) {

    var asker=Asker()
    var Er=Er()
    var yuzbasi=yuzBasi()

    isaretVer(asker)
    isaretVer(Er)
    isaretVer(yuzbasi)
}

fun isaretVer(asker:Asker){

    asker.selamVer()

}