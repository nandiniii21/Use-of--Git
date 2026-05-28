fun findLargest(a: Int, b: Int, c: Int): Int {
    return if (a >= b && a >= c) {
        a
    } else if (b >= a && b >= c) {
        b
    } else {
        c
    }
}

fun main() {
    println("Largest number is: ${findLargest(25, 89, 42)}")
}
