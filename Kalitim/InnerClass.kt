package Kalitim

class dısSinif(){

    var sinifAdi="Dış sınıf"
    fun disSinifMethodu(){

        println("Dış sınıftan merhaba")
    }

    inner class icSinif(){
        var sinifadi="İç sinif"
        fun içSinifMethodu(){

            disSinifMethodu()
            println("İç siniftan merhaba")
        }

        inner class enİctekiSinif(){
            var enic="En içteki sinif"
            fun enİçtekiSinifMethodu(){

                disSinifMethodu()
                içSinifMethodu()
                println("En iç siniftan merhaba")
            }
        }
    }
}

fun main(args: Array<String>) {

    var nesne=dısSinif().icSinif().enİctekiSinif()
    nesne.enİçtekiSinifMethodu()
}