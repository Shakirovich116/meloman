package ru.netology
const val ITEM_PRICE = 100U
const val DISCOUNT_START = 1_000U
const val DISCOUNT_MAX = 10_000U
fun main() {
    val discount = 100U
    println("Введите количество песен которые вы хотите купить")
    val itemCount = readLine()?.toUInt() ?: return
    val totalPrice = itemCount * ITEM_PRICE
    val result = if (totalPrice > DISCOUNT_MAX) {
        itemCount * ITEM_PRICE * 95u / 100u
    }
        else if(DISCOUNT_MAX < totalPrice|| totalPrice > DISCOUNT_START) totalPrice - discount
        else totalPrice
    println("Общая стоимость покупки с учетом скидки составила: $result")
   }






