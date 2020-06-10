package DizilerKavramı

fun main(args: Array<String>) {

    var sayilar1= 1..20
    var sayilar2= 1.rangeTo(20)
    var sayilar3= 20.downTo(1)
    var sayilar4= 0.rangeTo(100).step(5)

    var varMı= 20 in sayilar4
    println("22 sayisi var mi: "+varMı)

    println(sayilar3.first)
    println(sayilar3.last)
    println(sayilar3.step)

}