package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "vote_groupes")
public class VoteGroupe {

    @Id
    @GeneratedValue
    private int votegroupeId;
    private int votegroupeNote;
    private String votegroupeCommentaires; 
    @ManyToOne
    private Jury jury;
    @ManyToOne 
    private Evenement evenement;
    @ManyToOne 
    private Groupe groupe;

    public int getvotecandidatId(){
        return votegroupeId;
    }

    public int getvotegroupeNote(){
        return votegroupeNote;
    }

    public String getvotegroupeCommentaires(){
        return votegroupeCommentaires;
    }

}
