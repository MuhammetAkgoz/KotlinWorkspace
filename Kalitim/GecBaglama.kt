package Kalitim

open class Hayvan(){


    open fun avYakala(){

        println("Hayvan av yakaladı")
    }

}

class Kartal:Hayvan(){


    override fun avYakala() {
        println("Kartal av yakaladı")
    }

}
class Timsah:Hayvan(){


    override fun avYakala() {
        println("Timsah  av yakaladı")
    }

}

fun main(args: Array<String>) {

    var hayvanlar = Array<Hayvan>(3){Hayvan()}

    for (i in 0 until hayvanlar.size-1){

        hayvanlar[i]=rastgeleSayilar()
    }

    for (hayvan in hayvanlar)
        hayvan.avYakala()


}

fun rastgeleSayilar():Hayvan {

    var rastgelesayi=(Math.random()*3).toInt()

    var oankiHayvan:Hayvan= Hayvan()
    when(rastgelesayi){
      0 ->oankiHayvan=Kartal()
      1 ->oankiHayvan=Hayvan()
      2 ->oankiHayvan=Timsah()
    }
    return oankiHayvan

}
