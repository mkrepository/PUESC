package pl.siecommerce.PUESC.repositoryImp;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Set;
import java.util.TimeZone;

import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;


import sun.misc.BASE64Encoder;



//@Repository
public class UserRepositoryImp implements SOAPHandler<SOAPMessageContext> {

	//private static final Logger logger = LoggerFactory.getLogger(UserRepositoryImp.class);
	
	
	//@Value("${passwordPuesc}")
	private String passwordPuesc = "Monitor#2017";
	
	//@Value("${loginPuesc}")
	private String loginPuesc = "Piotr.kowalczyk@si-consulting.pl";
	
	private String pass = "";
	
	public boolean handleMessage(SOAPMessageContext msg) {
		
		 Boolean outboundProperty = (Boolean) msg.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		
		//From the spec: Password_Digest = Base64 ( SHA-1 ( nonce + created + password ) )
		if (outboundProperty.booleanValue()) {
			
		
		
		try{
		 // nonce
        SecureRandom rand = SecureRandom.getInstance("SHA1PRNG");
        rand.setSeed(System.currentTimeMillis());
        byte[] nonceBytes = new byte[16];
        rand.nextBytes(nonceBytes);
        
        
        

        // created date
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        String createdDate = df.format(Calendar.getInstance().getTime());
        byte[] createdDateBytes = createdDate.getBytes("UTF-8");
        
  
        
      // password
        byte[] passwordBytes = passwordPuesc.getBytes("UTF-8");
        
        
     
        
        //SHA-1
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        baos.write(nonceBytes);
        baos.write(createdDateBytes);
        baos.write(passwordBytes);
        MessageDigest md = MessageDigest.getInstance("SHA-1");
        byte[] digestedPassword = md.digest(baos.toByteArray());
        
        
        //Encode                   
        String passwordB64 = (new BASE64Encoder()).encode(digestedPassword);
        String nonceB64 = (new BASE64Encoder()).encode(nonceBytes);
        
        System.out.println(passwordB64);
        pass = passwordB64;
    
        
      // header 
        SOAPEnvelope envelope = msg.getMessage().getSOAPPart().getEnvelope();
        SOAPHeader header = envelope.addHeader();
        SOAPElement security = header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        SOAPElement usernameToken = security.addChildElement("UsernameToken", "wsse");
        
        SOAPElement username = usernameToken.addChildElement("Username", "wsse");
        username.addTextNode(loginPuesc);
        
        SOAPElement password = usernameToken.addChildElement("Password", "wsse");
        password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordDigest");
        password.addTextNode(passwordB64);
        
        SOAPElement nonce = usernameToken.addChildElement("Nonce", "wsse");
        nonce.addTextNode(nonceB64);
        
        SOAPElement created = usernameToken.addChildElement("Created", "wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        created.addTextNode(createdDate);
        
        msg.getMessage().writeTo(System.out);
        
        
        
        
        
		}catch (Exception e) {
			e.printStackTrace();
			//logger.info("Nie został ");
		}
		
		}
		
		
		
		return outboundProperty;
	}





	

	public Set getHeaders() {
		return Collections.emptySet();
	}

	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}







	public void close(MessageContext context) {
		
	}







	
	

	
	
}
