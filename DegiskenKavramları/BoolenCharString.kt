package DegiskenKAVRAMLARI

fun main(args: Array<String>) {

    var isTrue: Boolean= 5<4
    println("İs that true: "+isTrue)



    var ilkHarf: Char = 'A'
    var ikinciHarf: Char ='B'

    println("1.HARF:"+ilkHarf +" 2.HARF $ikinciHarf")

    var isim1: String="Muhammet Akgöz"
    var isim2: String="Mami Reis"
    println("Benim adim: "+isim2 +" Adımın karakter sayisi: "+isim1.length)
    println(isim1.get(9))

    var isFalse: Boolean=isim2.length>isim1.length
    println("İs THAT TRUE:"+isFalse)

    println("""Kotlinde \n alta geçmeyi sağlar""")
}