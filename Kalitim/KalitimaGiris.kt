package Kalitim


open class geometrikSekiler(){

    var en: Int=0
    var boy: Int=0


   open fun alanHesapla(){

        println("Şeklin alanı: "+(boy*en))
    }

     override fun toString(): String {
         return "en: $en  boy: $boy"
     }

 }

class dikdörtgen:geometrikSekiler(){

        override fun alanHesapla(){
            println("Diktörgenin alanı: "+(boy*en))

        }
 }

class Kare: geometrikSekiler(){

    override fun alanHesapla() {
        println("Karenin alanı: "+(boy*en))
    }

}

fun main(args: Array<String>) {

    var g1: geometrikSekiler= geometrikSekiler()
    g1.boy=6
    g1.en=4
    g1.alanHesapla()

    var d1: dikdörtgen= dikdörtgen()
    d1.boy=6
    d1.en=8
    d1.alanHesapla()

    var k1: Kare = Kare()
    k1.boy=6
    k1.en=6
    k1.alanHesapla()


}
