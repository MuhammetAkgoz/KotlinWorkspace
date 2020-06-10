package DizilerKavramı

fun main() {

    println("Adınızı giriniz: ")
    var ad: String?= readLine()
    println("Soyadınızı giriniz: ")
    var soyad: String? = readLine()
    println("Yaşinizi giriniz: ")
    var yas: Int= readLine()!!.toInt()


    println("İsimim: $ad"+"\nSoyadım: $soyad"+"\nYaşım: $yas")

}