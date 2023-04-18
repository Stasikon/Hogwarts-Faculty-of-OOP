public class GryffindorStudents extends HogwartsStudents {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudents(String name, String surname, int power, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    @Override
    public int getTotalAbility() {
        return honor + bravery + nobility;
    }
    @Override
    public String toString() {
        return "благородство " + nobility +
                ", честь " + honor +
                ", храбрость " + bravery;
    }
}

