package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val ironOreBuff = increase(ironOre)
    val crystalOreBuff = increase(crystalOre)

    println("+ $ironOreBuff to iron ore mined")
    println("+ $crystalOreBuff to crystal ore mined")

}

fun increase(resourceCount: Int, percent: Int = 20): Int {
    val result = resourceCount * percent / 100
    val totalWithBuff = result + resourceCount
    return totalWithBuff - resourceCount

}