import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {

    val input = Scanner(System.`in`)


    println("Masukkan Identitas Kamu")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        main()
    }
    print("Absen: ")
    val absen: String? = input.nextLine()
    println(" ")

    println("|--MENGHITUNG BANGUN RUANG--|")
    println("1. Volume Balokke")
    println("2. Volume Bola ")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println(" ")
            println("---Volume Balok---")
            print("Masukan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar Balok   : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi Balok  : ")
            val t: Double = input.nextDouble()


            val vt: Double = p * l * t;


            println(" ")
            println("Volume Balok adalah = $vt ")


        }
        "2" -> {
            println(" ")
            println("---Volume Bola=---")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()


            val vb: Double = 4/ 3 * 22/ 7 * r * r * r;


            println(" ")
            println("Volume Bola adalah = $vb ")

        }
    }
}