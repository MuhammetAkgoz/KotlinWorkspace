package OzelFonksiyonlar

class Person{

    var ad:String=""
    var yas:Int=-1

    fun kendiniTanıt(){

        println("Merhaba"+" ben $ad" + " yaşım $yas")
    }

}

fun main(args: Array<String>) {

    var kisi:Person= Person()
   /* kisi.ad="Emre"
    kisi.yas=29

    kisi.kendiniTanıt()*/

    with(kisi){
        ad="Emre"
        yas=29

    }

    kisi.kendiniTanıt()
    kisi.apply {
        ad="hasan"
        yas=40
    }.kendiniTanıt()
}