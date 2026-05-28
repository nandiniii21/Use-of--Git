fun checkCharType(ch: Char) {
    // Convert to lowercase to handle both cases easily
    when (ch.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> println("$ch is a Vowel")
        in 'a'..'z' -> println("$ch is a Consonant")
        else -> println("$ch is not a valid letter")
    }
}

fun main() {
    checkCharType('E')
    checkCharType('x')
}
