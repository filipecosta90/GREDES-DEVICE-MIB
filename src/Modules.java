
import org.snmp4j.agent.mo.*;
import org.snmp4j.log.LogFactory;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.agent.MOGroup;
import org.snmp4j.agent.MOServer;
import org.snmp4j.agent.DuplicateRegistrationException;
import org.snmp4j.smi.OctetString;


public class Modules implements MOGroup {

  private static final LogAdapter LOGGER = LogFactory.getLogger(Modules.class);

  private EntityMib entityMib;
  private GredesSensorMib gredesSensorMib;

  private MOFactory factory;

  public Modules() {
    entityMib = new EntityMib(); 
    gredesSensorMib = new GredesSensorMib();
  }

  public Modules(MOFactory factory) {
    entityMib = new EntityMib(factory); 
    gredesSensorMib = new GredesSensorMib(factory);
  } 

  public void registerMOs(MOServer server, OctetString context) throws DuplicateRegistrationException {
    entityMib.registerMOs(server, context);
    gredesSensorMib.registerMOs(server, context);
  }

  public void unregisterMOs(MOServer server, OctetString context) {
    entityMib.unregisterMOs(server, context);
    gredesSensorMib.unregisterMOs(server, context);
  }

  public EntityMib getEntityMib() {
    return entityMib;
  }

  public GredesSensorMib getGredesSensorMib() {
    return gredesSensorMib;
  }

}

