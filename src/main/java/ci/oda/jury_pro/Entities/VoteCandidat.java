package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "vote_candidats")
public class VoteCandidat {

    @Id
    @GeneratedValue
    private int votecandidatId;
    private int votecandidatNote;
    private String votecandidatCommentaires;
    @ManyToOne
    private Jury jury;
    @ManyToOne
    private Evenement evenement;
    @ManyToOne
    private Candidat candidat;

    public int getvotecandidatId() {
        return votecandidatId;
    }

    public int getvotecandidatNote() {
        return votecandidatNote;
    }

    public String getvotecandidatCommentaires() {
        return votecandidatCommentaires;
    }

}
