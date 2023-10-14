package lesson9;

import java.util.Date;
import java.util.Objects;

public class User
{
    private String username;
    private String pathToImage;
//    private Date date;


    public User() {

    }

    public User(String username, String pathToImage) {
        this.username = username;
        this.pathToImage = pathToImage;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPathToImage() {
        return pathToImage;
    }

    public void setPathToImage(String pathToImage) {
        this.pathToImage = pathToImage;
    }

//    public Date getDate() {
//        return date;
//    }
//
//    public void setDate(Date date) {
//        this.date = date;
//    }

    @Override
    public boolean equals(Object o) {
        //this - перый об
        //о - второй

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!Objects.equals(username, user.username)) return false;
        return Objects.equals(pathToImage, user.pathToImage);
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (pathToImage != null ? pathToImage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", pathToImage='" + pathToImage + '\'' +
                '}';
    }
}
