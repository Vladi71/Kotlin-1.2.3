package ru.netology

fun main() {
    val price = 100
    val track = 90
    val minDiscount = 0.03
    val maxDiscount = 0.05
    val musicLoverDiscount = 0.01
    val minPriceStartDiscount = 1000
    val maxPriceStartDiscount = 10_000
    val musicLover = true

    val totalPrice = price * track
    val resultMinDiscount: Int = (totalPrice * minDiscount).toInt()
    val resultMaxDiscount: Int = (totalPrice * maxDiscount).toInt()
    val resultMusicLoverDiscount: Int = (totalPrice * musicLoverDiscount).toInt()
    val result = if (musicLover && totalPrice in minPriceStartDiscount until maxPriceStartDiscount)
        totalPrice - resultMusicLoverDiscount - resultMinDiscount
    else if (musicLover && totalPrice >= maxPriceStartDiscount)
        totalPrice - resultMusicLoverDiscount - resultMaxDiscount
    else if (totalPrice in minPriceStartDiscount until maxPriceStartDiscount) totalPrice - resultMinDiscount
    else if (totalPrice >= maxPriceStartDiscount) totalPrice - resultMaxDiscount
    else totalPrice

    println("Спасибо за покупку! Сумма с учетом скидки составила $result руб.")


}