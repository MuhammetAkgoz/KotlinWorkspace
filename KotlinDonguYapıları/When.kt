package KotlinDonguYapıları

fun main(args: Array<String>) {

    println("Notunuzu giriniz: ")
    var not: Int= readLine()!!.toInt()

   var sonuc:Int =when(not){

       in 0..44->{
           println("1 aldınız")
           1
       }
       in 45..54->{
           println("2 aldınız")
           2
       }
       in 55..69->3
       in 70..84->4
       in 85..100->5
      else-> {

          println("Böyle bir not olamaz")
          -1
      }

    }
    if (sonuc==-1)
        println("Tekrar deneyiniz")
    else
    println("Karne notunuz  :$sonuc")
}