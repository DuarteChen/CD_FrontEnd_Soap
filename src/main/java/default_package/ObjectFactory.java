
package default_package;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the default_package package. 
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

    private final static QName _ListarConsultasServer_QNAME = new QName("http://default_package/", "listarConsultas_Server");
	private final static QName _ListarConsultasServerResponse_QNAME = new QName("http://default_package/", "listarConsultas_ServerResponse");
	private final static QName _NotBoundException_QNAME = new QName("http://default_package/", "NotBoundException");
	private final static QName _MalformedURLException_QNAME = new QName("http://default_package/", "MalformedURLException");
	private final static QName _VerConsultas_QNAME = new QName("http://default_package/", "verConsultas");
    private final static QName _VerConsultasResponse_QNAME = new QName("http://default_package/", "verConsultasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: default_package
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListarConsultasServer }
     * 
     */
    public ListarConsultasServer createListarConsultasServer() {
        return new ListarConsultasServer();
    }

	/**
     * Create an instance of {@link ListarConsultasServerResponse }
     * 
     */
    public ListarConsultasServerResponse createListarConsultasServerResponse() {
        return new ListarConsultasServerResponse();
    }

	/**
     * Create an instance of {@link NotBoundException }
     * 
     */
    public NotBoundException createNotBoundException() {
        return new NotBoundException();
    }

	/**
     * Create an instance of {@link MalformedURLException }
     * 
     */
    public MalformedURLException createMalformedURLException() {
        return new MalformedURLException();
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConsultasServer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarConsultasServer }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarConsultas_Server")
    public JAXBElement<ListarConsultasServer> createListarConsultasServer(ListarConsultasServer value) {
        return new JAXBElement<ListarConsultasServer>(_ListarConsultasServer_QNAME, ListarConsultasServer.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarConsultasServerResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarConsultasServerResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "listarConsultas_ServerResponse")
    public JAXBElement<ListarConsultasServerResponse> createListarConsultasServerResponse(ListarConsultasServerResponse value) {
        return new JAXBElement<ListarConsultasServerResponse>(_ListarConsultasServerResponse_QNAME, ListarConsultasServerResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NotBoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "NotBoundException")
    public JAXBElement<NotBoundException> createNotBoundException(NotBoundException value) {
        return new JAXBElement<NotBoundException>(_NotBoundException_QNAME, NotBoundException.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MalformedURLException }{@code >}
     */
    @XmlElementDecl(namespace = "http://default_package/", name = "MalformedURLException")
    public JAXBElement<MalformedURLException> createMalformedURLException(MalformedURLException value) {
        return new JAXBElement<MalformedURLException>(_MalformedURLException_QNAME, MalformedURLException.class, null, value);
    }

	/**
     * Create an instance of {@link VerConsultas }
     * 
     */
    public VerConsultas createVerConsultas() {
        return new VerConsultas();
    }

    /**
     * Create an instance of {@link VerConsultasResponse }
     * 
     */
    public VerConsultasResponse createVerConsultasResponse() {
        return new VerConsultasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerConsultas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerConsultas }{@code >}
     */
//    @XmlElementDecl(namespace = "http://default_package/", name = "verConsultas")
    public JAXBElement<VerConsultas> createVerConsultas(VerConsultas value) {
        return new JAXBElement<VerConsultas>(_VerConsultas_QNAME, VerConsultas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerConsultasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VerConsultasResponse }{@code >}
     */
//    @XmlElementDecl(namespace = "http://default_package/", name = "verConsultasResponse")
    public JAXBElement<VerConsultasResponse> createVerConsultasResponse(VerConsultasResponse value) {
        return new JAXBElement<VerConsultasResponse>(_VerConsultasResponse_QNAME, VerConsultasResponse.class, null, value);
    }

}
