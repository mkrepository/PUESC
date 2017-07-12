
package pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0.DocumentType;


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
 *         &lt;element ref="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}document" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="hasNext" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "document"
})
@XmlRootElement(name = "GetNextDocumentResponse")
public class GetNextDocumentResponse {

    @XmlElement(namespace = "http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0")
    protected DocumentType document;
    @XmlAttribute(name = "hasNext")
    protected Boolean hasNext;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocument(DocumentType value) {
        this.document = value;
    }

    /**
     * Gets the value of the hasNext property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasNext() {
        return hasNext;
    }

    /**
     * Sets the value of the hasNext property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasNext(Boolean value) {
        this.hasNext = value;
    }

}
