package KotlinDonguYapıları

fun main(args: Array<String>) {


    var sayilar : Array<Int> = arrayOf(1,2,3)

    var isimler= arrayOf("Ahmet","Mehmet")

    var sayilar1= Array<Int>(10){0}


    for (i in 0..sayilar1.size-1)
    {
        sayilar1[i]=i+1
        println(sayilar1[i])


    }

    var degiskenler= arrayOf("Mami",3,true,3.5)

    for (i in 0..degiskenler.size-1)
        println(degiskenler[i])


    degiskenler[0]="Akgöz"

    for (i in 0..degiskenler.size-1)
        println(degiskenler[i])


}