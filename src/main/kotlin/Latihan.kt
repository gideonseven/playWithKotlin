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
    var newList = arrayListOf<Int>()

    //step 1:
    // remove negative number
    for (i in nums.indices) {
        if (i < 0) {
            x = i * i
        } else {
            x = i
        }
        newList.add(x)
    }
    //step 2
    //sort the number from highest to lowest to prepare the max sum
    for (i in 0 until newList.size - 1) {
        print("$i")

//        var temp = 0
//        if(i <  i + 1){
//            //0
//            temp = i
//
//        }

    }
//    print(newList)


}