public class Slytherin extends HogwartsStudents{
    private int aTick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String faculty, String name, String surname, int power, int transgression, int aTick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(faculty, name, surname, power, transgression);
        this.aTick = aTick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getaTick() {
        return aTick;
    }
    public void setaTick(int aTick) {
        this.aTick = aTick;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }
    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public int getTotalAbility() {
        return aTick + determination + ambition+resourcefulness+thirstForPower;
    }
    @Override
    public String toString() {
        return "хитрость " + aTick +
                ", решительность " + determination +
                ", амбициозность " + ambition +
                ", находчиваость " + resourcefulness +
                ", жажда власти " + thirstForPower;
    }
}

