public abstract class HogwartsStudents {
    private String name;
    private String surname;
    private int power;
    private int transgression;
    public HogwartsStudents(String name, String surname, int power, int transgression) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.transgression = transgression;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public int getTransgression() {
        return transgression;
    }
    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
    @Override
    public String toString() {
        return "HogwartsStudents{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", power=" + power +
                ", trancressy=" + transgression +
                '}';
    }
    public abstract int getTotalAbility();
    public int commandAbility() {
        return power + transgression;
    }
    public void compareWith(HogwartsStudents students) {
        if(this.getTotalAbility()>students.getTotalAbility()){
            System.out.println(this.name+" "+this.surname+" лучший чем "+ students.name+" "+this.surname);
        } else if (this.getTotalAbility()<students.getTotalAbility()) {
            System.out.println(this.name+" лучше чем "+ students.name+" "+this.surname);
        } else if (this.getTotalAbility()==students.getTotalAbility()) {
            System.out.println("Студенты"+students.name+" и "+this.name+" "+this.surname+" "+ "равны");
        }
    }
    }

