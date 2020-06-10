package NesneYonelimliProgramlama

class Ogrenci(isim:String,yas:Int){

    var gelenIsim:String
    var gelenYas:Int

    init {
        this.gelenIsim=isim
        this.gelenYas=yas
        println("İnit blogu çalıştı")
        println("İsim: "+isim+"\n"+"Yas: "+yas)
    }

    fun ogrenciBil(){

        println("İsim: "+gelenIsim+"Yas: "+gelenYas)


    }

}

fun main(args: Array<String>) {

    var ogr1:Ogrenci=Ogrenci("Mami",19)
    ogr1.ogrenciBil()

}