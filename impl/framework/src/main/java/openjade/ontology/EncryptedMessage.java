package openjade.ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: EncryptedMessage
* @author ontology bean generator
* @version 2016/10/3, 23:54:47
*/
public class EncryptedMessage extends ACLMessage{ 

   /**
* Protege name: keyAlgorithm
   */
   private String keyAlgorithm;
   public void setKeyAlgorithm(String value) { 
    this.keyAlgorithm=value;
   }
   public String getKeyAlgorithm() {
     return this.keyAlgorithm;
   }

   /**
* Protege name: key
   */
   private Object key;
   public void setKey(Object value) { 
    this.key=value;
   }
   public Object getKey() {
     return this.key;
   }

   /**
* Protege name: listContent
   */
   private List listContent = new ArrayList();
   public void addListContent(Object elem) { 
     List oldList = this.listContent;
     listContent.add(elem);
   }
   public boolean removeListContent(Object elem) {
     List oldList = this.listContent;
     boolean result = listContent.remove(elem);
     return result;
   }
   public void clearAllListContent() {
     List oldList = this.listContent;
     listContent.clear();
   }
   public Iterator getAllListContent() {return listContent.iterator(); }
   public List getListContent() {return listContent; }
   public void setListContent(List l) {listContent = l; }

}
