package com.iliade.projet.stage.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "Question")
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_question;
    @Column
    private Type_question type_question;

    @Column
    private String question;
    @Column
    private Float note_question;



    // Getters and setters

    public long getId_question() {
        return id_question;
    }

    public void setId_question(long id_question) {
        this.id_question = id_question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Float getNote_question() {
        return note_question;
    }

    public void setNote_question(Float note_question) {
        this.note_question = note_question;
    }


    //Constructor

    public Question(long id_question, String question, Float note_question) {
        this.id_question = id_question;
        this.question = question;
        this.note_question = note_question;
    }



    //toString

    @Override
    public String toString() {
        return "Question{" +
                "id_question=" + id_question +
                ", question='" + question + '\'' +
                ", note_question=" + note_question +
                '}';
    }
}
;
