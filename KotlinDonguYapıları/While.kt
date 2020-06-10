package KotlinDonguYapıları

fun main(args: Array<String>) {

    var i=1
    while (i<=10) {
        println(i)
        i++
    }
    //1 ile 100 arasındaki çift sayiların toplamını bulma
    var toplam=0
    for(sayi in 1..100)
    {
        if(sayi%2==0)
            toplam=toplam+sayi

    }

    println(toplam)

    var k=1
    var toplam2=0

    while (k<=100)
    {
        if (k%2==0)
        {
            toplam2=toplam2+k
        }
       k++
    }

    println(toplam2)


}