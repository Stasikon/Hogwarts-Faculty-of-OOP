public class Hufflepuff extends HogwartsStudents{
    private int workday;
    private int faint;
    private int honesty;

    public Hufflepuff(String faculty, String name, String surname, int power, int transgression, int workday, int faint, int honesty) {
        super(faculty, name, surname, power, transgression);
        this.workday = workday;
        this.faint = faint;
        this.honesty = honesty;
    }
    public int getWorkday() {
        return workday;
    }
    public void setWorkday(int workday) {
        this.workday = workday;
    }
    public int getFaint() {
        return faint;
    }
    public void setFaint(int faint) {
        this.faint = faint;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    @Override
    public int getTotalAbility() {
        return workday + faint + honesty;
    }
    @Override
    public String toString() {
        return "Трудолюбие " + workday +
                ", верност " + faint +
                ", честность " + honesty;
    }
}


