package Kalitim

open class Person2 {

    var isim: String
    var yas: Int
    var cinsiyet:Boolean=false

    constructor(isim: String, yas: Int) {
        this.isim=isim
        this.yas=yas
    }

    constructor (isim: String, yas: Int, cinsiyet:Boolean) : this(isim, yas) {

        this.cinsiyet=cinsiyet
    }

    override fun toString(): String {

        var cinsiyet: String = if (cinsiyet == true) "Erkek" else "kadın"
        return "isim:$isim  yas:$yas  cinsiyet:$cinsiyet"



    }
}
class Ogretmen2:Person2{

        var brans:String

    constructor(isim: String, yas: Int, cinsiyet:Boolean,brans:String):super(isim, yas, cinsiyet){
        this.brans=brans
    }

    override fun toString(): String {
        return super.toString()+" Brans:$brans"
    }



}


fun main(args: Array<String>) {
    var p1:Person2=Person2("Mami",19,true)
    println(p1)
    var p2:Person2= Person2("İrem",20)
    println(p2)
    var ogrt1:Ogretmen2= Ogretmen2("Fatma",25,false,"Matematik")
    println(ogrt1)
}