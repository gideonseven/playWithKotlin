package com.gideon

fun main() {

    val nums = intArrayOf(5, -1, -2, -3, 4)
    solution(nums, 2)

}
// find the highest sum can be generated from intArray
// n - number of element
// s - int array
// k - number of changes available

/**
 * Example
 *
 * input:
 *  5
 * 5, -1, -2, -3, 4
 * 2
 *
 * answer
 * 5 + 4 = 9
 *
 */

fun solution(nums: IntArray, k: Int) {
    var x = -1
    val newList = arrayListOf<Int>()
    val negativeOne = -1

    //step 1:
    // remove negative number by multiplying to minus 1
    for (i in nums.indices) {
        x = if (nums[i] < 0) {
            nums[i] * negativeOne
        } else {
            nums[i]
        }
        newList.add(x)
    }

    println(newList)

    //step 2
    //sort the number from highest to lowest to prepare the max sum
    for (i in newList.indices) {
//        println("this is I - ${newList[i]}")

        for (j in newList.indices) {
            if(newList[i] > newList[j]){
                val temp = newList[i]
                newList[i] = newList[j]
                newList[j] = temp
            }
//            if(newList[i] < newList[j])
//            println("This is J - ${newList[j]}")
//            println(newList[i])
//            println(newList[j])
        }
    }

    println(newList)


    //step 3
    //take k many elements from the list to get the maximum sum
    //meaning take the n-first element from the sorted list
    var sum = 0
    if(k > newList.size){
        println("k is greater than the size of the list")
    } else {
        for (i in 0 until newList.size - k - 1) {
            println("this is i - ${newList[i]}")
            sum += newList[i]
        }
    }
    println(sum)
}