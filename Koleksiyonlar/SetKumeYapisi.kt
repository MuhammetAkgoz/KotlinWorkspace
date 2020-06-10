package Koleksiyonlar


//setof
fun main(args: Array<String>) {


    var degistirilemeyenSet= setOf("hasan","irem",3,4,"irem")


    for (oankiDeger in degistirilemeyenSet){
        println(oankiDeger)
    }


    var degistirelebilenSet= mutableSetOf<Int>()

    degistirelebilenSet.add(9)
    degistirelebilenSet.add(6)
    degistirelebilenSet.add(1)
    degistirelebilenSet.add(6)
    degistirelebilenSet.add(9)


    println(degistirelebilenSet.size)
    println(degistirelebilenSet)

    for (oankiSAyi in degistirelebilenSet){
        println(oankiSAyi)
    }

}