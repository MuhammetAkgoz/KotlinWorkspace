package NesneYonelimliProgramlama

class Daire(var yarıcap:Int){
}

fun main(args: Array<String>) {

    var d1:Daire= Daire(5)
    daireAlan(d1)
    var d2: Daire=Daire(7)
    daireAlan(d2)
    println("................")
    var d3: Daire=Daire(8)
    var d4: Daire=Daire(9)
    var d5: Daire=Daire(10)

    var daireler:Array<Daire> = Array(5){Daire(0)}
    daireler[0]=d1
    daireler[1]=d2
    daireler[2]=d3
    daireler[3]=d4
    daireler[4]=d5

    daireDizileri(daireler)

}



fun daireAlan( daire: Daire){


    println("Daire alanı: "+daire.yarıcap*daire.yarıcap*Math.PI)

}

fun  daireDizileri(daireDizisi:Array<Daire>){

    for (daire in daireDizisi)
        daireAlan(daire)


}
