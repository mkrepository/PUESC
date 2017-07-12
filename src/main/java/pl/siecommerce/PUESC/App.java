package pl.siecommerce.PUESC;

import pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0.DocumentHandlingPort;
import pl.gov.mf.uslugibiznesowe.wspull.usluga._2014._01_v2_0.DocumentHandlingSvc;

public class App 
{
    public static void main( String[] args )
    {

    	
    	DocumentHandlingSvc documentHandlingSvc = new DocumentHandlingSvc();
    	DocumentHandlingPort documentHandlingPort = documentHandlingSvc.getDocumentHandlingPort();
    	
    }
}
