
package defaultnamespace.jaxws;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.4
 * Thu Dec 12 20:02:04 WET 2024
 * Generated source version: 3.6.4
 */

@XmlRootElement(name = "MalformedURLException", namespace = "http://net.java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MalformedURLException", namespace = "http://net.java/")

public class MalformedURLExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}