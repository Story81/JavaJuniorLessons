package lesson10;

import java.util.Objects;

public class PrintEdition {
    private String name;
    private int year;
    private String izdatelstvo;

    public PrintEdition() {
    }

    public PrintEdition(String name, int year, String izdatelstvo) {
        this.name = name;
        this.year = year;
        this.izdatelstvo = izdatelstvo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getIzdatelstvo() {
        return izdatelstvo;
    }

    public void setIzdatelstvo(String izdatelstvo) {
        this.izdatelstvo = izdatelstvo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PrintEdition that = (PrintEdition) o;

        if (year != that.year) return false;
        if (!Objects.equals(name, that.name)) return false;
        return Objects.equals(izdatelstvo, that.izdatelstvo);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + year;
        result = 31 * result + (izdatelstvo != null ? izdatelstvo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return " название ='" + name + '\'' +
                ", год выпуска =" + year +
                ", издательство='" + izdatelstvo;
    }
}
