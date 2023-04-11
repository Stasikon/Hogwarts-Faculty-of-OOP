public class Hufflepuff extends HogwartsStudents{
    private int workday;
    private int faint;
    private int honesty;
    public Hufflepuff(String name, String surname, int workday, int faint, int honesty) {
        super(name, surname);
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
}

