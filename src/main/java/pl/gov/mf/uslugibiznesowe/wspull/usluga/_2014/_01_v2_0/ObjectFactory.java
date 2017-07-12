
package pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0 package. 
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

    private final static QName _GetNextDocumentRequest_QNAME = new QName("http://www.mf.gov.pl/uslugiBiznesowe/WsPull/Usluga/2014/01_v2_0", "GetNextDocumentRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetNextDocumentSiscRequest }
     * 
     */
    public GetNextDocumentSiscRequest createGetNextDocumentSiscRequest() {
        return new GetNextDocumentSiscRequest();
    }

    /**
     * Create an instance of {@link GetDocumentsRequest }
     * 
     */
    public GetDocumentsRequest createGetDocumentsRequest() {
        return new GetDocumentsRequest();
    }

    /**
     * Create an instance of {@link GetDocumentsResponse }
     * 
     */
    public GetDocumentsResponse createGetDocumentsResponse() {
        return new GetDocumentsResponse();
    }

    /**
     * Create an instance of {@link AcceptDocumentResponse }
     * 
     */
    public AcceptDocumentResponse createAcceptDocumentResponse() {
        return new AcceptDocumentResponse();
    }

    /**
     * Create an instance of {@link GetNextDocumentResponse }
     * 
     */
    public GetNextDocumentResponse createGetNextDocumentResponse() {
        return new GetNextDocumentResponse();
    }

    /**
     * Create an instance of {@link AcceptDocumentRequest }
     * 
     */
    public AcceptDocumentRequest createAcceptDocumentRequest() {
        return new AcceptDocumentRequest();
    }

    /**
     * Create an instance of {@link TechErrorFault }
     * 
     */
    public TechErrorFault createTechErrorFault() {
        return new TechErrorFault();
    }

    /**
     * Create an instance of {@link BusinessErrorFault }
     * 
     */
    public BusinessErrorFault createBusinessErrorFault() {
        return new BusinessErrorFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.mf.gov.pl/uslugiBiznesowe/WsPull/Usluga/2014/01_v2_0", name = "GetNextDocumentRequest")
    public JAXBElement<Object> createGetNextDocumentRequest(Object value) {
        return new JAXBElement<Object>(_GetNextDocumentRequest_QNAME, Object.class, null, value);
    }

}
