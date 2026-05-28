fun main() {
    val originalNum = 121
    var num = originalNum
    var reversed = 0

    while (num != 0) {
        val digit = num % 10
        reversed = reversed * 10 + digit
        num /= 10
    }

    if (originalNum == reversed) {
        println("$originalNum is a Palindrome")
    } else {
        println("$originalNum is not a Palindrome")
    }
}
