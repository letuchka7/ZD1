fun main () {
    println("приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строк. Можете ввести букавы;)): ")
    val input = readLine() ?: ""
    var result =""
    var count = 1

    for (i in 1 until input.length) {
        if (input[i]== input[i-1])
        {
            count ++
        } else {
            result += input[i-1]
            if (count > 1) {
                result += count
            }
            count = 1
        }
    }

    result += input[input.length - 1]
    if (count > 1) {
        result += count
    }
    println(result)
}