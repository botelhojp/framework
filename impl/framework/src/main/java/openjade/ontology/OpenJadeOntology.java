// file: OpenJadeOntology.java generated by ontology bean generator.  DO NOT EDIT, UNLESS YOU ARE REALLY SURE WHAT YOU ARE DOING!
package openjade.ontology;

import jade.content.onto.*;
import jade.content.schema.*;
import jade.util.leap.HashMap;
import jade.content.lang.Codec;
import jade.core.CaseInsensitiveString;

/** file: OpenJadeOntology.java
 * @author ontology bean generator
 * @version 2014/07/8, 21:13:29
 */
@SuppressWarnings("all")
public class OpenJadeOntology extends jade.content.onto.Ontology  {
  //NAME
  public static final String ONTOLOGY_NAME = "OpenJade";
  // The singleton instance of this ontology
  private static ReflectiveIntrospector introspect = new ReflectiveIntrospector();
  private static Ontology theInstance = new OpenJadeOntology();
  public static Ontology getInstance() {
     return theInstance;
  }


   // VOCABULARY
    public static final String CHANGEITERATION_ROUND="round";
    public static final String CHANGEITERATION="ChangeIteration";
    public static final String TIMERACTION="TimerAction";
    public static final String SENDRATING_RATING="rating";
    public static final String SENDRATING="SendRating";
    public static final String REQUESTRATING_AID="aid";
    public static final String REQUESTRATING="RequestRating";
    public static final String RATINGACTION="RatingAction";
    public static final String WITNESSRESPONSE_WITNESSES="witnesses";
    public static final String WITNESSRESPONSE="WitnessResponse";
    public static final String WITNESSREQUEST_AID="aid";
    public static final String WITNESSREQUEST="WitnessRequest";
    public static final String WITNESSACTION="WitnessAction";
    public static final String ENCIPHER_SIGNMODE="signMode";
    public static final String ENCIPHER_PROVIDER="provider";
    public static final String ENCIPHER_ALGORITHM="algorithm";
    public static final String ENCIPHER_MESSAGE="message";
    public static final String ENCIPHER="Encipher";
    public static final String SIGN_PKCS7="pkcs7";
    public static final String SIGN="Sign";
    public static final String MESSAGEACTION="MessageAction";
    public static final String RATINGATTRIBUTE_VALUE="value";
    public static final String RATINGATTRIBUTE_NAME="name";
    public static final String RATINGATTRIBUTE="RatingAttribute";
    public static final String PKCS7MESSAGE_CONTENT="content";
    public static final String PKCS7MESSAGE="PKCS7Message";
    public static final String ENCRYPTEDMESSAGE_LISTCONTENT="listContent";
    public static final String ENCRYPTEDMESSAGE_KEY="key";
    public static final String ENCRYPTEDMESSAGE_KEYALGORITHM="keyAlgorithm";
    public static final String ENCRYPTEDMESSAGE="EncryptedMessage";
    public static final String FEEDBACK_RATING="rating";
    public static final String FEEDBACK="Feedback";
    public static final String RATING_ATTRIBUTES="attributes";
    public static final String RATING_VALUE="value";
    public static final String RATING_ROUND="round";
    public static final String RATING_SERVER="server";
    public static final String RATING_CLIENT="client";
    public static final String RATING="Rating";
    public static final String ASCLMESSAGE="ASCLMessage";

