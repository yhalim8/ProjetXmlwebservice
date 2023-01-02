
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Exception_QNAME = new QName("http://ReleveWS/", "Exception");
    private final static QName _Getreleve_QNAME = new QName("http://ReleveWS/", "getreleve");
    private final static QName _GetreleveResponse_QNAME = new QName("http://ReleveWS/", "getreleveResponse");
    private final static QName _Releve_QNAME = new QName("http://ReleveWS/", "releve");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     * @return
     *     the new instance of {@link Exception }
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link Getreleve }
     * 
     * @return
     *     the new instance of {@link Getreleve }
     */
    public Getreleve createGetreleve() {
        return new Getreleve();
    }

    /**
     * Create an instance of {@link GetreleveResponse }
     * 
     * @return
     *     the new instance of {@link GetreleveResponse }
     */
    public GetreleveResponse createGetreleveResponse() {
        return new GetreleveResponse();
    }

    /**
     * Create an instance of {@link Releve }
     * 
     * @return
     *     the new instance of {@link Releve }
     */
    public Releve createReleve() {
        return new Releve();
    }

    /**
     * Create an instance of {@link Operations }
     * 
     * @return
     *     the new instance of {@link Operations }
     */
    public Operations createOperations() {
        return new Operations();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}
     */
    @XmlElementDecl(namespace = "http://ReleveWS/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getreleve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Getreleve }{@code >}
     */
    @XmlElementDecl(namespace = "http://ReleveWS/", name = "getreleve")
    public JAXBElement<Getreleve> createGetreleve(Getreleve value) {
        return new JAXBElement<>(_Getreleve_QNAME, Getreleve.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetreleveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetreleveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ReleveWS/", name = "getreleveResponse")
    public JAXBElement<GetreleveResponse> createGetreleveResponse(GetreleveResponse value) {
        return new JAXBElement<>(_GetreleveResponse_QNAME, GetreleveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Releve }{@code >}
     */
    @XmlElementDecl(namespace = "http://ReleveWS/", name = "releve")
    public JAXBElement<Releve> createReleve(Releve value) {
        return new JAXBElement<>(_Releve_QNAME, Releve.class, null, value);
    }

}
