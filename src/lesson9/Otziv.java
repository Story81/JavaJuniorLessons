package lesson9;

import java.util.Date;
import java.util.Objects;

public class Otziv {

    private int raiting;
    private String textOfOtziv;
    private Date date;
    private User user;

    public Otziv() {
    }

    public Otziv(int raiting, String textOfOtziv) {
        this.raiting = raiting;
        this.textOfOtziv = textOfOtziv;
    }

    public int getRaiting() {
        return raiting;
    }

    public void setRaiting(int raiting) {
        this.raiting = raiting;
    }

    public String getTextOfOtziv() {
        return textOfOtziv;
    }

    public void setTextOfOtziv(String textOfOtziv) {
        this.textOfOtziv = textOfOtziv;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (raiting != otziv.raiting) return false;
        if (!Objects.equals(textOfOtziv, otziv.textOfOtziv)) return false;
        if (!Objects.equals(date, otziv.date)) return false;
        return Objects.equals(user, otziv.user);
    }

    @Override
    public int hashCode() {
        int result = raiting;
        result = 31 * result + (textOfOtziv != null ? textOfOtziv.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (user != null ? user.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Otziv{" +
                "raiting=" + raiting +
                ", textOfOtziv='" + textOfOtziv + '\'' +
                ", date=" + date +
                ", user=" + user +
                '}';
    }
}
