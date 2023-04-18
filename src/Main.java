public class Main {
    public static void main(String[] args) {
        Hogwarts hogwarts = new Hogwarts();
        hogwarts.gryffindors[0]= new GryffindorStudents("Гарри", "Поттер", 72, 52, 7, 10, 9);
        hogwarts.gryffindors[1]= new GryffindorStudents("Гермиона", "Грейджер", 72, 24, 5, 5, 6);
        hogwarts.gryffindors[2]= new GryffindorStudents("Рон", "Уизли", 50, 36, 3, 6, 5);
        hogwarts.hufflepuffs[0]= new HufflepuffStudents("Захари", "Смит", 55, 34, 5, 10, 5);
        hogwarts.hufflepuffs[1]= new HufflepuffStudents("Седриг", "Дигори", 68, 16, 5, 6, 5);
        hogwarts.hufflepuffs[2]= new HufflepuffStudents("Джастин", "Финч-Флетчли", 40, 43, 6, 6, 5);
        hogwarts.ravenclaws[0] = new RavenclawStudents("Чжоу", "Чанг", 55, 17, 5, 4, 8, 9);
        hogwarts.ravenclaws[1] = new RavenclawStudents("Падма", "Палм", 37, 33, 5, 6, 7, 4);
        hogwarts.ravenclaws[2] = new RavenclawStudents("Маркус", "Белби", 44, 22, 6, 8, 4, 9);
        hogwarts.slytherins[0] = new SlytherinStudents("Драко", "Малфой", 72, 9, 5, 5, 6, 8,7);
        hogwarts.slytherins[1] = new SlytherinStudents("Грэхэм", "Монтелю", 68, 8, 5, 4, 6, 9,6);
        hogwarts.slytherins[2] = new SlytherinStudents("Грегорий", "Гоил", 60, 12, 8, 4, 9, 7,3);
        hogwarts.printAll();
        System.out.println(hogwarts.compareGryffindors(hogwarts.gryffindors[1], hogwarts.gryffindors[2]));
        System.out.println(hogwarts.compareHufflepuffs(hogwarts.hufflepuffs[0], hogwarts.hufflepuffs[2]));
        System.out.println(hogwarts.compareRavenclaws(hogwarts.ravenclaws[1], hogwarts.ravenclaws[0]));
        System.out.println(hogwarts.compareSlytherin(hogwarts.slytherins[0], hogwarts.slytherins[1]));
        hogwarts.compare(hogwarts.slytherins[0],hogwarts.hufflepuffs[0]);
    }
}
