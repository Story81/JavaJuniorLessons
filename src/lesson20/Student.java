package lesson20;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private String surname;
    private String name;
    private String groupe;
    private Date receipt_date;
    private ArrayList<Student> students = new ArrayList<>();

    public Student() {
    }

    public Student(String surname, String name, String groupe, Date receipt_date, ArrayList<Student> students) {
        this.surname = surname;
        this.name = name;
        this.groupe = groupe;
        this.receipt_date = receipt_date; //изменить формат даты необходимо как в SQL
        this.students = students;
    }

//    public void  addDiscipline (Discipline discipline) {
//        disciplines.add(discipline);
//    }
    public void addStudent (Student student){
        students.add(student);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public Date getReceipt_date(Date receiptDate) {
        return receipt_date;
    }

    public void setReceipt_date(Date receipt_date) {
        this.receipt_date = receipt_date;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!Objects.equals(surname, student.surname)) return false;
        if (!Objects.equals(name, student.name)) return false;
        if (!Objects.equals(groupe, student.groupe)) return false;
        if (!Objects.equals(receipt_date, student.receipt_date))
            return false;
        return Objects.equals(students, student.students);
    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (groupe != null ? groupe.hashCode() : 0);
        result = 31 * result + (receipt_date != null ? receipt_date.hashCode() : 0);
        result = 31 * result + (students != null ? students.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", groupe='" + groupe + '\'' +
                ", receipt_date=" + receipt_date +
                ", students=" + students +
                '}';
    }
}
