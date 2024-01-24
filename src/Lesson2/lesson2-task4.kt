package lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val increaseIronOre = increase(ironOre)
    val increaseCrystalOre = increase(crystalOre)

    println("ironOre + 20% buff: $increaseIronOre")
    println("crystalOre + 20% buff: $increaseCrystalOre")

}

fun increase(resourceCount: Int, percent: Int = 20): Int {
    val result = resourceCount * percent / 100
    return result + resourceCount

}