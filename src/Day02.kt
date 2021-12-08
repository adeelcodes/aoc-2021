fun main() {
    val input = readInput("day02")
    println(part1(input))
    println(part2(input))
}

fun part1(inputFile: List<String>): Int {
    var forward = 0
    var depth = 0
     for (line in inputFile){
         val splittedLine = line.split(" ")
         val command = splittedLine[0]
         val amount = splittedLine[1].toInt()
         when (command) {
             "forward"-> forward += amount
             "up" -> depth -= amount
             else -> depth += amount
         }
     }
    return (forward * depth)
}

fun part2(inputFile: List<String>): Int {
    var forward = 0
    var depth = 0
    var aim = 0
    for (line in inputFile){
        val splittedLine = line.split(" ")
        val command = splittedLine[0]
        val amount = splittedLine[1].toInt()
        when (command) {
            "forward"-> {
                forward += amount
                depth += amount*aim
            }
            "up" -> aim -= amount
            else -> aim += amount
        }
    }
    return (forward * depth)
}