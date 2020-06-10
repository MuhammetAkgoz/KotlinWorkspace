package KotlinDonguYapıları

fun main(args: Array<String>) {

    for (i in 1..10)
    {
        println(i)
        if(i==7){
            break
        }

    }

    var mail="muhammet.akgz@gmail.com"
    for(i in mail)
    {

        if (i=='@')
              break
        print(i)

    }
    println()
    var toplam=0
    for(sayi in 1..10)
    {

        if(sayi==7)
           continue
       // if (sayi==3)
         //   return

        toplam=toplam+sayi
        println("ANLIK SAYİ: "+sayi)
        println("Toplamı: "+toplam)
    }


    döngü@ for (i in 1..3)
        for (k in 1..4)
        {
            println("$i X $k: "+i*k)
            if (k*i==6)
            {
                break@döngü
            }

        }



}