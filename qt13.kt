fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double {
    return (principal * rate * time) / 100
}

fun main() {
    val si = calculateSimpleInterest(1000.0, 5.0, 2.0)
    println("Simple Interest: $si")
}
