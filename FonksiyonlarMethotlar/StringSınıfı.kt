package FonksiyonlarMethotlar

fun main(args: Array<String>) {


    var takin = "Fenerbahçe"

    println(takin)
    println(takin.length)
    println(takin.get(0)+""+takin.get(1))
    println(takin.substring(0,6))
    println(takin)

    println(takin.indexOf("r"))
    println(takin.indexOf("ç"))
    println(takin.toUpperCase())
    println(takin.toLowerCase())
    println(takin.replace("e","a"))


    var okul="Selçuk Üniversitesi"

    for (i in 0..okul.length-1)
        print(okul[i])




}