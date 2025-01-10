//Импортируем класс File, чтобы не писать каждый раз полное имя класса ava.io.File вместо File
import java.io.File

fun main() {
    // Объявляем переменную file типа File
    val file: File

    // Создаём объект класса File, для этого вызываем конструктор класса и передаём ему строку в которой описан путь к файлу
    File("resources/Wizard.txt")
    // здесь экземпляр класса File создан, но никак не использован

    // Инициализируем переменную, помещаем в неё экземпляр, созданный конструктором File(...)
    file = File("resources/Wizard.txt")

    // теперь читаем файл построчно


    // для каждой строки line вызывается метод workLine(String)
    file.forEachLine( charset = Charsets.UTF_8, ::workLine )

    // то же самое, но код обработки строки пишем в лямбде
    file.forEachLine( charset = Charsets.UTF_8 ){ line ->
        // выводим строку на экран консоли
        println(line)
    }

    // то же самое, но используем кодировку символов по умолчанию, код обработки строки пишем в лямбде
    file.forEachLine(){ line ->
        // выводим строку на экран консоли
        println(line)
    }

    // читаем все строки файла в список lines
    val lines: List<String> = file.readLines()

    // выводим список на экран в цикле
    for(line in lines){
        println(line)
    }

    // или так
    lines.forEach { line ->
        println(line)
    }

}

fun workLine(line:String){
    // выводим строку на экран консоли
    println(line)
}

