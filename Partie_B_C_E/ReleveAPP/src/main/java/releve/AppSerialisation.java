package releve;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class AppSerialisation {
    public static void main(String[] args) throws JAXBException {
      JAXBContext jaxbContext =  JAXBContext.newInstance(Releve.class);
        Operations ops = new Operations("2022-01-01","2022-01-30");
        Releve releve = new Releve ("5646541513515135",4500,"2022-11-10",ops);
        ops.add(new Operation(Type.Credit,"2022-01-05",9000,"Vers Espece"));
        ops.add(new Operation(Type.Debit,"2022-01-11",9000,"Cheque guichet"));
        ops.add(new Operation(Type.Debit,"2022-01-15",9000,"Prelevement Assurance"));
        ops.add(new Operation(Type.Credit,"2022-01-15",9000,"Virment"));

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve,new File("releve.xml"));
      System.out.println(ops.getOpsbytype(Type.Credit));




    }
}
