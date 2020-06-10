package UYGULAMALAR

fun main(args: Array<String>) {

    println("Birinci kenari giriniz: ")
    var kenar1: Int= readLine()!!.toInt()
    println("İkinci kenari giriniz: ")
    var kenar2: Int= readLine()!!.toInt()
    println("Ücüncü kenari girinisz: ")
    var kenar3: Int= readLine()!!.toInt()


    if(kenar1==kenar2 && kenar1==kenar3 && kenar2==kenar3)
        println("Bu ücgen eşkenardır.")

    else if(kenar1==kenar2 || kenar2==kenar3 || kenar1==kenar3)
        println("Bu ücgen ikizkenardır.")

    else
        println("bu ücgen çeşitkenardır")
}