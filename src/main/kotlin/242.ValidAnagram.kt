package com.gideon

import java.lang.Character.charCount

fun main() {

    isAnagram("anagram", "nagaram")

}


// solution 1
/*fun isAnagram(s: String, t: String): Boolean {
    var isAnagram = false

    if (s.count() != t.count()) {
        isAnagram = false
    }

    // check if length the same
    val firstChars = s.toCharArray().sorted()
    val secondChars = t.toCharArray().sorted()

    if (firstChars == secondChars) {
        isAnagram = true
    }
    return isAnagram
}*/

//solution 2
fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val charCount = HashMap<Char, Int>()

    for(i in s.indices){
        charCount.put(s[i], charCount.getOrDefault(s[i], 0) + 1)
        charCount.put(t[i], charCount.getOrDefault(t[i], 0) - 1)
    }

    return charCount.values.all { it == 0 }
}