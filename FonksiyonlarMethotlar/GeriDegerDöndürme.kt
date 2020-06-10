package FonksiyonlarMethotlar

fun main() {


   var isimVer= geriDon("Mami")

    println(isimVer)
    println("Bir sayi gir : ")
    var fakt: Int= readLine()!!.toInt()
    println(faktoriyel(fakt))

}

fun geriDon( isim: String):String {

    return "Merhaba "+ isim

}

fun faktoriyel(sayi: Int): Int{

    var toplam= 1
    for ( i in sayi downTo 1)
    {
        toplam= toplam*i

    }

    return toplam


}