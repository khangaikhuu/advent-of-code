fun main() {
    try {
        object {}.javaClass.getResourceAsStream("/input.txt")?.bufferedReader()?.useLines { lines ->
            lines.forEach { line ->
                println(line)
            }
        }
    } catch (e: Exception) {
        println("Error reading file: ${e.message}")
    }
}