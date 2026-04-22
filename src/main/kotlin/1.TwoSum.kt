package com.gideon

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val result = mutableListOf<Int>()
//    result.add(1)

    val arr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var currentValue = 0
    val target = 5


    for (i in arr.indices) {
        result.add(i)
        currentValue += arr[i]
        if (currentValue >= target) {
            print("success")
            println(currentValue)
        } else {
            println("not here yet")
        }
    }
}