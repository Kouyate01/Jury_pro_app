package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "evenements")
public class Evenement {

    @Id
    @GeneratedValue
    private int evenementId;
    private String evenementNom;
    private int evenementType;
    private Date evenementDateDebut;
    private Date evenementDateFin;

    public int getevenementId() {
        return evenementId;
    }

    public String getevenementNom() {
        return evenementNom;
    }

    public int getevenementType() {
        return evenementType;
    }

    public Date getevenementDateDebut() {
        return evenementDateDebut;
    }

    public Date getevenementDateFin() {
        return evenementDateFin;
    }

    public void setId(int id) {
        this.evenementId = id;
    }

}
