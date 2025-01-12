fun main() {
    val dataColumn0ne = mutableListOf<Int>();
    val dataColumnTwo = mutableListOf<Int>();
    try {
        object {}.javaClass.getResourceAsStream("/input.txt")?.bufferedReader()?.useLines { lines ->
            lines.forEach { line ->
                val numbers = line.trim().split("\\s+".toRegex());
                if (numbers.size >= 2){
                    dataColumn0ne.add(numbers[0].toInt());
                    dataColumnTwo.add(numbers[1].toInt());
                }
            }
        }
        val columnOneArray = dataColumn0ne.toIntArray();
        val columnTwoArray = dataColumnTwo.toIntArray();

        println("Column 1 values:")
        columnOneArray.forEach { println(it) }

        println("\nColumn 2 values:")
        columnTwoArray.forEach { println(it) }

        // Example of using the arrays
        println("\nArray statistics:")
        println("Column 1 average: ${columnOneArray.average()}")
        println("Column 1 min: ${columnOneArray.min()}")
        println("Column 1 max: ${columnOneArray.max()}")
        println("Column 2 average: ${columnTwoArray.average()}")
        println("Column 2 min: ${columnTwoArray.min()}")
        println("Column 2 max: ${columnTwoArray.max()}")
    } catch (e: Exception) {
        println("Error reading file: ${e.message}")
    }
}