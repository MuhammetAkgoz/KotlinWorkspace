package Koleksiyonlar

//mapof

fun main(args: Array<String>) {
    // mapOf ile değiştirelemeyen map
    var map= mapOf<Int,String>(1 to "emre",2 to "mami",3 to "irem")
    println("3. keydeki isim: "+map.get(3))

    for (str in map){
        println(str)
        println(str.key)
        println(str.value)
    }
    var aranacakifade= readLine()!!
    if (map.containsValue(aranacakifade)){

        println("$aranacakifade map de vardır.")
    }
    else
        println("$aranacakifade map de yok")
}