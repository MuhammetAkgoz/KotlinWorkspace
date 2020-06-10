package DosyaIslemleri

import java.io.FileWriter

fun main(args: Array<String>) {

    //dosya oluşturma
    var dosya= FileWriter("ilkdosya.txt",false)

    println("İsmini giriniz:")
    var isim= readLine()!!

    dosya.write(isim+"\n")
    dosya.write("yaş 19\n")
    println("veri dosyaya yazıldı")
    dosya.close()



}