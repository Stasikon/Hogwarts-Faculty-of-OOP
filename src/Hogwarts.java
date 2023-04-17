public class Hogwarts {
    Gryffindor[] gryffindors = new Gryffindor[3];
    Hufflepuff[] hufflepuffs = new Hufflepuff[3];
    Ravenclaw[] ravenclaws = new Ravenclaw[3];
    Slytherin[] slytherins = new Slytherin[3];

    public void compare(HogwartsStudents students1, HogwartsStudents students2) {
        if (students1.commandAbility() > students2.getTotalAbility()) {
            System.out.println(students1.getName() + " " + students1.getSurname() + " лучший чем " + students2.getName());
        } else if (students1.commandAbility() < students2.getTotalAbility()) {
            System.out.println(students1.getName() + " " + students1.getSurname() + " лучше чем " + students2.getName());
        } else if (students1.commandAbility() == students2.getTotalAbility()) {
            System.out.println("Студенты" + students1.getName() + students1.getSurname() + " и " + students2.getName() + "равны");
        }
    }

    public void printAll() {
        System.out.println("--- Грифиндор ---");
        for (Gryffindor gryffindor : gryffindors) {
            if (gryffindor != null) {
                System.out.println(gryffindor.getName() + " " + gryffindor.getSurname() + " Сила " + gryffindor.getPower() + " Трансресия " + gryffindor.getTransgression() + " " + gryffindor.toString());
            }
        }
        System.out.println("--- Пуфиндуй ---");
        for (Hufflepuff hufflepuff : hufflepuffs) {
            if (hufflepuff != null) {
                System.out.println(hufflepuff.getName() + " " + hufflepuff.getSurname() + " Сила " + hufflepuff.getPower() + " Трансресия " + hufflepuff.getTransgression() + " " + hufflepuff.toString());
            }
        }
        System.out.println("--- Когтевран ---");
        for (Ravenclaw ravenclaw : ravenclaws) {
            if (ravenclaw != null) {
                System.out.println(ravenclaw.getName() + " " + ravenclaw.getSurname() + " Сила " + ravenclaw.getPower() + " Трансресия " + ravenclaw.getTransgression() + " " + ravenclaw.toString());
            }
        }
        System.out.println("--- Слизерин ---");
        for (Slytherin slytherin : slytherins) {
            if (slytherin != null) {
                System.out.println(slytherin.getName() + " " + slytherin.getSurname() + " Сила " + slytherin.getPower() + " Трансресия " + slytherin.getTransgression() + " " + slytherin.toString());
            }
        }
        System.out.println();
    }

    public String compareGryffindors(Gryffindor first, Gryffindor second) {
        int firstPoints = first.getNobility() + first.getHonor() + first.getBravery();
        int secondPoints = second.getNobility() + second.getHonor() + second.getBravery();
        if (firstPoints > secondPoints) {
            return first.getName() + " " + first.getSurname() + " лучший ученик чем " + second.getName() + " " + second.getSurname();
        } else if (firstPoints == secondPoints) {
            return "Ничья!";
        } else {
            return second.getName() + first.getSurname() + " лучший ученик чем" + first.getName() + " " + first.getSurname();
        }
    }

    public String compareHufflepuffs(Hufflepuff first, Hufflepuff second) {
        int firstPoints = first.getWorkday() + first.getFaint() + first.getHonesty();
        int secondPoints = second.getWorkday() + second.getFaint() + second.getHonesty();
        if (firstPoints > secondPoints) {
            return first.getName() + " " + first.getSurname() + " лучший ученик чем " + second.getName() + " " + second.getSurname();
        } else if (firstPoints == secondPoints) {
            return "Ничья!";
        } else {
            return second.getName() + first.getSurname() + " лучший ученик чем" + first.getName() + " " + first.getSurname();
        }
    }

    public String compareRavenclaws(Ravenclaw first, Ravenclaw second) {
        int firstPoints = first.getMind() + first.getWisdom() + first.getWit() + first.getCreativity();
        int secondPoints = second.getMind() + second.getWisdom() + second.getWit() + first.getCreativity();
        if (firstPoints > secondPoints) {
            return first.getName() + " " + first.getSurname() + " лучший ученик чем " + second.getName() + " " + second.getSurname();
        } else if (firstPoints == secondPoints) {
            return "Ничья!";
        } else {
            return second.getName() + first.getSurname() + " лучший ученик чем" + first.getName() + " " + first.getSurname();
        }

    }
    public String compareSlytherin(Slytherin first, Slytherin second) {
        int firstPoints = first.getaTick() + first.getDetermination() + first.getAmbition() + first.getResourcefulness()+first.getThirstForPower();
        int secondPoints = second.getaTick() + second.getDetermination() + second.getAmbition() + first.getResourcefulness()+first.getThirstForPower();
        if (firstPoints > secondPoints) {
            return first.getName() + " " + first.getSurname() + " лучший ученик чем " + second.getName() + " " + second.getSurname();
        } else if (firstPoints == secondPoints) {
            return "Ничья!";
        } else {
            return second.getName() + first.getSurname() + " лучший ученик чем" + first.getName() + " " + first.getSurname();
        }
    }

}