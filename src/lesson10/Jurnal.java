package lesson10;

public class Jurnal extends PrintEdition {
    private int numInYear;

    public Jurnal() {
    }

    public Jurnal(String name, int year, String izdatelstvo, int numInYear) {
        super(name, year, izdatelstvo);
        this.numInYear = numInYear;
    }

    public int getNumInYear() {
        return numInYear;
    }

    public void setNumInYear(int numInYear) {
        this.numInYear = numInYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Jurnal jurnal = (Jurnal) o;

        return numInYear == jurnal.numInYear;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numInYear;
        return result;
    }

    @Override
    public String toString() {
        return "Журнал:  {" +
                "номер в году =" + numInYear +
                super.toString() +
                '}';
    }
}
