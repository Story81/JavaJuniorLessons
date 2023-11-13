package lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_40?user=root&password=Ctdthyjtcbzybt1!");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT surname, name, groupe, date as receipt_date  FROM students_40.student");
            Student student = new Student();
            while (rs.next()) {
                student.setSurname(rs.getString("surname"));
                student.setName(rs.getString("name"));
                student.setGroupe(rs.getString("groupe"));
                student.getReceipt_date(rs.getDate("receipt_date"));
                System.out.println(student);
            }
//
//
//            Term term = null;
//            while (rs.next()) {
//                if (term == null) {
//                    term = new Term();
//                    term.setId(rs.getInt("id"));
//                    term.setTerm(rs.getString("nameTerm"));
//                    term.setDuration(rs.getString("duration"));
//                }
//                Discipline discipline = new Discipline();
//                discipline.setId(rs.getInt("disc"));
//                discipline.setDiscipline(rs.getString("discipline"));
//                term.addDiscipline(discipline);
//            }
            System.out.println(student);
//            for (Student s : student.getStudents()
//            ) {
//                System.out.println(s);
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
