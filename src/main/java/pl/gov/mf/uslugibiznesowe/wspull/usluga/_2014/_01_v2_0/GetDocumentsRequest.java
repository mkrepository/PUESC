
package pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="idSiscROF" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0" form="qualified"/>
 *         &lt;element name="idSiscROP" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0" form="qualified"/>
 *         &lt;element name="idSiscP" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0" form="qualified"/>
 *         &lt;element name="sysRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="idWysylki" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="idDocSysZew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="idSprawy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="pobrany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
 *         &lt;element name="dataOd" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0" form="qualified"/>
 *         &lt;element name="dataDo" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0" form="qualified"/>
 *         &lt;element name="korelacjaSysref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="qualified"/>
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
    "idSiscP",
    "sysRef",
    "idWysylki",
    "idDocSysZew",
    "idSprawy",
    "pobrany",
    "dataOd",
    "dataDo",
    "korelacjaSysref"
})
@XmlRootElement(name = "GetDocumentsRequest")
public class GetDocumentsRequest {

    protected String idSiscROF;
    protected String idSiscROP;
    protected String idSiscP;
    protected String sysRef;
    protected String idWysylki;
    protected String idDocSysZew;
    protected String idSprawy;
    protected String pobrany;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataOd;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataDo;
    protected String korelacjaSysref;

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

    /**
     * Gets the value of the sysRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysRef() {
        return sysRef;
    }

    /**
     * Sets the value of the sysRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysRef(String value) {
        this.sysRef = value;
    }

    /**
     * Gets the value of the idWysylki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdWysylki() {
        return idWysylki;
    }

    /**
     * Sets the value of the idWysylki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdWysylki(String value) {
        this.idWysylki = value;
    }

    /**
     * Gets the value of the idDocSysZew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdDocSysZew() {
        return idDocSysZew;
    }

    /**
     * Sets the value of the idDocSysZew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdDocSysZew(String value) {
        this.idDocSysZew = value;
    }

    /**
     * Gets the value of the idSprawy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdSprawy() {
        return idSprawy;
    }

    /**
     * Sets the value of the idSprawy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdSprawy(String value) {
        this.idSprawy = value;
    }

    /**
     * Gets the value of the pobrany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPobrany() {
        return pobrany;
    }

    /**
     * Sets the value of the pobrany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPobrany(String value) {
        this.pobrany = value;
    }

    /**
     * Gets the value of the dataOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOd() {
        return dataOd;
    }

    /**
     * Sets the value of the dataOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOd(XMLGregorianCalendar value) {
        this.dataOd = value;
    }

    /**
     * Gets the value of the dataDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataDo() {
        return dataDo;
    }

    /**
     * Sets the value of the dataDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataDo(XMLGregorianCalendar value) {
        this.dataDo = value;
    }

    /**
     * Gets the value of the korelacjaSysref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKorelacjaSysref() {
        return korelacjaSysref;
    }

    /**
     * Sets the value of the korelacjaSysref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKorelacjaSysref(String value) {
        this.korelacjaSysref = value;
    }

}
