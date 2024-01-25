package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val ironOreBuff = resourceBuffCount(ironOre)
    val crystalOreBuff = resourceBuffCount(crystalOre)

    println("+ $ironOreBuff items to iron ore mined")
    println("+ $crystalOreBuff items to crystal ore mined")

}

fun resourceBuffCount(resourceItems: Int, percent: Int = 20): Int {
    val result = resourceItems * percent / 100
    val totalWithBuff = result + resourceItems
    return totalWithBuff - resourceItems

}
