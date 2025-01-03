package default_package;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-11-13T10:31:51.269Z
 * Generated source version: 3.6.4
 *
 */
@WebServiceClient(name = "FrontEnd_ClinicaService",
                  wsdlLocation = "http://localhost:8080/CD_FrontEnd_Soap/services/FrontEnd_ClinicaPort?wsdl",
                  targetNamespace = "http://default_package/")
public class FrontEndClinicaService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://default_package/", "FrontEnd_ClinicaService");
    public static final QName FrontEndClinicaPort = new QName("http://default_package/", "FrontEnd_ClinicaPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/FrontEnd_Soap/services/FrontEnd_ClinicaPort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(FrontEndClinicaService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/FrontEnd_Soap/services/FrontEnd_ClinicaPort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public FrontEndClinicaService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public FrontEndClinicaService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FrontEndClinicaService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public FrontEndClinicaService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public FrontEndClinicaService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public FrontEndClinicaService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns FrontEndClinica
     */
    @WebEndpoint(name = "FrontEnd_ClinicaPort")
    public FrontEndClinica getFrontEndClinicaPort() {
        return super.getPort(FrontEndClinicaPort, FrontEndClinica.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FrontEndClinica
     */
    @WebEndpoint(name = "FrontEnd_ClinicaPort")
    public FrontEndClinica getFrontEndClinicaPort(WebServiceFeature... features) {
        return super.getPort(FrontEndClinicaPort, FrontEndClinica.class, features);
    }

}
