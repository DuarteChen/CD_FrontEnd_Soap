
package defaultnamespace.jaxws;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.4
 * Mon Nov 18 11:40:00 WET 2024
 * Generated source version: 3.6.4
 */

@XmlRootElement(name = "NotBoundException", namespace = "http://rmi.java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotBoundException", namespace = "http://rmi.java/")

public class NotBoundExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}