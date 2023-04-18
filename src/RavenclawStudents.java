public class RavenclawStudents extends HogwartsStudents{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    public RavenclawStudents(String name, String surname, int power, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, surname, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }
    public int getMind() {
        return mind;
    }
    public void setMind(int mind) {
        this.mind = mind;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWit() {
        return wit;
    }
    public void setWit(int wit) {
        this.wit = wit;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public int getTotalAbility() {
        return mind + wisdom +wit+creativity;
    }
    @Override
    public String toString() {
        return "ум  " + mind +
                ", мудрость " + wisdom +
                ", остроумие " + wit +
                ", креативность " + creativity;
    }
}

