package Kalitim

abstract class sporcu(){

    abstract fun sporYap()
}
class buzPateni:sporcu(){

    override fun sporYap() {
        println("Buz pateni yapiyor")
    }
}
class basketbolcu:sporcu(){

    override fun sporYap() {
        println("Sayi atiyor")
    }
}
interface spor1{
    fun buzpateniYap(){
        println("Buz pateni yapiyor")
    }
}
interface spor2{
    fun sayiAt(){
        println("Sayi atiliyor")
    }
}

class sportmenler:spor1,spor2{
    override fun buzpateniYap() {

    }

    override fun sayiAt(){

    }
}



