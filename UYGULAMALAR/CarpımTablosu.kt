package UYGULAMALAR

fun main(args: Array<String>) {
    println("ÇARPIM TABLOMUZ")
    println("............................................................................")
    for (i in 1..10){
        for (k in 1..10)
        {
            print("$i*$k="+(i*k)+"\t")

        }
        println()

    }
    println("..............................................................................")
}