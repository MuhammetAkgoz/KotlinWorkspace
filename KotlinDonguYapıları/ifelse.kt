package KotlinDonguYapıları

fun main(args: Array<String>) {

    println("Notunuzu giriniz: ")
    var not: Int= readLine()!!.toInt()
    var karneNotu: Int=0

    var sonuc:Any=if(not in 0..44) {
        println("1 aldınız")
        karneNotu = 1
        "F"
    }
    else if (not in 45..54)
    {
        println("2 aldınız")
        karneNotu=2
        "D"
    }
    else if (not in 55..69)
    {
        println("3 aldınız")
        karneNotu=3
        "C"
    }
    else if (not in 70..84)
    {
        println("4 aldınız")
        karneNotu=4
        "B"
    }
    else if (not in 85..100)
    {
        println("Tebrikler 5 aldınız")
        karneNotu=5
        "A"
    }
    else
        println("Böyle bir not olamaz")


    println("Karne notunuz: $karneNotu")
    println("Harf notu $sonuc")



}