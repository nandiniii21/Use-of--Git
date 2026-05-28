fun main() {
    var num = 54321
    var sum = 0

    while (num != 0) {
        sum += num % 10
        num /= 10
    }
    println("Sum of digits: $sum")
}
