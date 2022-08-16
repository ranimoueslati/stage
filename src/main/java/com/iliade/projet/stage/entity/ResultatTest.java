package com.iliade.projet.stage.entity;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ResultatTest")
public class ResultatTest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_test;
    @Column
    private Long id_condidat;
    private enum resultat{
        admis,
        non_admis;
    };


    //Getter and Setter

    public Long getId_test() {
        return id_test;
    }

    public void setId_test(Long id_test) {
        this.id_test = id_test;
    }

    public Long getId_condidat() {
        return id_condidat;
    }

    public void setId_condidat(Long id_condidat) {
        this.id_condidat = id_condidat;
    }



    //Constructor

    public ResultatTest(Long id_test, Long id_condidat) {
        this.id_test = id_test;
        this.id_condidat = id_condidat;
    }




    //toString


    @Override
    public String toString() {
        return "ResultatTest{" +
                "id_test=" + id_test +
                ", id_condidat=" + id_condidat +
                '}';
    }
}
