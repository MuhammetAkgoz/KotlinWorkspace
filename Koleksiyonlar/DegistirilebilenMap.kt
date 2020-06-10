package Koleksiyonlar


//hashmapof
fun main(args: Array<String>) {


    var degistirelebilenMap= hashMapOf<String,String>("1" to "emre","2" to "Mami","3" to "İrem")
    //ekleme
    degistirelebilenMap.put("4","Mert")
    //okuma
    println(degistirelebilenMap.get("2"))
    println(degistirelebilenMap["3"])
    //ekleme
    degistirelebilenMap.put("5","Melek")
    //günceleme
    degistirelebilenMap.set("5","Yusuf")

    for (oankieleman in degistirelebilenMap){
        println(oankieleman)

    }
    degistirelebilenMap.remove("1")
    for (oankieleman in degistirelebilenMap){
        println(oankieleman)
    }

}