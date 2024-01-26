package lesson3

const val FIRST_NAME = "Татьяна"
const val PATRONYMIC = "Сергеевна"

fun main() {
    println(personalCharacteristics(20))
    println(personalCharacteristics(22))
}

fun personalCharacteristics(age: Int): String {
    var lastName = "Андреева"
    val personalData: String = if (age >= 22) {
        lastName = "Сидорова"
        "$lastName $FIRST_NAME $PATRONYMIC, ${ageModification(age)}"
    } else {
        "$lastName $FIRST_NAME $PATRONYMIC, ${ageModification(age)}"
    }
    return personalData
}

fun ageModification(age: Int): String {
    val result: String
    var mod = age
    if (mod in 10..20) {
        result = "лет"
    } else {
        mod = age % 10
        result = if (mod == 1) {
            "год"
        } else if (mod in 2..4) {
            "года"
        } else {
            "лет"
        }
    }
    return "$age $result"
}


