package ru.netology

fun main() {
    val total = 12_000
    val purchase = 100
    val minDiscount = 0.03
    val maxDiscount = 0.05
    val musicLoverDiscount = 0.01
    val minPriceStartDiscount = 1000
    val maxPriceStartDiscount = 10_000
    val musicLover = true


    val resultMinDiscount = purchase * minDiscount
    val resultMaxDiscount = purchase * maxDiscount

    val result: Double = if (musicLover && total in minPriceStartDiscount until maxPriceStartDiscount)
        purchase - resultMinDiscount - ((purchase - resultMinDiscount) * musicLoverDiscount)
    else (if (musicLover && total >= maxPriceStartDiscount)
        purchase  - resultMaxDiscount - ((purchase - resultMinDiscount) * musicLoverDiscount)
    else if (total in minPriceStartDiscount until maxPriceStartDiscount) purchase - resultMinDiscount
    else if (total >= maxPriceStartDiscount) purchase - resultMaxDiscount
    else purchase) as Double

    println("Спасибо за покупку! Сумма с учетом скидки составила $result руб.")


}