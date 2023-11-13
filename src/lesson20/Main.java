package lesson20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_40?user=root&password=Ctdthyjtcbzybt1!");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT t.id, t.name_of_term as nameTerm, t.duration, d.id as disc, d.discipline FROM term_discipline AS td\n" +
                    "LEFT JOIN term AS t ON td.id_term = t.id\n" +
                    "left join discipline as d on td.id_discipline = d.id\n" +
                    "where td.id_term = 1 and d.status ='1'");
            Term term = null;
            while (rs.next()) {
                if (term == null) {
                    term = new Term();
                    term.setId(rs.getInt("id"));
                    term.setTerm(rs.getString("nameTerm"));
                    term.setDuration(rs.getString("duration"));
                }
                Discipline discipline = new Discipline();
                discipline.setId(rs.getInt("disc"));
                discipline.setDiscipline(rs.getString("discipline"));
                term.addDiscipline(discipline);
            }
            System.out.println(term);
            for (Discipline d : term.getDisciplines()
            ) {
                System.out.println(d);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
