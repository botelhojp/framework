package openjade.ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Sign
* @author ontology bean generator
* @version 2014/06/24, 21:00:54
*/
@SuppressWarnings("all")
public class Sign extends MessageAction{ 

   /**
* Protege name: pkcs7
   */
   private PKCS7Message pkcs7;
   public void setPkcs7(PKCS7Message value) { 
    this.pkcs7=value;
   }
   public PKCS7Message getPkcs7() {
     return this.pkcs7;
   }

}
