package com.gideon

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val nums = intArrayOf(3, 2, 4)

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val results = mutableListOf<Int>()
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return results.toIntArray()
    }


    twoSum(nums, 6)
}