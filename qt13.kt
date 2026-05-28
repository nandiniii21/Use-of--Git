fun calculateSimpleInterest(principal: Double, rate: Double, time: Double): Double {
    return (principal * rate * time) / 100
}
fun main() {
    val p = 1000.0
    val r = 5.0
    val t = 2.0
    val interest = calculateSimpleInterest(p, r, t)
    println("Simple Interest for P=$p, R=$r%, T=$t years is: $interest")
}
