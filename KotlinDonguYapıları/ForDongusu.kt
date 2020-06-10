package KotlinDonguYapıları

fun main(args: Array<String>) {
/*
    for (i in 1..10)
    {

        println(i)

    }

    for (i in 1..10)
    {

        println("Mami Akgöz")
    }

    var isim="Mami Akgöz"
    for(i in isim)
       if(!i.equals(isim.last()))
    {
        print(i+",")
    }
    else
           println(i)

    var toplam=0
    var sayilar: Array<Int> = arrayOf(30,44,12,15)
    for (i in sayilar)
        toplam=toplam+i
        println("Dizi toplamı: $toplam")
*/
    for( i in 1..3)
        for(j in 1..3)
            println("$i X $j: "+i*j)

}