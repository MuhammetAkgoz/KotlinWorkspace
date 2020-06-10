package Kalitim

open class Person(isim:String, yas:Int, isMan:Boolean){

    var isim:String
    var yas:Int
    var isMan:Boolean

    init {
        println("İnit bloğu çalıştı")
        if (yas<0){
            this.yas =999
        }
        this.isim=isim
        this.yas=yas
        this.isMan=isMan
    }
    override fun toString():String{

        var cinsiyet: String = if (isMan==true)"Erkek" else "kadın"
        return "isim:$isim  yas:$yas  cinsiyet:$cinsiyet"
    }

  class Ogretmen(isim:String, yas:Int, isMan:Boolean, var brans: String):Person(isim,yas,isMan){


      override fun toString(): String {
          return super.toString()+ " brans=$brans"
      }

  }

}

fun main(args: Array<String>) {

    var p1:Person=Person("Mami",19,true)
    println(p1)
    var ogrt1:Person.Ogretmen= Person.Ogretmen("Elif",-9,false,"İnglizce")
    println(ogrt1)

}