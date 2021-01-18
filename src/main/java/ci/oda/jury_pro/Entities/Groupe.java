package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "groupes")
public class Groupe {

    @Id
    @GeneratedValue
    private int groupeId;
    private int groupeCode;
    private String groupeNom;
    @ManyToOne
    private Evenement evenement;

    public int getgroupeId() {
        return groupeId;
    }

    public int getgroupeCode() {
        return groupeCode;
    }

    public String getgroupeNom() {
        return groupeNom;
    }

}
