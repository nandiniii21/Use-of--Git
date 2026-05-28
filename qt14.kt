fun printPrimesUpToN(n: Int) {
    for (num in 2..n) {
        var isPrime = true
        for (i in 2..num / 2) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            print("$num ")
        }
    }
}

fun main() {
    val n = 30
    println("Prime numbers up to $n:")
    printPrimesUpToN(n)
}
