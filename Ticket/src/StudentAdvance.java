public class StudentAdvance extends Advance {
    public StudentAdvance(int daysInAdvance) {
        super(daysInAdvance);
    }

    @Override
    public String toString() {
        return super.toString() + "\n(Student ID required.)";
    }

    @Override
    public double getPrice() {
        return super.getPrice() / 2;
    }
}
