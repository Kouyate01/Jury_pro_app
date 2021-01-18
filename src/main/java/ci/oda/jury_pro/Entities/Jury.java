package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "jury")
public class Jury {

    @Id
    @GeneratedValue
    private int juryId;
    private int juryCode;
    private String juryNomComplet;
    private int juryTelephone;
    private String juryEmail;
    @ManyToOne
    private Evenement evenement;

    public int getjuryId() {
        return juryId;
    }

    public int getjuryCode() {
        return juryCode;
    }

    public String getjuryNomComplet() {
        return juryNomComplet;
    }

    public int getjuryTelephone() {
        return juryTelephone;
    }

    public String getjuryEmail() {
        return juryEmail;
    }

}
