package Abstractveİnterface

interface Hayvan{//interfaceler sınıf değildir nesne türetilemez

    fun avlan()// interfacede methodlar public ve abtracter
    fun interfaceMethodu(){// final değil publictir

        println("interface methodu çalıştı")
    }


}

abstract class Kedigiler:Hayvan{

    abstract fun takipet()

}
open class Kedi:Kedigiler(){
    override fun avlan() {
        println("Kedi avlandi.")

    }

    override fun takipet() {
        println("Kedi sınıfının takipedi çalıştı.")
    }

}

class Kaplan:Kedi(){

    override fun avlan() {
        println("Kaplan avlandi")
    }

    override fun takipet() {
        println("Kaplan sınıfınını takip edi calıstı")
    }
}

fun main(args: Array<String>) {
    var h1:Hayvan=Kedi()
    var h2:Hayvan=Kaplan()

    h1.avlan()
    h2.avlan()

}