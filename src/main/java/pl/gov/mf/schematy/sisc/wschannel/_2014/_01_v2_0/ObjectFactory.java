
package pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0 package. 
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

    private final static QName _Document_QNAME = new QName("http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0", "document");
    private final static QName _Result_QNAME = new QName("http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0", "result");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentType }
     * 
     */
    public DocumentType createDocumentType() {
        return new DocumentType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link TechErrorType }
     * 
     */
    public TechErrorType createTechErrorType() {
        return new TechErrorType();
    }

    /**
     * Create an instance of {@link BusinessErrorType }
     * 
     */
    public BusinessErrorType createBusinessErrorType() {
        return new BusinessErrorType();
    }

    /**
     * Create an instance of {@link AttachmentsType }
     * 
     */
    public AttachmentsType createAttachmentsType() {
        return new AttachmentsType();
    }

    /**
     * Create an instance of {@link TargetSystemsType }
     * 
     */
    public TargetSystemsType createTargetSystemsType() {
        return new TargetSystemsType();
    }

    /**
     * Create an instance of {@link ContentType }
     * 
     */
    public ContentType createContentType() {
        return new ContentType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0", name = "document")
    public JAXBElement<DocumentType> createDocument(DocumentType value) {
        return new JAXBElement<DocumentType>(_Document_QNAME, DocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mf.gov.pl/schematy/SISC/WsChannel/2014/01_v2_0", name = "result")
    public JAXBElement<ResultType> createResult(ResultType value) {
        return new JAXBElement<ResultType>(_Result_QNAME, ResultType.class, null, value);
    }

}
