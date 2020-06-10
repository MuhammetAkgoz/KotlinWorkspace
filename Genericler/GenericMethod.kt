package Genericler

abstract class GeometrikSekil(){

    abstract fun alanhesapla():Int

}


class Kare(var Kenaruzunlugu:Int):GeometrikSekil(){

    override fun alanhesapla(): Int {

        return Kenaruzunlugu*Kenaruzunlugu
    }

}

fun main(args: Array<String>) {

    var k1:Kare= Kare(3)
    var k2:Kare= Kare(4)

    var buyukKare= alanKarsilastir(k1, k2)
    println("Büyük olan kare ${buyukKare.alanhesapla()} ")

    var sekil=Kare(2)
    var sekil2=Kare(3)

    println("Büyük olan alan ${GenericAlanKarsilastir(sekil,sekil2).alanhesapla()}")
}

fun <Genel:GeometrikSekil> GenericAlanKarsilastir(sekil1:Genel, sekil2:Genel):Genel{
    if (sekil1.alanhesapla()<sekil2.alanhesapla()){

        return sekil2
    }
    else
        return sekil1

}

fun alanKarsilastir(k1: Kare,k2: Kare): Kare {
    if (k1.alanhesapla()<k2.alanhesapla()){

        return k2
    }
    else
        return k1
}