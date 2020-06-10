package NesneYonelimliProgramlama

class Kare{

    var tekKenar : Int=0




    fun  alanHesapla():Int{

        return tekKenar*tekKenar

    }

    constructor(kenar: Int){
        this.tekKenar= kenar

    }

    constructor(){

        this.tekKenar=0

    }
}

fun main(args: Array<String>) {

    var k1 = Kare()
    println("k1 nin alanı: "+k1.alanHesapla())

    var k2= Kare(5)
    println("k2 nin alanı: "+k2.alanHesapla())

}