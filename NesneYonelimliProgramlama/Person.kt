package NesneYonelimliProgramlama

class Person {

    var isim: String="Mami"
    var yas: Int=19

    fun selamVer(){

        println("Hello There")
    }

    fun dogumYili()=2020-yas
}

fun main() {

    var kisi:Person= Person()
    println(kisi.isim+"\n"+kisi.yas)

    kisi.selamVer()
    println(kisi.dogumYili())


}