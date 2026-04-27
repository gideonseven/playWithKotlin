package com.gideon

fun main() {

    fun maxProfit(prices: IntArray): Int {

//        val prices = intArrayOf(7,1,5,3,6,4)

        var buyPos = 0
        var sellPos = 0
        var biggest = prices[prices.size - 1]
        var smallest = prices[0]

        // make it Integer
        val median : Int = if(prices.size % 2 == 0) prices.size / 2 else prices.size / 2 + 1

        println(" Our median is $median")

        for (i in prices.indices) {
            if (i <= median) {
                if(prices[i] < smallest) {
                    smallest = prices[i]
                    buyPos = i
                }
            }
            if(i >= median){
                if(prices[i] > biggest) {
                    biggest = prices[i]
                    sellPos = i
                }
            }
        }

        val profit = prices[sellPos] - prices[buyPos]

        println(profit)

        return profit
    }

//    val prices = intArrayOf(7,1,5,3,6,4)
    val prices = intArrayOf(7,6,4,3,1)

    maxProfit(prices)
}