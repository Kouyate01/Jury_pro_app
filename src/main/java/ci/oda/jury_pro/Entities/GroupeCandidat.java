package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "groupe_candidats")
public class GroupeCandidat {

    @Id
    @GeneratedValue
    private int groupecandidatId;
    @ManyToOne
    private Groupe groupe;
    @ManyToOne
    private Candidat candidat;

    public int getgroupecandidatId() {
        return groupecandidatId;
    }

}
