package ru.netology

fun main() {
    val total = 12_000
    val purchase = 1000
    val minDiscount = 0.03
    val maxDiscount = 0.05
    val musicLoverDiscount = 0.01
    val minPriceStartDiscount = 1000
    val maxPriceStartDiscount = 10_000
    val musicLover = false


    val resultMinDiscount: Int = (purchase * minDiscount).toInt()
    val resultMaxDiscount: Int = (purchase * maxDiscount).toInt()
    val resultMusicLoverDiscount: Int = (purchase * musicLoverDiscount).toInt()
    val result = if (musicLover && total in minPriceStartDiscount until maxPriceStartDiscount)
        purchase - resultMusicLoverDiscount - resultMinDiscount
    else if (musicLover && total >= maxPriceStartDiscount)
        purchase - resultMusicLoverDiscount - resultMaxDiscount
    else if (total in minPriceStartDiscount until maxPriceStartDiscount) purchase - resultMinDiscount
    else if (total >= maxPriceStartDiscount) purchase - resultMaxDiscount
    else purchase

    println("Спасибо за покупку! Сумма с учетом скидки составила $result руб.")


}