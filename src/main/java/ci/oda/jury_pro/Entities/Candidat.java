package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "candidats")
public class Candidat {

    @Id
    @GeneratedValue
    private int candidatId;
    private int candidatCode;
    private String candidatNom;
    private String candidatPrenom;
    private String candidatEmail;
    private int candidatTelephone;
    @Lob
    private Byte[] candidatPhoto;
    @ManyToOne
    private Evenement evenement;

    public int getcandidatId() {
        return candidatId;
    }

    public int getcandidatCode() {
        return candidatCode;
    }

    public String getcandidatNom() {
        return candidatNom;
    }

    public String getcandidatPrenom() {
        return candidatPrenom;
    }

    public String getcandidatEmail() {
        return candidatEmail;
    }

    public int getcandidatTelephone() {
        return candidatTelephone;
    }

    public Byte[] getcandidatPhoto() {
        return candidatPhoto;
    }

}
