package Kalitim

class arabaMotoru(){//hiyerarşik yapi.

    fun calis(){}
    fun dur (){}
}

class pencere(){
    fun asagacek(cm:Int){}
    fun yukaricek(cm:Int){}
}
class kapi(){
    var pencere=pencere()

    fun ac(){}
    fun kapat(){}
}
class teker(){

    fun havaver(gaz:Int){}
}
class Araba(){

    var motor=arabaMotoru()
    var sagpencere=pencere()
    var solpencere=pencere()
    var kapilar= Array<kapi>(4){kapi()}
    var teker=Kalitim.teker()

}
fun main(args: Array<String>) {

    var arabam:Araba= Araba()
    arabam.motor.calis()
    arabam.teker.havaver(50)
    arabam.sagpencere.asagacek(20)
    arabam.kapilar[2].pencere.yukaricek(40)
}