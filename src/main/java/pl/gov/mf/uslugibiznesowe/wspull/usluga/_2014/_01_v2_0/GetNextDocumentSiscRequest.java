
package pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSiscROF" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *         &lt;element name="idSiscROP" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *         &lt;element name="idSiscP" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSiscROF",
    "idSiscROP",
    "idSiscP"
})
@XmlRootElement(name = "GetNextDocumentSiscRequest")
public class GetNextDocumentSiscRequest {

    protected String idSiscROF;
    protected String idSiscROP;
    protected String idSiscP;

    /**
     * Gets the value of the idSiscROF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSiscROF() {
        return idSiscROF;
    }

    /**
     * Sets the value of the idSiscROF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSiscROF(String value) {
        this.idSiscROF = value;
    }

    /**
     * Gets the value of the idSiscROP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSiscROP() {
        return idSiscROP;
    }

    /**
     * Sets the value of the idSiscROP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSiscROP(String value) {
        this.idSiscROP = value;
    }

    /**
     * Gets the value of the idSiscP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSiscP() {
        return idSiscP;
    }

    /**
     * Sets the value of the idSiscP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSiscP(String value) {
        this.idSiscP = value;
    }

}
