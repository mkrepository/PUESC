
package pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for documentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="documentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="content" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}contentType"/>
 *         &lt;element name="dispatchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personSISC" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *         &lt;element name="middleSISC" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *         &lt;element name="endSISC" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}idSISC" minOccurs="0"/>
 *         &lt;element name="attachments" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}attachmentsType" minOccurs="0"/>
 *         &lt;element name="targetSystems" type="{http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0}targetSystemsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "documentType", propOrder = {
    "content",
    "dispatchId",
    "caseId",
    "personSISC",
    "middleSISC",
    "endSISC",
    "attachments",
    "targetSystems"
})
public class DocumentType {

    @XmlElement(required = true)
    protected ContentType content;
    protected String dispatchId;
    protected String caseId;
    protected String personSISC;
    protected String middleSISC;
    protected String endSISC;
    protected AttachmentsType attachments;
    @XmlElement(required = true)
    protected TargetSystemsType targetSystems;

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType }
     *     
     */
    public ContentType getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType }
     *     
     */
    public void setContent(ContentType value) {
        this.content = value;
    }

    /**
     * Gets the value of the dispatchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDispatchId() {
        return dispatchId;
    }

    /**
     * Sets the value of the dispatchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDispatchId(String value) {
        this.dispatchId = value;
    }

    /**
     * Gets the value of the caseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseId() {
        return caseId;
    }

    /**
     * Sets the value of the caseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseId(String value) {
        this.caseId = value;
    }

    /**
     * Gets the value of the personSISC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSISC() {
        return personSISC;
    }

    /**
     * Sets the value of the personSISC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSISC(String value) {
        this.personSISC = value;
    }

    /**
     * Gets the value of the middleSISC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleSISC() {
        return middleSISC;
    }

    /**
     * Sets the value of the middleSISC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleSISC(String value) {
        this.middleSISC = value;
    }

    /**
     * Gets the value of the endSISC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndSISC() {
        return endSISC;
    }

    /**
     * Sets the value of the endSISC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndSISC(String value) {
        this.endSISC = value;
    }

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentsType }
     *     
     */
    public AttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentsType }
     *     
     */
    public void setAttachments(AttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the targetSystems property.
     * 
     * @return
     *     possible object is
     *     {@link TargetSystemsType }
     *     
     */
    public TargetSystemsType getTargetSystems() {
        return targetSystems;
    }

    /**
     * Sets the value of the targetSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetSystemsType }
     *     
     */
    public void setTargetSystems(TargetSystemsType value) {
        this.targetSystems = value;
    }

}
