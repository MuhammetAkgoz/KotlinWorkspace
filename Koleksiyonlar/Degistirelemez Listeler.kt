package Koleksiyonlar

//List
//mutable veya immutable
// immutable : listof() veya listofNotNull()
// değişmez yapıya sahiptirler ekleme veya silme yapılamaz.
fun main(args: Array<String>) {

    var listofListesi= listOf(1,2,"Mami",true,5.4)

    for (oankieleman in listofListesi){

        println(oankieleman)
    }
    println(listofListesi.get(3))
    println(listofListesi[3])
   var s1= listofListesi.get(0) as Int
    var s2=listofListesi.get(1) as Int


    println(s1+s2)
    println(listofListesi.size)

    var listofNOwNullListesi= listOfNotNull(3,4,null,"İrem","Mami",null,false,null,3.4)
    println(listofNOwNullListesi.size)
}