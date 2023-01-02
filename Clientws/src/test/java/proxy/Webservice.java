
package proxy;

import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.FaultAction;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "webservice", targetNamespace = "http://ReleveWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Webservice {


    /**
     * 
     * @return
     *     returns proxy.Releve
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getreleve", targetNamespace = "http://ReleveWS/", className = "proxy.Getreleve")
    @ResponseWrapper(localName = "getreleveResponse", targetNamespace = "http://ReleveWS/", className = "proxy.GetreleveResponse")
    @Action(input = "http://ReleveWS/webservice/getreleveRequest", output = "http://ReleveWS/webservice/getreleveResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://ReleveWS/webservice/getreleve/Fault/Exception")
    })
    public Releve getreleve()
        throws Exception_Exception
    ;

}
