fun celsiusToFahrenheit(celsius: Double): Double {
    return (celsius * 9 / 5) + 32
}

fun fahrenheitToCelsius(fahrenheit: Double): Double {
    return (fahrenheit - 32) * 5 / 9
}

fun main() {
    val c = 37.0
    val f = 98.6

    println("$c°C is equal to ${celsiusToFahrenheit(c)}°F")
    println("$f°F is equal to ${fahrenheitToCelsius(f)}°C")
}
