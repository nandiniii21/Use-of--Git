fun main() {
    var a = 10
    var b = 20

    a = a + b  // a becomes 30
    b = a - b  // b becomes 10
    a = a - b  // a becomes 20
    println("After Swap (without temp): a = $a, b = $b")
}
