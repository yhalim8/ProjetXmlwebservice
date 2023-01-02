package releve;

import jakarta.xml.bind.annotation.*;

import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "releve")
public class Releve  {
    @XmlAttribute(name = "RIB")
   private String rib;
@XmlElement
   private double solde;
@XmlElement
   private String date_releve;
   @XmlElement(name = "operations")
   private Operations op;
public Releve( String rib, double solde, String date_releve,Operations op) {
        this.rib = rib;
        this.solde = solde;
        this.date_releve = date_releve;
        this.op=op;
    }

    @Override
    public String toString() {
        return "Releve {" +
                "rib='" + rib + '\'' +
                ", solde=" + solde +
                ", date_releve=" + date_releve +
                "}\n" + op +
                '}';
    }

    public Releve() {
    }

    public Operations getOp() {
        return op;
    }
}
