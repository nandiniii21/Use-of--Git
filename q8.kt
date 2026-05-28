fun main() {
    var num = 987654
    var count = 0

    print("Number of digits in $num = ")
    while (num != 0) {
        num /= 10
        count++
    }
    println(count)
}
