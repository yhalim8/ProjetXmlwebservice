package ReleveWS;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlTransient;
import releve.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@WebService(name = "relevewss")
public class Relevews {
    @WebMethod (operationName = "getreleve")

    public Releve getreleve() throws Exception{
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        return releve;
    }
    //amelioration
    @WebMethod(operationName = "getOperationsByType")
    public List<Operation> getOpsbytype(@WebParam Type type) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));
        return releve.getOp().getOpsbytype(type);
    }
}
