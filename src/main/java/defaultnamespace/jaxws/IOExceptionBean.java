
package defaultnamespace.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.6.4
 * Tue Nov 26 11:09:25 WET 2024
 * Generated source version: 3.6.4
 */

@XmlRootElement(name = "IOException", namespace = "http://io.java/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IOException", namespace = "http://io.java/")

public class IOExceptionBean {

    private java.lang.String message;

    public java.lang.String getMessage() {
        return this.message;
    }

    public void setMessage(java.lang.String newMessage)  {
        this.message = newMessage;
    }

}
