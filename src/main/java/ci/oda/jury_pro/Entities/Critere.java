package ci.oda.jury_pro.Entities;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "criteres")
public class Critere {

    @Id
    @GeneratedValue
    private int critereId;
    private String critereLibelle;
    private int critereBareme;
    @ManyToOne
    private Evenement evenement;

    public int getcritereId() {
        return critereId;
    }

    public String getcritereLibelle() {
        return critereLibelle;
    }

    public int getcritereBareme() {
        return critereBareme;
    }

}
