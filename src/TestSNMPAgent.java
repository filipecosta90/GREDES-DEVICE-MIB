
import java.io.IOException;

import org.snmp4j.agent.BaseAgent;
import org.snmp4j.agent.DuplicateRegistrationException;
import org.snmp4j.agent.mo.DefaultMOFactory;
import org.snmp4j.smi.OID;

public class TestSNMPAgent {
  static final OID sysDescr = new OID(".1.3.6.1.2.1.1.1.0");
  GredesSensorMib sensores = new GredesSensorMib(DefaultMOFactory.getInstance());
  SNMPAgent agent = null;
  /**
   * This is the client which we have created earlier
   */
  SNMPManager client = null;
  String address = null;

  /**
   * Constructor
   *
   * @param add
   */
  public TestSNMPAgent(String add) {
    address = add;
  }


  private void init()  {
    /*
       Thread t1 = new Thread(new Runnable() {
       public void run()
       {
       try {
       agent =  new SNMPAgent("0.0.0.0/2001");
       agent.initialize();
       sensores.registerMOs(agent.getServer(), agent.getDefaultContext());
       sensores.add_sensor("temperatura",0);
       sensores.add_sensor("temp",0);
       agent.start();
       } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    } catch (DuplicateRegistrationException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
    }
    }});  

    t1.start();
    */
    Thread t2 = new Thread(new Runnable() {
      public void run()
    {
      client = new SNMPManager("udp:127.0.0.1/2001");
      client.start();
      // Get back Value which is set
      // System.out.println(client.getAsString(sysDescr));
      // System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1 })));
      try {
        System.out.println("table" + client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,2,0 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,3,0 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,4,0 })));
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }

    }});  
    t2.start();

    Thread t3 = new Thread(new Runnable() {
      public void run()
    {
      client = new SNMPManager("udp:127.0.0.1/2001");
      client.start();
      // Get back Value which is set
      // System.out.println(client.getAsString(sysDescr));
      // System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1 })));
      try {
        System.out.println("table" + client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,2,0 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,3,0 })));
        System.out.println(client.getAsString(new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,4,0 })));
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }});  
    t3.start();
  }

  /* public static void main(String[] args) throws IOException {
     TestSNMPAgent client = new TestSNMPAgent("udp:127.0.0.1/2001");
     client.init();
     }*/


}
