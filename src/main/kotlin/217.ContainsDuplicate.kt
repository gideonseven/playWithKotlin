package com.gideon

fun main() {
    fun containsDuplicate(nums: IntArray): Boolean {

        val seen = HashSet<Int>(nums.size)
        for (num in nums) {
            if(seen.contains(num)){
                return true
            }
            seen.add(num)
        }
        return false
    }


    val arr = intArrayOf(1,2,3,1)
    containsDuplicate(arr)
}