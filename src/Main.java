public class Main {
    public static void main(String[] args) {
        HogwartsStudents[] students = {
                new HogwartsStudents("Гарри", "Поттер"),
                new HogwartsStudents("Гермиона", "Грейджер"),
                new HogwartsStudents("Рон", "Уизли"),
                new HogwartsStudents("Захари", "Смит"),
                new HogwartsStudents("Седриг", "Дигори"),
                new HogwartsStudents("Джастин", "Финч-Флетчли"),
                new HogwartsStudents("Драко", "Малфой"),
                new HogwartsStudents("Грэхэм", "Монтелю"),
                new HogwartsStudents("Грегорий", "Гоил"),
                new HogwartsStudents("Чжоу", "Чанг"),
                new HogwartsStudents("Падма", "Палм"),
                new HogwartsStudents("Маркус", "Белби")
        };
        Gryffindor[] griffins = {
                new Gryffindor("Гарри", "Поттер",12,10,5),
                new Gryffindor("Гермиона", "Грейджер",5,6,5)
                new Gryffindor("Рон", "Уизли",3,6,5),
        };
        Hufflepuff[] shuffles = {
                new Hufflepuff("Захари", "Смит", 12, 10, 5),
                new Hufflepuff("Седриг", "Дигори", 5, 6, 5),
                new Hufflepuff("Джастин", "Финч-Флетчли", 3, 6, 5),

        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Драко", "Малфой",12,5,6,8),
                new Ravenclaw("Грэхэм", "Монтелю",8,4,6,9),
                new Ravenclaw("Грегорий", "Гоил",8,4,9,7),
        };
        Slytherin[] slytherins = {
                new Slytherin("Чжоу", "Чанг",5,4,8,9,4),
                new Slytherin("Падма", "Палм",8,6,7,4,8),
                new Slytherin("Маркус", "Белби",4,8,4,9,7)
        };
    }
}