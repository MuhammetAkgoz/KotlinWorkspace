package UYGULAMALAR

import java.util.*

fun main(args: Array<String>) {

    val calendar= Calendar.getInstance()
    var ay= calendar.get(Calendar.MONTH)
    var gun= calendar.get(Calendar.DAY_OF_MONTH)
    var yil= calendar.get( Calendar.YEAR)


    var saat= calendar.get(Calendar.HOUR_OF_DAY)
    var dk= calendar.get(Calendar.MINUTE)
    var san=calendar.get(Calendar.SECOND)

    println("Tarih= "+(ay+1)+"/"+gun+"/"+yil)
    println("Saat= "+saat+":"+dk+":"+san)


    var aylar:Array<String> = arrayOf("Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık")

    var buAy= calendar.get(Calendar.MONTH)

    println("Bu ay: "+aylar[buAy])

}