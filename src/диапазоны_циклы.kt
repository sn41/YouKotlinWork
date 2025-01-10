fun main() {
    // Диапазон значений типа Integer от 2022, включительно до 2026, включительно.
    val yearRange = IntRange(2022, 2026)

    // Диапазон значений типа Char от символа 'a', включительно до 'z', включительно.
    val charRange = CharRange('a', 'z')

    val year = 2025
    // проверка, находится ли значение в указанном диапазоне
    if(year in yearRange){
        println("Год находится в заданном диапазоне")
    }

    //можно получить начало и конец диапазона
    val start = yearRange.first
    val fin = yearRange.last


    // Диапазоны, например, используется для создания циклов
    // выполнить цикл для year в диапазоне от 2022 до 2026
    for (year in yearRange){
        print(" $year")
    }
    //цикл выведет 2022 2023 2024 2025 2026

    //можно получить диапазон элементов массива или списка
    val array = arrayOf(1,2,3)
    val indexRange = array.indices
    for(i in indexRange){
        val v = array[i]
    }



}

