import java.util.*

object TahunKabisat {
    @JvmStatic
    fun main(args: Array<String>) {
        val tahun: Int
        val scan = Scanner(System.`in`)
        print("Masukkan tahun : ")
        tahun = scan.nextInt()
        if (tahun % 400 == 0) {
            print("$tahun Merupakan Tahun Kabisat\n")
        } else if (tahun % 100 == 0) {
            print("$tahun Bukan Tahun Kabisat\n")
        } else if (tahun % 4 == 0) {
            print("$tahun Merupakan Tahun Kabisat\n")
        } else {
            print("$tahun Bukan Tahun Kabisat\n")
        }
    }
}