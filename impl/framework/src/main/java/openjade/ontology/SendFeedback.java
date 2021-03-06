package openjade.ontology;

import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: SendFeedback
* @author ontology bean generator
* @version 2016/10/3, 23:54:47
*/
public class SendFeedback extends MessageAction{ 

   /**
* Protege name: feedback
   */
   private List feedback = new ArrayList();
   public void addFeedback(Object elem) { 
     List oldList = this.feedback;
     feedback.add(elem);
   }
   public boolean removeFeedback(Object elem) {
     List oldList = this.feedback;
     boolean result = feedback.remove(elem);
     return result;
   }
   public void clearAllFeedback() {
     List oldList = this.feedback;
     feedback.clear();
   }
   public Iterator getAllFeedback() {return feedback.iterator(); }
   public List getFeedback() {return feedback; }
   public void setFeedback(List l) {feedback = l; }

}
