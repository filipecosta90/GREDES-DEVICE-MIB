
import org.snmp4j.smi.*;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.agent.*;
import org.snmp4j.agent.mo.*;
import org.snmp4j.agent.mo.snmp.*;
import org.snmp4j.agent.mo.snmp.smi.*;
import org.snmp4j.agent.request.*;
import org.snmp4j.log.LogFactory;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.agent.mo.snmp.tc.*;

public class GredesSensorMib  implements MOGroup {

  private static final LogAdapter LOGGER = LogFactory.getLogger(GredesSensorMib.class);

  // Factory
  private MOFactory moFactory = 
    DefaultMOFactory.getInstance();

  // Constants 

  /**
   * OID of this MIB module for usage which can be 
   * used for its identification.
   */
  public static final OID oidGredesSensorMib =
    new OID(new int[] { 1,3,6,1,2,1,47,1 });

  // Identities
  // Scalars
  public static final OID oidGestaoRedesSensorTableEntrySensorIndex = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,2,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorType = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,3,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorValue = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,4,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorValueTimeStamp = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,5,0 });
  // Tables

  // Notifications

  // Enumerations

  // TextualConventions

  // Scalars
  private MOScalar<Integer32> gestaoRedesSensorTableEntrySensorIndex;
  private MOScalar<OctetString> gestaoRedesSensorTableEntrySensorType;
  private MOScalar<Integer32> gestaoRedesSensorTableEntrySensorValue;
  private MOScalar<TimeTicks> gestaoRedesSensorTableEntrySensorValueTimeStamp;

  // Tables
  public static final OID oidGestaoRedesSensorTableEntry = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1 });

  // Index OID definitions
  public static final OID oidGestaoRedesSensorTableEntrySensorIndex = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,2 });

  // Column TC definitions for gestaoRedesSensorTableEntry:

  // Column sub-identifier definitions for gestaoRedesSensorTableEntry:
  public static final int colGestaoRedesSensorTableEntrySensorIndex = 2;
  public static final int colGestaoRedesSensorTableEntrySensorType = 3;
  public static final int colGestaoRedesSensorTableEntrySensorValue = 4;
  public static final int colGestaoRedesSensorTableEntrySensorValueTimeStamp = 5;

  // Column index definitions for gestaoRedesSensorTableEntry:
  public static final int idxGestaoRedesSensorTableEntrySensorIndex = 0;
  public static final int idxGestaoRedesSensorTableEntrySensorType = 1;
  public static final int idxGestaoRedesSensorTableEntrySensorValue = 2;
  public static final int idxGestaoRedesSensorTableEntrySensorValueTimeStamp = 3;

  private MOTableSubIndex[] gestaoRedesSensorTableEntryIndexes;
  private MOTableIndex gestaoRedesSensorTableEntryIndex;

  private MOTable<GestaoRedesSensorTableEntryRow, MOColumn, MOTableModel<GestaoRedesSensorTableEntryRow>> gestaoRedesSensorTableEntry;
  private MOTableModel<GestaoRedesSensorTableEntryRow> gestaoRedesSensorTableEntryModel;

  /**
   * Constructs a GredesSensorMib instance without actually creating its
   * <code>ManagedObject</code> instances. This has to be done in a
   * sub-class constructor or after construction by calling 
   * {@link #createMO(MOFactory moFactory)}. 
   */
  protected GredesSensorMib() {
  }

  /**
   * Constructs a GredesSensorMib instance and actually creates its
   * <code>ManagedObject</code> instances using the supplied 
   * <code>MOFactory</code> (by calling
   * {@link #createMO(MOFactory moFactory)}).
   * @param moFactory
   *    the <code>MOFactory</code> to be used to create the
   *    managed objects for this module.
   */
  public GredesSensorMib(MOFactory moFactory) {
    this();
    createMO(moFactory);
  }

  /**
   * Create the ManagedObjects defined for this MIB module
   * using the specified {@link MOFactory}.
   * @param moFactory
   *    the <code>MOFactory</code> instance to use for object 
   *    creation.
   */
  protected void createMO(MOFactory moFactory) {
    addTCsToFactory(moFactory);
    gestaoRedesSensorTableEntrySensorIndex = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorIndex,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
          new Integer32());
    gestaoRedesSensorTableEntrySensorType = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorType,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
          new OctetString());
    gestaoRedesSensorTableEntrySensorValue = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorValue,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
          new Integer32());
    gestaoRedesSensorTableEntrySensorValueTimeStamp = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorValueTimeStamp,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
          new TimeTicks());
    createGestaoRedesSensorTableEntry(moFactory);
  }

  public MOScalar<Integer32> getGestaoRedesSensorTableEntrySensorIndex() {
    return gestaoRedesSensorTableEntrySensorIndex;
  }
  public MOScalar<OctetString> getGestaoRedesSensorTableEntrySensorType() {
    return gestaoRedesSensorTableEntrySensorType;
  }
  public MOScalar<Integer32> getGestaoRedesSensorTableEntrySensorValue() {
    return gestaoRedesSensorTableEntrySensorValue;
  }
  public MOScalar<TimeTicks> getGestaoRedesSensorTableEntrySensorValueTimeStamp() {
    return gestaoRedesSensorTableEntrySensorValueTimeStamp;
  }


  public MOTable<GestaoRedesSensorTableEntryRow,MOColumn,MOTableModel<GestaoRedesSensorTableEntryRow>> getGestaoRedesSensorTableEntry() {
    return gestaoRedesSensorTableEntry;
  }


  @SuppressWarnings(value={"unchecked"})
    private void createGestaoRedesSensorTableEntry(MOFactory moFactory) {
      // Index definition
      gestaoRedesSensorTableEntryIndexes = 
        new MOTableSubIndex[] {
          moFactory.createSubIndex(oidGestaoRedesSensorTableEntrySensorIndex, 
              SMIConstants.SYNTAX_INTEGER, 1, 1)    };

      gestaoRedesSensorTableEntryIndex = 
        moFactory.createIndex(gestaoRedesSensorTableEntryIndexes,
            false,
            new MOTableIndexValidator() {
              public boolean isValidIndex(OID index) {
                boolean isValidIndex = true;
                //--AgentGen BEGIN=gestaoRedesSensorTableEntry::isValidIndex
                //--AgentGen END
                return isValidIndex;
              }
            });

      // Columns
      MOColumn[] gestaoRedesSensorTableEntryColumns = new MOColumn[4];
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorIndex] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorIndex, 
            SMIConstants.SYNTAX_INTEGER,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorType] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorType, 
            SMIConstants.SYNTAX_OCTET_STRING,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorValue] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorValue, 
            SMIConstants.SYNTAX_INTEGER,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorValueTimeStamp] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorValueTimeStamp, 
            SMIConstants.SYNTAX_TIMETICKS,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
      // Table model
      gestaoRedesSensorTableEntryModel = 
        moFactory.createTableModel(oidGestaoRedesSensorTableEntry,
            gestaoRedesSensorTableEntryIndex,
            gestaoRedesSensorTableEntryColumns);
      ((MOMutableTableModel<GestaoRedesSensorTableEntryRow>)gestaoRedesSensorTableEntryModel).setRowFactory(
        new GestaoRedesSensorTableEntryRowFactory());
      gestaoRedesSensorTableEntry = 
        moFactory.createTable(oidGestaoRedesSensorTableEntry,
            gestaoRedesSensorTableEntryIndex,
            gestaoRedesSensorTableEntryColumns,
            gestaoRedesSensorTableEntryModel);
    }

  public void registerMOs(MOServer server, OctetString context) 
    throws DuplicateRegistrationException 
  {
    // Scalar Objects
    server.register(this.gestaoRedesSensorTableEntrySensorIndex, context);
    server.register(this.gestaoRedesSensorTableEntrySensorType, context);
    server.register(this.gestaoRedesSensorTableEntrySensorValue, context);
    server.register(this.gestaoRedesSensorTableEntrySensorValueTimeStamp, context);
    server.register(this.gestaoRedesSensorTableEntry, context);
    //--AgentGen BEGIN=_registerMOs
    //--AgentGen END
  }

  public void unregisterMOs(MOServer server, OctetString context) {
    // Scalar Objects
    server.unregister(this.gestaoRedesSensorTableEntrySensorIndex, context);
    server.unregister(this.gestaoRedesSensorTableEntrySensorType, context);
    server.unregister(this.gestaoRedesSensorTableEntrySensorValue, context);
    server.unregister(this.gestaoRedesSensorTableEntrySensorValueTimeStamp, context);
    server.unregister(this.gestaoRedesSensorTableEntry, context);
    //--AgentGen BEGIN=_unregisterMOs
    //--AgentGen END
  }

  // Notifications

  // Scalars

  // Value Validators


  // Rows and Factories

  public class GestaoRedesSensorTableEntryRow extends DefaultMOMutableRow2PC {


    public GestaoRedesSensorTableEntryRow(OID index, Variable[] values) {
      super(index, values);
    }

    public Integer32 getGestaoRedesSensorTableEntrySensorIndex() {
      return (Integer32) super.getValue(idxGestaoRedesSensorTableEntrySensorIndex);
    }  

    public void setGestaoRedesSensorTableEntrySensorIndex(Integer32 newValue) {
      super.setValue(idxGestaoRedesSensorTableEntrySensorIndex, newValue);
    }

    public OctetString getGestaoRedesSensorTableEntrySensorType() {
      return (OctetString) super.getValue(idxGestaoRedesSensorTableEntrySensorType);
    }  

    public void setGestaoRedesSensorTableEntrySensorType(OctetString newValue) {
      super.setValue(idxGestaoRedesSensorTableEntrySensorType, newValue);
    }

    public Integer32 getGestaoRedesSensorTableEntrySensorValue() {
      return (Integer32) super.getValue(idxGestaoRedesSensorTableEntrySensorValue);
    }  

    public void setGestaoRedesSensorTableEntrySensorValue(Integer32 newValue) {
      super.setValue(idxGestaoRedesSensorTableEntrySensorValue, newValue);
    }

    public TimeTicks getGestaoRedesSensorTableEntrySensorValueTimeStamp() {
      return (TimeTicks) super.getValue(idxGestaoRedesSensorTableEntrySensorValueTimeStamp);
    }  

    public void setGestaoRedesSensorTableEntrySensorValueTimeStamp(TimeTicks newValue) {
      super.setValue(idxGestaoRedesSensorTableEntrySensorValueTimeStamp, newValue);
    }

    public Variable getValue(int column) {

      switch(column) {
        case idxGestaoRedesSensorTableEntrySensorIndex: 
          return getGestaoRedesSensorTableEntrySensorIndex();
        case idxGestaoRedesSensorTableEntrySensorType: 
          return getGestaoRedesSensorTableEntrySensorType();
        case idxGestaoRedesSensorTableEntrySensorValue: 
          return getGestaoRedesSensorTableEntrySensorValue();
        case idxGestaoRedesSensorTableEntrySensorValueTimeStamp: 
          return getGestaoRedesSensorTableEntrySensorValueTimeStamp();
        default:
          return super.getValue(column);
      }
    }

    public void setValue(int column, Variable value) {
      switch(column) {
        case idxGestaoRedesSensorTableEntrySensorIndex: 
          setGestaoRedesSensorTableEntrySensorIndex((Integer32)value);
          break;
        case idxGestaoRedesSensorTableEntrySensorType: 
          setGestaoRedesSensorTableEntrySensorType((OctetString)value);
          break;
        case idxGestaoRedesSensorTableEntrySensorValue: 
          setGestaoRedesSensorTableEntrySensorValue((Integer32)value);
          break;
        case idxGestaoRedesSensorTableEntrySensorValueTimeStamp: 
          setGestaoRedesSensorTableEntrySensorValueTimeStamp((TimeTicks)value);
          break;
        default:
          super.setValue(column, value);
      }
    }
  }

  class GestaoRedesSensorTableEntryRowFactory 
      implements MOTableRowFactory<GestaoRedesSensorTableEntryRow>
    {
      public synchronized GestaoRedesSensorTableEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
      {
        GestaoRedesSensorTableEntryRow row = 
          new GestaoRedesSensorTableEntryRow(index, values);
        return row;
      }

      public synchronized void freeRow(GestaoRedesSensorTableEntryRow row) {

      }


    }

  // Textual Definitions of MIB module GredesSensorMib
  protected void addTCsToFactory(MOFactory moFactory) {
  }

  // Textual Definitions of other MIB modules
  public void addImportedTCsToFactory(MOFactory moFactory) {
  }

}