  /**
   * Constructor
  */
  private OpenJadeOntology(){ 
    super(ONTOLOGY_NAME, BasicOntology.getInstance());
    try { 

    // adding Concept(s)
    ConceptSchema asclMessageSchema = new ConceptSchema(ASCLMESSAGE);
    add(asclMessageSchema, openjade.ontology.ASCLMessage.class);
    ConceptSchema ratingSchema = new ConceptSchema(RATING);
    add(ratingSchema, openjade.ontology.Rating.class);
    ConceptSchema feedbackSchema = new ConceptSchema(FEEDBACK);
    add(feedbackSchema, openjade.ontology.Feedback.class);
    ConceptSchema encryptedMessageSchema = new ConceptSchema(ENCRYPTEDMESSAGE);
    add(encryptedMessageSchema, openjade.ontology.EncryptedMessage.class);
    ConceptSchema pkcS7MessageSchema = new ConceptSchema(PKCS7MESSAGE);
    add(pkcS7MessageSchema, openjade.ontology.PKCS7Message.class);
    ConceptSchema ratingAttributeSchema = new ConceptSchema(RATINGATTRIBUTE);
    add(ratingAttributeSchema, openjade.ontology.RatingAttribute.class);

    // adding AgentAction(s)
    AgentActionSchema messageActionSchema = new AgentActionSchema(MESSAGEACTION);
    add(messageActionSchema, openjade.ontology.MessageAction.class);
    AgentActionSchema signSchema = new AgentActionSchema(SIGN);
    add(signSchema, openjade.ontology.Sign.class);
    AgentActionSchema encipherSchema = new AgentActionSchema(ENCIPHER);
    add(encipherSchema, openjade.ontology.Encipher.class);
    AgentActionSchema witnessActionSchema = new AgentActionSchema(WITNESSACTION);
    add(witnessActionSchema, openjade.ontology.WitnessAction.class);
    AgentActionSchema witnessRequestSchema = new AgentActionSchema(WITNESSREQUEST);
    add(witnessRequestSchema, openjade.ontology.WitnessRequest.class);
    AgentActionSchema witnessResponseSchema = new AgentActionSchema(WITNESSRESPONSE);
    add(witnessResponseSchema, openjade.ontology.WitnessResponse.class);
    AgentActionSchema ratingActionSchema = new AgentActionSchema(RATINGACTION);
    add(ratingActionSchema, openjade.ontology.RatingAction.class);
    AgentActionSchema requestRatingSchema = new AgentActionSchema(REQUESTRATING);
    add(requestRatingSchema, openjade.ontology.RequestRating.class);
    AgentActionSchema sendRatingSchema = new AgentActionSchema(SENDRATING);
    add(sendRatingSchema, openjade.ontology.SendRating.class);
    AgentActionSchema timerActionSchema = new AgentActionSchema(TIMERACTION);
    add(timerActionSchema, openjade.ontology.TimerAction.class);
    AgentActionSchema changeIterationSchema = new AgentActionSchema(CHANGEITERATION);
    add(changeIterationSchema, openjade.ontology.ChangeIteration.class);

    // adding AID(s)

    // adding Predicate(s)


    // adding fields
    ratingSchema.add(RATING_CLIENT, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.OPTIONAL);
    ratingSchema.add(RATING_SERVER, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.OPTIONAL);
    ratingSchema.add(RATING_ROUND, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.MANDATORY);
    ratingSchema.add(RATING_VALUE, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    ratingSchema.add(RATING_ATTRIBUTES, ratingAttributeSchema, 0, ObjectSchema.UNLIMITED);
    feedbackSchema.add(FEEDBACK_RATING, ratingSchema, 1, ObjectSchema.UNLIMITED);
    encryptedMessageSchema.add(ENCRYPTEDMESSAGE_KEYALGORITHM, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    encryptedMessageSchema.add(ENCRYPTEDMESSAGE_KEY, (TermSchema)getSchema(BasicOntology.SET), ObjectSchema.OPTIONAL);
    encryptedMessageSchema.add(ENCRYPTEDMESSAGE_LISTCONTENT, (TermSchema)getSchema(BasicOntology.SET), 0, ObjectSchema.UNLIMITED);
    pkcS7MessageSchema.add(PKCS7MESSAGE_CONTENT, (TermSchema)getSchema(BasicOntology.SET), ObjectSchema.MANDATORY);
    ratingAttributeSchema.add(RATINGATTRIBUTE_NAME, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    ratingAttributeSchema.add(RATINGATTRIBUTE_VALUE, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    signSchema.add(SIGN_PKCS7, pkcS7MessageSchema, ObjectSchema.OPTIONAL);
    encipherSchema.add(ENCIPHER_MESSAGE, encryptedMessageSchema, ObjectSchema.OPTIONAL);
    encipherSchema.add(ENCIPHER_ALGORITHM, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    encipherSchema.add(ENCIPHER_PROVIDER, (TermSchema)getSchema(BasicOntology.STRING), ObjectSchema.MANDATORY);
    encipherSchema.add(ENCIPHER_SIGNMODE, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.OPTIONAL);
    witnessRequestSchema.add(WITNESSREQUEST_AID, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.MANDATORY);
    witnessResponseSchema.add(WITNESSRESPONSE_WITNESSES, (ConceptSchema)getSchema(BasicOntology.AID), 1, ObjectSchema.UNLIMITED);
    requestRatingSchema.add(REQUESTRATING_AID, (ConceptSchema)getSchema(BasicOntology.AID), ObjectSchema.MANDATORY);
    sendRatingSchema.add(SENDRATING_RATING, ratingSchema, 1, ObjectSchema.UNLIMITED);
    changeIterationSchema.add(CHANGEITERATION_ROUND, (TermSchema)getSchema(BasicOntology.INTEGER), ObjectSchema.MANDATORY);

    // adding name mappings

    // adding inheritance
    ratingSchema.addSuperSchema(asclMessageSchema);
    encryptedMessageSchema.addSuperSchema(asclMessageSchema);
    pkcS7MessageSchema.addSuperSchema(asclMessageSchema);
    signSchema.addSuperSchema(messageActionSchema);
    encipherSchema.addSuperSchema(messageActionSchema);
    witnessRequestSchema.addSuperSchema(witnessActionSchema);
    witnessResponseSchema.addSuperSchema(witnessActionSchema);
    requestRatingSchema.addSuperSchema(ratingActionSchema);
    sendRatingSchema.addSuperSchema(ratingActionSchema);
    changeIterationSchema.addSuperSchema(timerActionSchema);

   }catch (java.lang.Exception e) {e.printStackTrace();}
  }
  }
