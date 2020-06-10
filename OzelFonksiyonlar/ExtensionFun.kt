package OzelFonksiyonlar

import DizilerKavramı.sayi

fun main(args: Array<String>) {

    println("Normal faktörliyel :5"+ faktoriyelBul(5))
    println("EXtension faktörliyel :8"+ 8.faktöriyelBulExt())

    var yazi= "Mami               Akgöz\t Kotlin"
    println(yazi)

    println("Düzenli Hali: "+yazi.boslukDuzenle())

    var emre=ogr()
    emre.yetenek="Kotlin"
    emre.yetenekYazdir()

    var mami=ogr()
    mami.yetenek="Android"
    mami.yetenekYazdir()

    var ali:ogr=emre.yetenekBirlestir(mami)
    ali.yetenekYazdir()

    var can:ogr=ali yetenekBirlestir mami
    can.yetenekYazdir()
}

fun faktoriyelBul(sayi: Int):Int{

    var sonuc=1

    for (i in 1..sayi)
        sonuc=sonuc*i

    return sonuc

}

fun Int.faktöriyelBulExt():Int{

    var sonuc=1

    for (i in 1..this)
        sonuc=sonuc*i

    return sonuc


}

fun String.boslukDuzenle():String{

    var regex=Regex("\\s+")
    return regex.replace(this," ")

}// boşlukları kapatma fonksiyonlari

infix fun ogr.yetenekBirlestir(mami:ogr):ogr{

    var oluşturulanOgrNesnesi=ogr()

    oluşturulanOgrNesnesi.yetenek=this.yetenek+" "+mami.yetenek
    return oluşturulanOgrNesnesi
}