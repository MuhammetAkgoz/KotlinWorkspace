package Abstractveİnterface

object ogr1{
    //static davranış gösterirler
    var sayac:Int=0
    fun sayacıGoster(){

        println("sayac:"+ sayac)
    }


}


fun main(args: Array<String>) {

    var ogr1:ogr1=ogr1
    ogr1.sayac=8
    ogr1.sayacıGoster()

    var ogr2:ogr1=ogr1
    ogr1.sayac=18
    ogr1.sayacıGoster()

}