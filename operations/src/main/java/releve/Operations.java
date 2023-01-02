package releve;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Operations {
    @XmlAttribute
    private String date_debut;
    @XmlAttribute
    private String date_fin;
    @XmlElement(name = "operation")
    public
    List<Operation> operation = new ArrayList<>();

    @Override
    public String toString() {
        String detail = "Operations :";
        detail += "date_debut=" + date_debut;
        detail += ", date_fin=" + date_fin;
        for (Operation r : operation)
            detail += "\n" + r.toString();
        return detail;
    }

    public String getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    public List<Operation> getOperations() {
        return operation;
    }

    public void setOperations(List<Operation> operations) {
        this.operation = operations;
    }

    public Operations(String date_debut, String date_fin) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public Operations() {
    }

    public void add(Operation a) {
        operation.add(a);
    }

    public List<Operation> getOpsbytype(Type type) {
        List<Operation> operations= new ArrayList<>();
        for (Operation ops : operation) {
            if (type==ops.getType())
                operations.add(ops);
        }
        return operations;
    }
}