package Kalitim

open class Calısan(){

    open var pozisyon:String="Calisan"

    open fun calıs(){

        println("$pozisyon işe başladı")
    }

}

class Mudur:Calısan(){

    override var pozisyon: String="Mudur"
    override fun calıs() {
        println("$pozisyon işe başladı")

    }

}
open class Programcı:Calısan(){

    override var pozisyon: String="Programcı"
    override fun calıs() {
        println("$pozisyon işe başladı")

    }

}
class Pazarlamacı:Calısan(){

    override var pozisyon: String="Pazarlamacı"
    override fun calıs() {
        println("$pozisyon işe başladı")

    }

}

class  TemelProgramcı:Programcı(){

    override var pozisyon: String="Temel Programcı"
    override fun calıs() {

        println("$pozisyon işe başladı")
    }

    fun anlat(){
        println("Temel Programlama anlatılıyor.")
    }


}

fun main(args: Array<String>) {

    /*var calisanlar=Array<Any>(4){ Any() }

    calisanlar[0]=Calısan()
    calisanlar[1]=Mudur()
    calisanlar[2]=Programcı()
    calisanlar[3]=Pazarlamacı()

    mesaiBasla(calisanlar)*/

    var calisanlar=Array<Calısan>(5){ Calısan() }

    calisanlar[0]=Calısan()
    calisanlar[1]=Mudur()
    calisanlar[2]=Programcı()
    calisanlar[3]=Pazarlamacı()
    calisanlar[4]=TemelProgramcı()

    mesaiBaslaPoliymorfizm(calisanlar)

}

fun mesaiBasla(calisanlar: Array<Any>) {

    for (onankiCalisan in calisanlar){

        if (onankiCalisan is Calısan){
            var calisan:Calısan= onankiCalisan
            calisan.calıs()
        }
        else if (onankiCalisan is Mudur){
            var mudur:Mudur= onankiCalisan
            mudur.calıs()
        }
        else if (onankiCalisan is Programcı){
            var programcı:Programcı= onankiCalisan
            programcı.calıs()
        }
        else if (onankiCalisan is Pazarlamacı){
            var pazarlamacı:Pazarlamacı= onankiCalisan
            pazarlamacı.calıs()
        }

    }

}

fun mesaiBaslaPoliymorfizm(calisanlar: Array<Calısan>){

    for (onankiCalisan in calisanlar ){

        onankiCalisan.calıs()
        if (onankiCalisan is TemelProgramcı)
            onankiCalisan.anlat()
    }

}