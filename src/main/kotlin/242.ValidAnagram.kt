package com.gideon

fun main() {

    isAnagram("anagram", "nagaram")
}

fun isAnagram(s: String, t: String): Boolean {
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
}