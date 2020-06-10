package Genericler

import NesneYonelimliProgramlama.daireDizileri

class StringDiziSinifi(){

    fun stringDiziYaz(dizi: Array<String>){


        for (gecici in dizi)
            println(gecici)
    }
}

class GenericDiziSınıfı<Genel>(var dizi: Array<Genel>){

    fun GenelDiziYaz(){

        for (gecici in dizi)
            println(gecici)
    }
}




fun main(args: Array<String>) {

    var stringDizi= arrayOf("ahmet","hasan","Mami")
    var StringDiziNesnesi=StringDiziSinifi()
    StringDiziNesnesi.stringDiziYaz(stringDizi)

    var IntDizi= arrayOf(1,2,3)
    var GenericNesne=GenericDiziSınıfı(IntDizi)
    GenericNesne.GenelDiziYaz()


}