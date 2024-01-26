package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val percent = 20

    val ironOreBuff = getResourceCount(ironOre, percent)
    val crystalOreBuff = getResourceCount(crystalOre, percent)

    println("+ $ironOreBuff items to iron ore mined")
    println("+ $crystalOreBuff items to crystal ore mined")

}

fun getResourceCount(resourceItems: Int, percent: Int): Int {
    val result = resourceItems * percent / 100
    val totalWithBuff = result + resourceItems
    return totalWithBuff - resourceItems
}
