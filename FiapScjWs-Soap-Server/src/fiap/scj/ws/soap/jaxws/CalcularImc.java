
package fiap.scj.ws.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "calcularImc", namespace = "http://soap.ws.scj.fiap/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcularImc", namespace = "http://soap.ws.scj.fiap/")
public class CalcularImc {

    @XmlElement(name = "arg0", namespace = "")
    private fiap.scj.ws.soap.Pessoa arg0;

    /**
     * 
     * @return
     *     returns Pessoa
     */
    public fiap.scj.ws.soap.Pessoa getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(fiap.scj.ws.soap.Pessoa arg0) {
        this.arg0 = arg0;
    }

}
