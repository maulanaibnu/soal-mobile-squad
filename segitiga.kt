internal object Program_Looping {
    @JvmStatic
    fun main(args: Array<String>){
        val b = 5
        for (i in 1..b) {
            for (j in 1 until i) {
                print(" ")
            }
            for (k in b downTo i) {
                print("*")
            }
            println()
        }
    }
}