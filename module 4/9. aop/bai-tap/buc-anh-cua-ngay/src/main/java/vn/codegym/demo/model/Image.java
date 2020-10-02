package vn.codegym.demo.model;

import javax.persistence.*;

@Entity
@Table
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int mark;
    private String Author;
    private String Feedback;
    private int numberOfLikes;

    public Image() {

    }

    public Image(int mark, String author, String feedback, int numberOfLikes) {
        this.mark = mark;
        Author = author;
        Feedback = feedback;
        this.numberOfLikes = numberOfLikes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getFeedback() {
        return Feedback;
    }


    public void setFeedback(String feedback) {
        Feedback = feedback;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    @Override
    public String toString() {
        return "Image{" +
                "Author='" + Author + '\'' +
                ", Feedback='" + Feedback + '\'' +
                '}';
    }
}
