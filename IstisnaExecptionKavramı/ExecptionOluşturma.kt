package IstisnaExecptionKavramı

import java.lang.Exception
import java.lang.IllegalArgumentException

class Person{

    var yas:Int=0
    get() = field
    set(value) {

        if (value<0){

            val istisna= IllegalArgumentException("Personel yaşı 0 dan küçük olamaz")
            throw istisna
        }
        else{

            field=value
        }
    }
}


fun main(args: Array<String>) {

    var p1=Person()

    println(p1.yas)
    try {
        p1.yas=-9

    }catch (istisna: Exception){

        println("hata1 : "+ istisna.message)// bizim yazdıgımız mesajı gosterir
        println("hata1 : "+ istisna.toString())//kendi mesaj verir
    }
    println("program bitti")
}