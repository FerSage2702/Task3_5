import java.util.Scanner

fun groupAnagrams(words: List<String>): List<List<String>> {
    val groupedWords = words.groupBy { word ->
        word.toCharArray().sorted().joinToString("")
    }
    return groupedWords.values.toList()
}

fun main() {
    val scanner = Scanner(System.`in`)

    println("Введите слова через пробел:")
    val input = scanner.nextLine()
    val words = input.split(" ")

    val groupedAnagrams = groupAnagrams(words)

    println("Сгруппированные слова:")
    for (group in groupedAnagrams) {
        println(group)
    }
}
