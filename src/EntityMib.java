 

//--AgentGen BEGIN=_BEGIN
//--AgentGen END

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


//--AgentGen BEGIN=_IMPORT
//--AgentGen END

public class EntityMib 
//--AgentGen BEGIN=_EXTENDS
//--AgentGen END
implements MOGroup 
//--AgentGen BEGIN=_IMPLEMENTS
//--AgentGen END
{

  private static final LogAdapter LOGGER = 
      LogFactory.getLogger(EntityMib.class);

//--AgentGen BEGIN=_STATIC
//--AgentGen END

  // Factory
  private MOFactory moFactory = 
    DefaultMOFactory.getInstance();

  // Constants 

  /**
   * OID of this MIB module for usage which can be 
   * used for its identification.
   */
  public static final OID oidEntityMib =
    new OID(new int[] { 1,3,6,1,2,1,47 });

  // Identities
  // Scalars
  public static final OID oidEntLastChangeTime = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,4,1,0 });
  // Tables

  // Notifications
  public static final OID oidEntConfigChange =
    new OID(new int[] { 1,3,6,1,2,1,47,2,0,1 });   


  // Enumerations




  // TextualConventions
  private static final String TC_MODULE_UUID_TC_MIB = "UUID-TC-MIB";
  private static final String TC_MODULE_IANA_ENTITY_MIB = "IANA-ENTITY-MIB";
  private static final String TC_MODULE_SNMPV2_TC = "SNMPv2-TC";
  private static final String TC_MODULE_ENTITY_MIB = "ENTITY-MIB";
  private static final String TC_MODULE_SNMP_FRAMEWORK_MIB = "SNMP-FRAMEWORK-MIB";
  private static final String TC_PHYSICALINDEX = "PhysicalIndex";
  private static final String TC_AUTONOMOUSTYPE = "AutonomousType";
  private static final String TC_DATEANDTIME = "DateAndTime";
  private static final String TC_TIMESTAMP = "TimeStamp";
  private static final String TC_TADDRESS = "TAddress";
  private static final String TC_UUIDORZERO = "UUIDorZero";
  private static final String TC_ROWPOINTER = "RowPointer";
  private static final String TC_PHYSICALINDEXORZERO = "PhysicalIndexOrZero";
  private static final String TC_TRUTHVALUE = "TruthValue";
  private static final String TC_SNMPADMINSTRING = "SnmpAdminString";
  private static final String TC_SNMPENGINEIDORNONE = "SnmpEngineIdOrNone";
  private static final String TC_TDOMAIN = "TDomain";
  private static final String TC_IANAPHYSICALCLASS = "IANAPhysicalClass";

  // Scalars
  private MOScalar<TimeTicks> entLastChangeTime;

  // Tables
  public static final OID oidEntPhysicalEntry = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1 });

  // Index OID definitions
  public static final OID oidEntPhysicalIndex =
    new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,1 });

  // Column TC definitions for entPhysicalEntry:
  public static final String tcModuleSnmpFrameworkMib = "SNMP-FRAMEWORK-MIB";
  public static final String tcDefSnmpAdminString = "SnmpAdminString";
  public static final String tcModuleSNMPv2Tc = "SNMPv2-TC";
  public static final String tcDefAutonomousType = "AutonomousType";
  public static final String tcModuleEntityMib = "ENTITY-MIB";
  public static final String tcDefPhysicalIndexOrZero = "PhysicalIndexOrZero";
  public static final String tcModuleIanaEntityMib = "IANA-ENTITY-MIB";
  public static final String tcDefIANAPhysicalClass = "IANAPhysicalClass";
  public static final String tcDefTruthValue = "TruthValue";
  public static final String tcDefDateAndTime = "DateAndTime";
  public static final String tcModuleUuidTcMib = "UUID-TC-MIB";
  public static final String tcDefUUIDorZero = "UUIDorZero";
    
  // Column sub-identifier definitions for entPhysicalEntry:
  public static final int colEntPhysicalDescr = 2;
  public static final int colEntPhysicalVendorType = 3;
  public static final int colEntPhysicalContainedIn = 4;
  public static final int colEntPhysicalClass = 5;
  public static final int colEntPhysicalParentRelPos = 6;
  public static final int colEntPhysicalName = 7;
  public static final int colEntPhysicalHardwareRev = 8;
  public static final int colEntPhysicalFirmwareRev = 9;
  public static final int colEntPhysicalSoftwareRev = 10;
  public static final int colEntPhysicalSerialNum = 11;
  public static final int colEntPhysicalMfgName = 12;
  public static final int colEntPhysicalModelName = 13;
  public static final int colEntPhysicalAlias = 14;
  public static final int colEntPhysicalAssetID = 15;
  public static final int colEntPhysicalIsFRU = 16;
  public static final int colEntPhysicalMfgDate = 17;
  public static final int colEntPhysicalUris = 18;
  public static final int colEntPhysicalUUID = 19;

  // Column index definitions for entPhysicalEntry:
  public static final int idxEntPhysicalDescr = 0;
  public static final int idxEntPhysicalVendorType = 1;
  public static final int idxEntPhysicalContainedIn = 2;
  public static final int idxEntPhysicalClass = 3;
  public static final int idxEntPhysicalParentRelPos = 4;
  public static final int idxEntPhysicalName = 5;
  public static final int idxEntPhysicalHardwareRev = 6;
  public static final int idxEntPhysicalFirmwareRev = 7;
  public static final int idxEntPhysicalSoftwareRev = 8;
  public static final int idxEntPhysicalSerialNum = 9;
  public static final int idxEntPhysicalMfgName = 10;
  public static final int idxEntPhysicalModelName = 11;
  public static final int idxEntPhysicalAlias = 12;
  public static final int idxEntPhysicalAssetID = 13;
  public static final int idxEntPhysicalIsFRU = 14;
  public static final int idxEntPhysicalMfgDate = 15;
  public static final int idxEntPhysicalUris = 16;
  public static final int idxEntPhysicalUUID = 17;

  private MOTableSubIndex[] entPhysicalEntryIndexes;
  private MOTableIndex entPhysicalEntryIndex;
  
  private MOTable<EntPhysicalEntryRow,
                  MOColumn,
                  MOTableModel<EntPhysicalEntryRow>> entPhysicalEntry;
  private MOTableModel<EntPhysicalEntryRow> entPhysicalEntryModel;
  public static final OID oidEntLogicalEntry = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,2,1,1 });

  // Index OID definitions
  public static final OID oidEntLogicalIndex =
    new OID(new int[] { 1,3,6,1,2,1,47,1,2,1,1,1 });

  // Column TC definitions for entLogicalEntry:
  public static final String tcDefTAddress = "TAddress";
  public static final String tcDefTDomain = "TDomain";
  public static final String tcDefSnmpEngineIdOrNone = "SnmpEngineIdOrNone";
    
  // Column sub-identifier definitions for entLogicalEntry:
  public static final int colEntLogicalDescr = 2;
  public static final int colEntLogicalType = 3;
  public static final int colEntLogicalCommunity = 4;
  public static final int colEntLogicalTAddress = 5;
  public static final int colEntLogicalTDomain = 6;
  public static final int colEntLogicalContextEngineID = 7;
  public static final int colEntLogicalContextName = 8;

  // Column index definitions for entLogicalEntry:
  public static final int idxEntLogicalDescr = 0;
  public static final int idxEntLogicalType = 1;
  public static final int idxEntLogicalCommunity = 2;
  public static final int idxEntLogicalTAddress = 3;
  public static final int idxEntLogicalTDomain = 4;
  public static final int idxEntLogicalContextEngineID = 5;
  public static final int idxEntLogicalContextName = 6;

  private MOTableSubIndex[] entLogicalEntryIndexes;
  private MOTableIndex entLogicalEntryIndex;
  
  private MOTable<EntLogicalEntryRow,
                  MOColumn,
                  MOTableModel<EntLogicalEntryRow>> entLogicalEntry;
  private MOTableModel<EntLogicalEntryRow> entLogicalEntryModel;
  public static final OID oidEntLPMappingEntry = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,1,1 });

  // Index OID definitions
  //public static final OID oidEntLogicalIndex =
  //  new OID(new int[] { 1,3,6,1,2,1,47,1,2,1,1,1 });
  public static final OID oidEntLPPhysicalIndex =
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,1,1,1 });

  // Column TC definitions for entLPMappingEntry:
  public static final String tcDefPhysicalIndex = "PhysicalIndex";
    
  // Column sub-identifier definitions for entLPMappingEntry:
  public static final int colEntLPPhysicalIndex = 1;

  // Column index definitions for entLPMappingEntry:
  public static final int idxEntLPPhysicalIndex = 0;

  private MOTableSubIndex[] entLPMappingEntryIndexes;
  private MOTableIndex entLPMappingEntryIndex;
  
  private MOTable<EntLPMappingEntryRow,
                  MOColumn,
                  MOTableModel<EntLPMappingEntryRow>> entLPMappingEntry;
  private MOTableModel<EntLPMappingEntryRow> entLPMappingEntryModel;
  public static final OID oidEntAliasMappingEntry = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,2,1 });

  // Index OID definitions
  //public static final OID oidEntPhysicalIndex =
  //  new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,1 });
  public static final OID oidEntAliasLogicalIndexOrZero =
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,2,1,1 });

  // Column TC definitions for entAliasMappingEntry:
  public static final String tcDefRowPointer = "RowPointer";
    
  // Column sub-identifier definitions for entAliasMappingEntry:
  public static final int colEntAliasMappingIdentifier = 2;

  // Column index definitions for entAliasMappingEntry:
  public static final int idxEntAliasMappingIdentifier = 0;

  private MOTableSubIndex[] entAliasMappingEntryIndexes;
  private MOTableIndex entAliasMappingEntryIndex;
  
  private MOTable<EntAliasMappingEntryRow,
                  MOColumn,
                  MOTableModel<EntAliasMappingEntryRow>> entAliasMappingEntry;
  private MOTableModel<EntAliasMappingEntryRow> entAliasMappingEntryModel;
  public static final OID oidEntPhysicalContainsEntry = 
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,3,1 });

  // Index OID definitions
  //public static final OID oidEntPhysicalIndex =
  //  new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,1 });
  public static final OID oidEntPhysicalChildIndex =
    new OID(new int[] { 1,3,6,1,2,1,47,1,3,3,1,1 });

  // Column TC definitions for entPhysicalContainsEntry:
    
  // Column sub-identifier definitions for entPhysicalContainsEntry:
  public static final int colEntPhysicalChildIndex = 1;

  // Column index definitions for entPhysicalContainsEntry:
  public static final int idxEntPhysicalChildIndex = 0;

  private MOTableSubIndex[] entPhysicalContainsEntryIndexes;
  private MOTableIndex entPhysicalContainsEntryIndex;
  
  private MOTable<EntPhysicalContainsEntryRow,
                  MOColumn,
                  MOTableModel<EntPhysicalContainsEntryRow>> entPhysicalContainsEntry;
  private MOTableModel<EntPhysicalContainsEntryRow> entPhysicalContainsEntryModel;


//--AgentGen BEGIN=_MEMBERS
//--AgentGen END

  /**
   * Constructs a EntityMib instance without actually creating its
   * <code>ManagedObject</code> instances. This has to be done in a
   * sub-class constructor or after construction by calling 
   * {@link #createMO(MOFactory moFactory)}. 
   */
  protected EntityMib() {
//--AgentGen BEGIN=_DEFAULTCONSTRUCTOR
//--AgentGen END
  }

  /**
   * Constructs a EntityMib instance and actually creates its
   * <code>ManagedObject</code> instances using the supplied 
   * <code>MOFactory</code> (by calling
   * {@link #createMO(MOFactory moFactory)}).
   * @param moFactory
   *    the <code>MOFactory</code> to be used to create the
   *    managed objects for this module.
   */
  public EntityMib(MOFactory moFactory) {
  	this();
    createMO(moFactory);
//--AgentGen BEGIN=_FACTORYCONSTRUCTOR
//--AgentGen END
  }

//--AgentGen BEGIN=_CONSTRUCTORS
//--AgentGen END

  /**
   * Create the ManagedObjects defined for this MIB module
   * using the specified {@link MOFactory}.
   * @param moFactory
   *    the <code>MOFactory</code> instance to use for object 
   *    creation.
   */
  protected void createMO(MOFactory moFactory) {
    addTCsToFactory(moFactory);
    entLastChangeTime = 
      moFactory.createScalar(oidEntLastChangeTime,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY), 
                             null,
                             TC_MODULE_SNMPV2_TC, TC_TIMESTAMP);
    createEntPhysicalEntry(moFactory);
    createEntLogicalEntry(moFactory);
    createEntLPMappingEntry(moFactory);
    createEntAliasMappingEntry(moFactory);
    createEntPhysicalContainsEntry(moFactory);
  }

  public MOScalar<TimeTicks> getEntLastChangeTime() {
    return entLastChangeTime;
  }


  public MOTable<EntPhysicalEntryRow,MOColumn,MOTableModel<EntPhysicalEntryRow>> getEntPhysicalEntry() {
    return entPhysicalEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createEntPhysicalEntry(MOFactory moFactory) {
    // Index definition
    entPhysicalEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidEntPhysicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)    };

    entPhysicalEntryIndex = 
      moFactory.createIndex(entPhysicalEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
     //--AgentGen BEGIN=entPhysicalEntry::isValidIndex
     //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] entPhysicalEntryColumns = new MOColumn[18];
    entPhysicalEntryColumns[idxEntPhysicalDescr] = 
      moFactory.createColumn(colEntPhysicalDescr, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalVendorType] = 
      moFactory.createColumn(colEntPhysicalVendorType, 
                             SMIConstants.SYNTAX_OBJECT_IDENTIFIER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefAutonomousType);
    entPhysicalEntryColumns[idxEntPhysicalContainedIn] = 
      moFactory.createColumn(colEntPhysicalContainedIn, 
                             SMIConstants.SYNTAX_INTEGER32,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleEntityMib,
                             tcDefPhysicalIndexOrZero);
    entPhysicalEntryColumns[idxEntPhysicalClass] = 
      moFactory.createColumn(colEntPhysicalClass, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleIanaEntityMib,
                             tcDefIANAPhysicalClass);
    entPhysicalEntryColumns[idxEntPhysicalParentRelPos] = 
      moFactory.createColumn(colEntPhysicalParentRelPos, 
                             SMIConstants.SYNTAX_INTEGER32,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    entPhysicalEntryColumns[idxEntPhysicalName] = 
      moFactory.createColumn(colEntPhysicalName, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalHardwareRev] = 
      moFactory.createColumn(colEntPhysicalHardwareRev, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalFirmwareRev] = 
      moFactory.createColumn(colEntPhysicalFirmwareRev, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalSoftwareRev] = 
      moFactory.createColumn(colEntPhysicalSoftwareRev, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalSerialNum] = 
      new MOMutableColumn<OctetString>(colEntPhysicalSerialNum,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null);
    ValueConstraint entPhysicalSerialNumVC = new ConstraintsImpl();
    ((ConstraintsImpl)entPhysicalSerialNumVC).add(new Constraint(0L, 32L));
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalSerialNum]).
      addMOValueValidationListener(new ValueConstraintValidator(entPhysicalSerialNumVC));                                  
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalSerialNum]).
      addMOValueValidationListener(new EntPhysicalSerialNumValidator());
    entPhysicalEntryColumns[idxEntPhysicalMfgName] = 
      moFactory.createColumn(colEntPhysicalMfgName, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalModelName] = 
      moFactory.createColumn(colEntPhysicalModelName, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entPhysicalEntryColumns[idxEntPhysicalAlias] = 
      new MOMutableColumn<OctetString>(colEntPhysicalAlias,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null);
    ValueConstraint entPhysicalAliasVC = new ConstraintsImpl();
    ((ConstraintsImpl)entPhysicalAliasVC).add(new Constraint(0L, 32L));
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalAlias]).
      addMOValueValidationListener(new ValueConstraintValidator(entPhysicalAliasVC));                                  
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalAlias]).
      addMOValueValidationListener(new EntPhysicalAliasValidator());
    entPhysicalEntryColumns[idxEntPhysicalAssetID] = 
      new MOMutableColumn<OctetString>(colEntPhysicalAssetID,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null);
    ValueConstraint entPhysicalAssetIDVC = new ConstraintsImpl();
    ((ConstraintsImpl)entPhysicalAssetIDVC).add(new Constraint(0L, 32L));
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalAssetID]).
      addMOValueValidationListener(new ValueConstraintValidator(entPhysicalAssetIDVC));                                  
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalAssetID]).
      addMOValueValidationListener(new EntPhysicalAssetIDValidator());
    entPhysicalEntryColumns[idxEntPhysicalIsFRU] = 
      moFactory.createColumn(colEntPhysicalIsFRU, 
                             SMIConstants.SYNTAX_INTEGER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefTruthValue);
    entPhysicalEntryColumns[idxEntPhysicalMfgDate] = 
      moFactory.createColumn(colEntPhysicalMfgDate, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefDateAndTime);
    entPhysicalEntryColumns[idxEntPhysicalUris] = 
      new MOMutableColumn<OctetString>(colEntPhysicalUris,
                          SMIConstants.SYNTAX_OCTET_STRING,
                          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE),
                          (OctetString)null);
    ((MOMutableColumn)entPhysicalEntryColumns[idxEntPhysicalUris]).
      addMOValueValidationListener(new EntPhysicalUrisValidator());
    entPhysicalEntryColumns[idxEntPhysicalUUID] = 
      moFactory.createColumn(colEntPhysicalUUID, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleUuidTcMib,
                             tcDefUUIDorZero);
    // Table model
    entPhysicalEntryModel = 
      moFactory.createTableModel(oidEntPhysicalEntry,
                                 entPhysicalEntryIndex,
                                 entPhysicalEntryColumns);
    ((MOMutableTableModel<EntPhysicalEntryRow>)entPhysicalEntryModel).setRowFactory(
      new EntPhysicalEntryRowFactory());
    entPhysicalEntry = 
      moFactory.createTable(oidEntPhysicalEntry,
                            entPhysicalEntryIndex,
                            entPhysicalEntryColumns,
                            entPhysicalEntryModel);
  }

  public MOTable<EntLogicalEntryRow,MOColumn,MOTableModel<EntLogicalEntryRow>> getEntLogicalEntry() {
    return entLogicalEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createEntLogicalEntry(MOFactory moFactory) {
    // Index definition
    entLogicalEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidEntLogicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)    };

    entLogicalEntryIndex = 
      moFactory.createIndex(entLogicalEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
     //--AgentGen BEGIN=entLogicalEntry::isValidIndex
     //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] entLogicalEntryColumns = new MOColumn[7];
    entLogicalEntryColumns[idxEntLogicalDescr] = 
      moFactory.createColumn(colEntLogicalDescr, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    entLogicalEntryColumns[idxEntLogicalType] = 
      moFactory.createColumn(colEntLogicalType, 
                             SMIConstants.SYNTAX_OBJECT_IDENTIFIER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefAutonomousType);
    entLogicalEntryColumns[idxEntLogicalCommunity] = 
      moFactory.createColumn(colEntLogicalCommunity, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY));
    entLogicalEntryColumns[idxEntLogicalTAddress] = 
      moFactory.createColumn(colEntLogicalTAddress, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefTAddress);
    entLogicalEntryColumns[idxEntLogicalTDomain] = 
      moFactory.createColumn(colEntLogicalTDomain, 
                             SMIConstants.SYNTAX_OBJECT_IDENTIFIER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefTDomain);
    entLogicalEntryColumns[idxEntLogicalContextEngineID] = 
      moFactory.createColumn(colEntLogicalContextEngineID, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleEntityMib,
                             tcDefSnmpEngineIdOrNone);
    entLogicalEntryColumns[idxEntLogicalContextName] = 
      moFactory.createColumn(colEntLogicalContextName, 
                             SMIConstants.SYNTAX_OCTET_STRING,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSnmpFrameworkMib,
                             tcDefSnmpAdminString);
    // Table model
    entLogicalEntryModel = 
      moFactory.createTableModel(oidEntLogicalEntry,
                                 entLogicalEntryIndex,
                                 entLogicalEntryColumns);
    ((MOMutableTableModel<EntLogicalEntryRow>)entLogicalEntryModel).setRowFactory(
      new EntLogicalEntryRowFactory());
    entLogicalEntry = 
      moFactory.createTable(oidEntLogicalEntry,
                            entLogicalEntryIndex,
                            entLogicalEntryColumns,
                            entLogicalEntryModel);
  }

  public MOTable<EntLPMappingEntryRow,MOColumn,MOTableModel<EntLPMappingEntryRow>> getEntLPMappingEntry() {
    return entLPMappingEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createEntLPMappingEntry(MOFactory moFactory) {
    // Index definition
    entLPMappingEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidEntLogicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidEntLPPhysicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)    };

    entLPMappingEntryIndex = 
      moFactory.createIndex(entLPMappingEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
     //--AgentGen BEGIN=entLPMappingEntry::isValidIndex
     //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] entLPMappingEntryColumns = new MOColumn[1];
    entLPMappingEntryColumns[idxEntLPPhysicalIndex] = 
      moFactory.createColumn(colEntLPPhysicalIndex, 
                             SMIConstants.SYNTAX_INTEGER32,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleEntityMib,
                             tcDefPhysicalIndex);
    // Table model
    entLPMappingEntryModel = 
      moFactory.createTableModel(oidEntLPMappingEntry,
                                 entLPMappingEntryIndex,
                                 entLPMappingEntryColumns);
    ((MOMutableTableModel<EntLPMappingEntryRow>)entLPMappingEntryModel).setRowFactory(
      new EntLPMappingEntryRowFactory());
    entLPMappingEntry = 
      moFactory.createTable(oidEntLPMappingEntry,
                            entLPMappingEntryIndex,
                            entLPMappingEntryColumns,
                            entLPMappingEntryModel);
  }

  public MOTable<EntAliasMappingEntryRow,MOColumn,MOTableModel<EntAliasMappingEntryRow>> getEntAliasMappingEntry() {
    return entAliasMappingEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createEntAliasMappingEntry(MOFactory moFactory) {
    // Index definition
    entAliasMappingEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidEntPhysicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidEntAliasLogicalIndexOrZero, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)    };

    entAliasMappingEntryIndex = 
      moFactory.createIndex(entAliasMappingEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
     //--AgentGen BEGIN=entAliasMappingEntry::isValidIndex
     //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] entAliasMappingEntryColumns = new MOColumn[1];
    entAliasMappingEntryColumns[idxEntAliasMappingIdentifier] = 
      moFactory.createColumn(colEntAliasMappingIdentifier, 
                             SMIConstants.SYNTAX_OBJECT_IDENTIFIER,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleSNMPv2Tc,
                             tcDefRowPointer);
    // Table model
    entAliasMappingEntryModel = 
      moFactory.createTableModel(oidEntAliasMappingEntry,
                                 entAliasMappingEntryIndex,
                                 entAliasMappingEntryColumns);
    ((MOMutableTableModel<EntAliasMappingEntryRow>)entAliasMappingEntryModel).setRowFactory(
      new EntAliasMappingEntryRowFactory());
    entAliasMappingEntry = 
      moFactory.createTable(oidEntAliasMappingEntry,
                            entAliasMappingEntryIndex,
                            entAliasMappingEntryColumns,
                            entAliasMappingEntryModel);
  }

  public MOTable<EntPhysicalContainsEntryRow,MOColumn,MOTableModel<EntPhysicalContainsEntryRow>> getEntPhysicalContainsEntry() {
    return entPhysicalContainsEntry;
  }


  @SuppressWarnings(value={"unchecked"})
  private void createEntPhysicalContainsEntry(MOFactory moFactory) {
    // Index definition
    entPhysicalContainsEntryIndexes = 
      new MOTableSubIndex[] {
      moFactory.createSubIndex(oidEntPhysicalIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1),
      moFactory.createSubIndex(oidEntPhysicalChildIndex, 
                               SMIConstants.SYNTAX_INTEGER, 1, 1)    };

    entPhysicalContainsEntryIndex = 
      moFactory.createIndex(entPhysicalContainsEntryIndexes,
                            false,
                            new MOTableIndexValidator() {
      public boolean isValidIndex(OID index) {
        boolean isValidIndex = true;
     //--AgentGen BEGIN=entPhysicalContainsEntry::isValidIndex
     //--AgentGen END
        return isValidIndex;
      }
    });

    // Columns
    MOColumn[] entPhysicalContainsEntryColumns = new MOColumn[1];
    entPhysicalContainsEntryColumns[idxEntPhysicalChildIndex] = 
      moFactory.createColumn(colEntPhysicalChildIndex, 
                             SMIConstants.SYNTAX_INTEGER32,
                             moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_ONLY),
                             tcModuleEntityMib,
                             tcDefPhysicalIndex);
    // Table model
    entPhysicalContainsEntryModel = 
      moFactory.createTableModel(oidEntPhysicalContainsEntry,
                                 entPhysicalContainsEntryIndex,
                                 entPhysicalContainsEntryColumns);
    ((MOMutableTableModel<EntPhysicalContainsEntryRow>)entPhysicalContainsEntryModel).setRowFactory(
      new EntPhysicalContainsEntryRowFactory());
    entPhysicalContainsEntry = 
      moFactory.createTable(oidEntPhysicalContainsEntry,
                            entPhysicalContainsEntryIndex,
                            entPhysicalContainsEntryColumns,
                            entPhysicalContainsEntryModel);
  }



  public void registerMOs(MOServer server, OctetString context) 
    throws DuplicateRegistrationException 
  {
    // Scalar Objects
    server.register(this.entLastChangeTime, context);
    server.register(this.entPhysicalEntry, context);
    server.register(this.entLogicalEntry, context);
    server.register(this.entLPMappingEntry, context);
    server.register(this.entAliasMappingEntry, context);
    server.register(this.entPhysicalContainsEntry, context);
//--AgentGen BEGIN=_registerMOs
//--AgentGen END
  }

  public void unregisterMOs(MOServer server, OctetString context) {
    // Scalar Objects
    server.unregister(this.entLastChangeTime, context);
    server.unregister(this.entPhysicalEntry, context);
    server.unregister(this.entLogicalEntry, context);
    server.unregister(this.entLPMappingEntry, context);
    server.unregister(this.entAliasMappingEntry, context);
    server.unregister(this.entPhysicalContainsEntry, context);
//--AgentGen BEGIN=_unregisterMOs
//--AgentGen END
  }

  // Notifications
  public void entConfigChange(NotificationOriginator notificationOriginator,
                              OctetString context, VariableBinding[] vbs) {
    notificationOriginator.notify(context, oidEntConfigChange, vbs);
  }


  // Scalars

  // Value Validators

  /**
   * The <code>EntPhysicalSerialNumValidator</code> implements the value
   * validation for <code>EntPhysicalSerialNum</code>.
   */
  static class EntPhysicalSerialNumValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 32)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
     //--AgentGen BEGIN=entPhysicalSerialNum::validate
     //--AgentGen END
    }
  }
  /**
   * The <code>EntPhysicalAliasValidator</code> implements the value
   * validation for <code>EntPhysicalAlias</code>.
   */
  static class EntPhysicalAliasValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 32)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
     //--AgentGen BEGIN=entPhysicalAlias::validate
     //--AgentGen END
    }
  }
  /**
   * The <code>EntPhysicalAssetIDValidator</code> implements the value
   * validation for <code>EntPhysicalAssetID</code>.
   */
  static class EntPhysicalAssetIDValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
      OctetString os = (OctetString)newValue;
      if (!(((os.length() >= 0) && (os.length() <= 32)))) {
        validationEvent.setValidationStatus(SnmpConstants.SNMP_ERROR_WRONG_LENGTH);
        return;
      }
     //--AgentGen BEGIN=entPhysicalAssetID::validate
     //--AgentGen END
    }
  }
  /**
   * The <code>EntPhysicalUrisValidator</code> implements the value
   * validation for <code>EntPhysicalUris</code>.
   */
  static class EntPhysicalUrisValidator implements MOValueValidationListener {
    
    public void validate(MOValueValidationEvent validationEvent) {
      Variable newValue = validationEvent.getNewValue();
     //--AgentGen BEGIN=entPhysicalUris::validate
     //--AgentGen END
    }
  }

  // Rows and Factories

  public class EntPhysicalEntryRow extends DefaultMOMutableRow2PC {

     //--AgentGen BEGIN=entPhysicalEntry::RowMembers
     //--AgentGen END

    public EntPhysicalEntryRow(OID index, Variable[] values) {
      super(index, values);
     //--AgentGen BEGIN=entPhysicalEntry::RowConstructor
     //--AgentGen END
    }
    
    public OctetString getEntPhysicalDescr() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalDescr
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalDescr);
    }  
    
    public void setEntPhysicalDescr(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalDescr
     //--AgentGen END
      super.setValue(idxEntPhysicalDescr, newValue);
    }
    
    public OID getEntPhysicalVendorType() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalVendorType
     //--AgentGen END
      return (OID) super.getValue(idxEntPhysicalVendorType);
    }  
    
    public void setEntPhysicalVendorType(OID newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalVendorType
     //--AgentGen END
      super.setValue(idxEntPhysicalVendorType, newValue);
    }
    
    public Integer32 getEntPhysicalContainedIn() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalContainedIn
     //--AgentGen END
      return (Integer32) super.getValue(idxEntPhysicalContainedIn);
    }  
    
    public void setEntPhysicalContainedIn(Integer32 newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalContainedIn
     //--AgentGen END
      super.setValue(idxEntPhysicalContainedIn, newValue);
    }
    
    public Integer32 getEntPhysicalClass() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalClass
     //--AgentGen END
      return (Integer32) super.getValue(idxEntPhysicalClass);
    }  
    
    public void setEntPhysicalClass(Integer32 newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalClass
     //--AgentGen END
      super.setValue(idxEntPhysicalClass, newValue);
    }
    
    public Integer32 getEntPhysicalParentRelPos() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalParentRelPos
     //--AgentGen END
      return (Integer32) super.getValue(idxEntPhysicalParentRelPos);
    }  
    
    public void setEntPhysicalParentRelPos(Integer32 newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalParentRelPos
     //--AgentGen END
      super.setValue(idxEntPhysicalParentRelPos, newValue);
    }
    
    public OctetString getEntPhysicalName() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalName
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalName);
    }  
    
    public void setEntPhysicalName(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalName
     //--AgentGen END
      super.setValue(idxEntPhysicalName, newValue);
    }
    
    public OctetString getEntPhysicalHardwareRev() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalHardwareRev
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalHardwareRev);
    }  
    
    public void setEntPhysicalHardwareRev(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalHardwareRev
     //--AgentGen END
      super.setValue(idxEntPhysicalHardwareRev, newValue);
    }
    
    public OctetString getEntPhysicalFirmwareRev() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalFirmwareRev
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalFirmwareRev);
    }  
    
    public void setEntPhysicalFirmwareRev(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalFirmwareRev
     //--AgentGen END
      super.setValue(idxEntPhysicalFirmwareRev, newValue);
    }
    
    public OctetString getEntPhysicalSoftwareRev() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalSoftwareRev
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalSoftwareRev);
    }  
    
    public void setEntPhysicalSoftwareRev(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalSoftwareRev
     //--AgentGen END
      super.setValue(idxEntPhysicalSoftwareRev, newValue);
    }
    
    public OctetString getEntPhysicalSerialNum() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalSerialNum
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalSerialNum);
    }  
    
    public void setEntPhysicalSerialNum(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalSerialNum
     //--AgentGen END
      super.setValue(idxEntPhysicalSerialNum, newValue);
    }
    
    public OctetString getEntPhysicalMfgName() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalMfgName
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalMfgName);
    }  
    
    public void setEntPhysicalMfgName(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalMfgName
     //--AgentGen END
      super.setValue(idxEntPhysicalMfgName, newValue);
    }
    
    public OctetString getEntPhysicalModelName() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalModelName
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalModelName);
    }  
    
    public void setEntPhysicalModelName(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalModelName
     //--AgentGen END
      super.setValue(idxEntPhysicalModelName, newValue);
    }
    
    public OctetString getEntPhysicalAlias() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalAlias
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalAlias);
    }  
    
    public void setEntPhysicalAlias(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalAlias
     //--AgentGen END
      super.setValue(idxEntPhysicalAlias, newValue);
    }
    
    public OctetString getEntPhysicalAssetID() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalAssetID
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalAssetID);
    }  
    
    public void setEntPhysicalAssetID(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalAssetID
     //--AgentGen END
      super.setValue(idxEntPhysicalAssetID, newValue);
    }
    
    public Integer32 getEntPhysicalIsFRU() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalIsFRU
     //--AgentGen END
      return (Integer32) super.getValue(idxEntPhysicalIsFRU);
    }  
    
    public void setEntPhysicalIsFRU(Integer32 newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalIsFRU
     //--AgentGen END
      super.setValue(idxEntPhysicalIsFRU, newValue);
    }
    
    public OctetString getEntPhysicalMfgDate() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalMfgDate
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalMfgDate);
    }  
    
    public void setEntPhysicalMfgDate(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalMfgDate
     //--AgentGen END
      super.setValue(idxEntPhysicalMfgDate, newValue);
    }
    
    public OctetString getEntPhysicalUris() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalUris
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalUris);
    }  
    
    public void setEntPhysicalUris(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalUris
     //--AgentGen END
      super.setValue(idxEntPhysicalUris, newValue);
    }
    
    public OctetString getEntPhysicalUUID() {
     //--AgentGen BEGIN=entPhysicalEntry::getEntPhysicalUUID
     //--AgentGen END
      return (OctetString) super.getValue(idxEntPhysicalUUID);
    }  
    
    public void setEntPhysicalUUID(OctetString newValue) {
     //--AgentGen BEGIN=entPhysicalEntry::setEntPhysicalUUID
     //--AgentGen END
      super.setValue(idxEntPhysicalUUID, newValue);
    }
    
    public Variable getValue(int column) {
     //--AgentGen BEGIN=entPhysicalEntry::RowGetValue
     //--AgentGen END
      switch(column) {
        case idxEntPhysicalDescr: 
        	return getEntPhysicalDescr();
        case idxEntPhysicalVendorType: 
        	return getEntPhysicalVendorType();
        case idxEntPhysicalContainedIn: 
        	return getEntPhysicalContainedIn();
        case idxEntPhysicalClass: 
        	return getEntPhysicalClass();
        case idxEntPhysicalParentRelPos: 
        	return getEntPhysicalParentRelPos();
        case idxEntPhysicalName: 
        	return getEntPhysicalName();
        case idxEntPhysicalHardwareRev: 
        	return getEntPhysicalHardwareRev();
        case idxEntPhysicalFirmwareRev: 
        	return getEntPhysicalFirmwareRev();
        case idxEntPhysicalSoftwareRev: 
        	return getEntPhysicalSoftwareRev();
        case idxEntPhysicalSerialNum: 
        	return getEntPhysicalSerialNum();
        case idxEntPhysicalMfgName: 
        	return getEntPhysicalMfgName();
        case idxEntPhysicalModelName: 
        	return getEntPhysicalModelName();
        case idxEntPhysicalAlias: 
        	return getEntPhysicalAlias();
        case idxEntPhysicalAssetID: 
        	return getEntPhysicalAssetID();
        case idxEntPhysicalIsFRU: 
        	return getEntPhysicalIsFRU();
        case idxEntPhysicalMfgDate: 
        	return getEntPhysicalMfgDate();
        case idxEntPhysicalUris: 
        	return getEntPhysicalUris();
        case idxEntPhysicalUUID: 
        	return getEntPhysicalUUID();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
     //--AgentGen BEGIN=entPhysicalEntry::RowSetValue
     //--AgentGen END
      switch(column) {
        case idxEntPhysicalDescr: 
        	setEntPhysicalDescr((OctetString)value);
        	break;
        case idxEntPhysicalVendorType: 
        	setEntPhysicalVendorType((OID)value);
        	break;
        case idxEntPhysicalContainedIn: 
        	setEntPhysicalContainedIn((Integer32)value);
        	break;
        case idxEntPhysicalClass: 
        	setEntPhysicalClass((Integer32)value);
        	break;
        case idxEntPhysicalParentRelPos: 
        	setEntPhysicalParentRelPos((Integer32)value);
        	break;
        case idxEntPhysicalName: 
        	setEntPhysicalName((OctetString)value);
        	break;
        case idxEntPhysicalHardwareRev: 
        	setEntPhysicalHardwareRev((OctetString)value);
        	break;
        case idxEntPhysicalFirmwareRev: 
        	setEntPhysicalFirmwareRev((OctetString)value);
        	break;
        case idxEntPhysicalSoftwareRev: 
        	setEntPhysicalSoftwareRev((OctetString)value);
        	break;
        case idxEntPhysicalSerialNum: 
        	setEntPhysicalSerialNum((OctetString)value);
        	break;
        case idxEntPhysicalMfgName: 
        	setEntPhysicalMfgName((OctetString)value);
        	break;
        case idxEntPhysicalModelName: 
        	setEntPhysicalModelName((OctetString)value);
        	break;
        case idxEntPhysicalAlias: 
        	setEntPhysicalAlias((OctetString)value);
        	break;
        case idxEntPhysicalAssetID: 
        	setEntPhysicalAssetID((OctetString)value);
        	break;
        case idxEntPhysicalIsFRU: 
        	setEntPhysicalIsFRU((Integer32)value);
        	break;
        case idxEntPhysicalMfgDate: 
        	setEntPhysicalMfgDate((OctetString)value);
        	break;
        case idxEntPhysicalUris: 
        	setEntPhysicalUris((OctetString)value);
        	break;
        case idxEntPhysicalUUID: 
        	setEntPhysicalUUID((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

     //--AgentGen BEGIN=entPhysicalEntry::Row
     //--AgentGen END
  }
  
  class EntPhysicalEntryRowFactory 
        implements MOTableRowFactory<EntPhysicalEntryRow>
  {
    public synchronized EntPhysicalEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      EntPhysicalEntryRow row = 
        new EntPhysicalEntryRow(index, values);
     //--AgentGen BEGIN=entPhysicalEntry::createRow
     //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(EntPhysicalEntryRow row) {
     //--AgentGen BEGIN=entPhysicalEntry::freeRow
     //--AgentGen END
    }

     //--AgentGen BEGIN=entPhysicalEntry::RowFactory
     //--AgentGen END
  }

  public class EntLogicalEntryRow extends DefaultMOMutableRow2PC {

     //--AgentGen BEGIN=entLogicalEntry::RowMembers
     //--AgentGen END

    public EntLogicalEntryRow(OID index, Variable[] values) {
      super(index, values);
     //--AgentGen BEGIN=entLogicalEntry::RowConstructor
     //--AgentGen END
    }
    
    public OctetString getEntLogicalDescr() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalDescr
     //--AgentGen END
      return (OctetString) super.getValue(idxEntLogicalDescr);
    }  
    
    public void setEntLogicalDescr(OctetString newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalDescr
     //--AgentGen END
      super.setValue(idxEntLogicalDescr, newValue);
    }
    
    public OID getEntLogicalType() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalType
     //--AgentGen END
      return (OID) super.getValue(idxEntLogicalType);
    }  
    
    public void setEntLogicalType(OID newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalType
     //--AgentGen END
      super.setValue(idxEntLogicalType, newValue);
    }
    
    public OctetString getEntLogicalCommunity() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalCommunity
     //--AgentGen END
      return (OctetString) super.getValue(idxEntLogicalCommunity);
    }  
    
    public void setEntLogicalCommunity(OctetString newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalCommunity
     //--AgentGen END
      super.setValue(idxEntLogicalCommunity, newValue);
    }
    
    public OctetString getEntLogicalTAddress() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalTAddress
     //--AgentGen END
      return (OctetString) super.getValue(idxEntLogicalTAddress);
    }  
    
    public void setEntLogicalTAddress(OctetString newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalTAddress
     //--AgentGen END
      super.setValue(idxEntLogicalTAddress, newValue);
    }
    
    public OID getEntLogicalTDomain() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalTDomain
     //--AgentGen END
      return (OID) super.getValue(idxEntLogicalTDomain);
    }  
    
    public void setEntLogicalTDomain(OID newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalTDomain
     //--AgentGen END
      super.setValue(idxEntLogicalTDomain, newValue);
    }
    
    public OctetString getEntLogicalContextEngineID() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalContextEngineID
     //--AgentGen END
      return (OctetString) super.getValue(idxEntLogicalContextEngineID);
    }  
    
    public void setEntLogicalContextEngineID(OctetString newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalContextEngineID
     //--AgentGen END
      super.setValue(idxEntLogicalContextEngineID, newValue);
    }
    
    public OctetString getEntLogicalContextName() {
     //--AgentGen BEGIN=entLogicalEntry::getEntLogicalContextName
     //--AgentGen END
      return (OctetString) super.getValue(idxEntLogicalContextName);
    }  
    
    public void setEntLogicalContextName(OctetString newValue) {
     //--AgentGen BEGIN=entLogicalEntry::setEntLogicalContextName
     //--AgentGen END
      super.setValue(idxEntLogicalContextName, newValue);
    }
    
    public Variable getValue(int column) {
     //--AgentGen BEGIN=entLogicalEntry::RowGetValue
     //--AgentGen END
      switch(column) {
        case idxEntLogicalDescr: 
        	return getEntLogicalDescr();
        case idxEntLogicalType: 
        	return getEntLogicalType();
        case idxEntLogicalCommunity: 
        	return getEntLogicalCommunity();
        case idxEntLogicalTAddress: 
        	return getEntLogicalTAddress();
        case idxEntLogicalTDomain: 
        	return getEntLogicalTDomain();
        case idxEntLogicalContextEngineID: 
        	return getEntLogicalContextEngineID();
        case idxEntLogicalContextName: 
        	return getEntLogicalContextName();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
     //--AgentGen BEGIN=entLogicalEntry::RowSetValue
     //--AgentGen END
      switch(column) {
        case idxEntLogicalDescr: 
        	setEntLogicalDescr((OctetString)value);
        	break;
        case idxEntLogicalType: 
        	setEntLogicalType((OID)value);
        	break;
        case idxEntLogicalCommunity: 
        	setEntLogicalCommunity((OctetString)value);
        	break;
        case idxEntLogicalTAddress: 
        	setEntLogicalTAddress((OctetString)value);
        	break;
        case idxEntLogicalTDomain: 
        	setEntLogicalTDomain((OID)value);
        	break;
        case idxEntLogicalContextEngineID: 
        	setEntLogicalContextEngineID((OctetString)value);
        	break;
        case idxEntLogicalContextName: 
        	setEntLogicalContextName((OctetString)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

     //--AgentGen BEGIN=entLogicalEntry::Row
     //--AgentGen END
  }
  
  class EntLogicalEntryRowFactory 
        implements MOTableRowFactory<EntLogicalEntryRow>
  {
    public synchronized EntLogicalEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      EntLogicalEntryRow row = 
        new EntLogicalEntryRow(index, values);
     //--AgentGen BEGIN=entLogicalEntry::createRow
     //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(EntLogicalEntryRow row) {
     //--AgentGen BEGIN=entLogicalEntry::freeRow
     //--AgentGen END
    }

     //--AgentGen BEGIN=entLogicalEntry::RowFactory
     //--AgentGen END
  }

  public class EntLPMappingEntryRow extends DefaultMOMutableRow2PC {

     //--AgentGen BEGIN=entLPMappingEntry::RowMembers
     //--AgentGen END

    public EntLPMappingEntryRow(OID index, Variable[] values) {
      super(index, values);
     //--AgentGen BEGIN=entLPMappingEntry::RowConstructor
     //--AgentGen END
    }
    
    public Integer32 getEntLPPhysicalIndex() {
     //--AgentGen BEGIN=entLPMappingEntry::getEntLPPhysicalIndex
     //--AgentGen END
      return (Integer32) super.getValue(idxEntLPPhysicalIndex);
    }  
    
    public void setEntLPPhysicalIndex(Integer32 newValue) {
     //--AgentGen BEGIN=entLPMappingEntry::setEntLPPhysicalIndex
     //--AgentGen END
      super.setValue(idxEntLPPhysicalIndex, newValue);
    }
    
    public Variable getValue(int column) {
     //--AgentGen BEGIN=entLPMappingEntry::RowGetValue
     //--AgentGen END
      switch(column) {
        case idxEntLPPhysicalIndex: 
        	return getEntLPPhysicalIndex();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
     //--AgentGen BEGIN=entLPMappingEntry::RowSetValue
     //--AgentGen END
      switch(column) {
        case idxEntLPPhysicalIndex: 
        	setEntLPPhysicalIndex((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

     //--AgentGen BEGIN=entLPMappingEntry::Row
     //--AgentGen END
  }
  
  class EntLPMappingEntryRowFactory 
        implements MOTableRowFactory<EntLPMappingEntryRow>
  {
    public synchronized EntLPMappingEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      EntLPMappingEntryRow row = 
        new EntLPMappingEntryRow(index, values);
     //--AgentGen BEGIN=entLPMappingEntry::createRow
     //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(EntLPMappingEntryRow row) {
     //--AgentGen BEGIN=entLPMappingEntry::freeRow
     //--AgentGen END
    }

     //--AgentGen BEGIN=entLPMappingEntry::RowFactory
     //--AgentGen END
  }

  public class EntAliasMappingEntryRow extends DefaultMOMutableRow2PC {

     //--AgentGen BEGIN=entAliasMappingEntry::RowMembers
     //--AgentGen END

    public EntAliasMappingEntryRow(OID index, Variable[] values) {
      super(index, values);
     //--AgentGen BEGIN=entAliasMappingEntry::RowConstructor
     //--AgentGen END
    }
    
    public OID getEntAliasMappingIdentifier() {
     //--AgentGen BEGIN=entAliasMappingEntry::getEntAliasMappingIdentifier
     //--AgentGen END
      return (OID) super.getValue(idxEntAliasMappingIdentifier);
    }  
    
    public void setEntAliasMappingIdentifier(OID newValue) {
     //--AgentGen BEGIN=entAliasMappingEntry::setEntAliasMappingIdentifier
     //--AgentGen END
      super.setValue(idxEntAliasMappingIdentifier, newValue);
    }
    
    public Variable getValue(int column) {
     //--AgentGen BEGIN=entAliasMappingEntry::RowGetValue
     //--AgentGen END
      switch(column) {
        case idxEntAliasMappingIdentifier: 
        	return getEntAliasMappingIdentifier();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
     //--AgentGen BEGIN=entAliasMappingEntry::RowSetValue
     //--AgentGen END
      switch(column) {
        case idxEntAliasMappingIdentifier: 
        	setEntAliasMappingIdentifier((OID)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

     //--AgentGen BEGIN=entAliasMappingEntry::Row
     //--AgentGen END
  }
  
  class EntAliasMappingEntryRowFactory 
        implements MOTableRowFactory<EntAliasMappingEntryRow>
  {
    public synchronized EntAliasMappingEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      EntAliasMappingEntryRow row = 
        new EntAliasMappingEntryRow(index, values);
     //--AgentGen BEGIN=entAliasMappingEntry::createRow
     //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(EntAliasMappingEntryRow row) {
     //--AgentGen BEGIN=entAliasMappingEntry::freeRow
     //--AgentGen END
    }

     //--AgentGen BEGIN=entAliasMappingEntry::RowFactory
     //--AgentGen END
  }

  public class EntPhysicalContainsEntryRow extends DefaultMOMutableRow2PC {

     //--AgentGen BEGIN=entPhysicalContainsEntry::RowMembers
     //--AgentGen END

    public EntPhysicalContainsEntryRow(OID index, Variable[] values) {
      super(index, values);
     //--AgentGen BEGIN=entPhysicalContainsEntry::RowConstructor
     //--AgentGen END
    }
    
    public Integer32 getEntPhysicalChildIndex() {
     //--AgentGen BEGIN=entPhysicalContainsEntry::getEntPhysicalChildIndex
     //--AgentGen END
      return (Integer32) super.getValue(idxEntPhysicalChildIndex);
    }  
    
    public void setEntPhysicalChildIndex(Integer32 newValue) {
     //--AgentGen BEGIN=entPhysicalContainsEntry::setEntPhysicalChildIndex
     //--AgentGen END
      super.setValue(idxEntPhysicalChildIndex, newValue);
    }
    
    public Variable getValue(int column) {
     //--AgentGen BEGIN=entPhysicalContainsEntry::RowGetValue
     //--AgentGen END
      switch(column) {
        case idxEntPhysicalChildIndex: 
        	return getEntPhysicalChildIndex();
        default:
          return super.getValue(column);
      }
    }
    
    public void setValue(int column, Variable value) {
     //--AgentGen BEGIN=entPhysicalContainsEntry::RowSetValue
     //--AgentGen END
      switch(column) {
        case idxEntPhysicalChildIndex: 
        	setEntPhysicalChildIndex((Integer32)value);
        	break;
        default:
          super.setValue(column, value);
      }
    }

     //--AgentGen BEGIN=entPhysicalContainsEntry::Row
     //--AgentGen END
  }
  
  class EntPhysicalContainsEntryRowFactory 
        implements MOTableRowFactory<EntPhysicalContainsEntryRow>
  {
    public synchronized EntPhysicalContainsEntryRow createRow(OID index, Variable[] values)
        throws UnsupportedOperationException 
    {
      EntPhysicalContainsEntryRow row = 
        new EntPhysicalContainsEntryRow(index, values);
     //--AgentGen BEGIN=entPhysicalContainsEntry::createRow
     //--AgentGen END
      return row;
    }
    
    public synchronized void freeRow(EntPhysicalContainsEntryRow row) {
     //--AgentGen BEGIN=entPhysicalContainsEntry::freeRow
     //--AgentGen END
    }

     //--AgentGen BEGIN=entPhysicalContainsEntry::RowFactory
     //--AgentGen END
  }


//--AgentGen BEGIN=_METHODS
//--AgentGen END

  // Textual Definitions of MIB module EntityMib
  protected void addTCsToFactory(MOFactory moFactory) {
   moFactory.addTextualConvention(new PhysicalIndex()); 
   moFactory.addTextualConvention(new PhysicalIndexOrZero()); 
   moFactory.addTextualConvention(new SnmpEngineIdOrNone()); 
  }


  public class PhysicalIndex implements TextualConvention {
  	
    public PhysicalIndex() {
    }

    public String getModuleName() {
      return TC_MODULE_ENTITY_MIB;
    }
  	
    public String getName() {
      return TC_PHYSICALINDEX;
    }
    
    public Variable createInitialValue() {
    	Variable v = new Integer32();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(1L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=PhysicalIndex::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(1L, 2147483647L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=PhysicalIndex::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(1L, 2147483647L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=PhysicalIndex::createColumn
     //--AgentGen END
      return col;      
    }
  }


  public class PhysicalIndexOrZero implements TextualConvention {
  	
    public PhysicalIndexOrZero() {
    }

    public String getModuleName() {
      return TC_MODULE_ENTITY_MIB;
    }
  	
    public String getName() {
      return TC_PHYSICALINDEXORZERO;
    }
    
    public Variable createInitialValue() {
    	Variable v = new Integer32();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(0L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=PhysicalIndexOrZero::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(0L, 2147483647L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=PhysicalIndexOrZero::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(0L, 2147483647L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=PhysicalIndexOrZero::createColumn
     //--AgentGen END
      return col;      
    }
  }


  public class SnmpEngineIdOrNone implements TextualConvention {
  	
    public SnmpEngineIdOrNone() {
    }

    public String getModuleName() {
      return TC_MODULE_ENTITY_MIB;
    }
  	
    public String getName() {
      return TC_SNMPENGINEIDORNONE;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(0L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=SnmpEngineIdOrNone::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(0L, 32L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=SnmpEngineIdOrNone::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(0L, 32L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=SnmpEngineIdOrNone::createColumn
     //--AgentGen END
      return col;      
    }
  }


//--AgentGen BEGIN=_TC_CLASSES_IMPORTED_MODULES_BEGIN
//--AgentGen END

  // Textual Definitions of other MIB modules
  public void addImportedTCsToFactory(MOFactory moFactory) {
   moFactory.addTextualConvention(new TAddress()); 
   moFactory.addTextualConvention(new UUIDorZero()); 
   moFactory.addTextualConvention(new RowPointer()); 
   moFactory.addTextualConvention(new SnmpAdminString()); 
   moFactory.addTextualConvention(new TDomain()); 
   moFactory.addTextualConvention(new IANAPhysicalClass()); 
  }

  // Textual Convention TAddress from MIB module SNMPv2-TC

  public class TAddress implements TextualConvention {
  	
    public TAddress() {
    }

    public String getModuleName() {
      return TC_MODULE_SNMPV2_TC;
    }
  	
    public String getName() {
      return TC_TADDRESS;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(1L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=TAddress::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(1L, 255L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=TAddress::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(1L, 255L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=TAddress::createColumn
     //--AgentGen END
      return col;      
    }
  }

  // Textual Convention UUIDorZero from MIB module UUID-TC-MIB

  public class UUIDorZero implements TextualConvention {
  	
    public UUIDorZero() {
    }

    public String getModuleName() {
      return TC_MODULE_UUID_TC_MIB;
    }
  	
    public String getName() {
      return TC_UUIDORZERO;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(0L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=UUIDorZero::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(0L, 0L));
      ((ConstraintsImpl)vc).add(new Constraint(16L, 16L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=UUIDorZero::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(0L, 0L));
        ((ConstraintsImpl)vc).add(new Constraint(16L, 16L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=UUIDorZero::createColumn
     //--AgentGen END
      return col;      
    }
  }

  // Textual Convention RowPointer from MIB module SNMPv2-TC

  public class RowPointer implements TextualConvention {
  	
    public RowPointer() {
    }

    public String getModuleName() {
      return TC_MODULE_SNMPV2_TC;
    }
  	
    public String getName() {
      return TC_ROWPOINTER;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OID();
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=RowPointer::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
     //--AgentGen BEGIN=RowPointer::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
     //--AgentGen BEGIN=RowPointer::createColumn
     //--AgentGen END
      return col;      
    }
  }

  // Textual Convention SnmpAdminString from MIB module SNMP-FRAMEWORK-MIB

  public class SnmpAdminString implements TextualConvention {
  	
    public SnmpAdminString() {
    }

    public String getModuleName() {
      return TC_MODULE_SNMP_FRAMEWORK_MIB;
    }
  	
    public String getName() {
      return TC_SNMPADMINSTRING;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OctetString();
      if (v instanceof AssignableFromLong) {
      	((AssignableFromLong)v).setValue(0L);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=SnmpAdminString::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new ConstraintsImpl();
      ((ConstraintsImpl)vc).add(new Constraint(0L, 255L));
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=SnmpAdminString::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new ConstraintsImpl();
        ((ConstraintsImpl)vc).add(new Constraint(0L, 255L));
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=SnmpAdminString::createColumn
     //--AgentGen END
      return col;      
    }
  }

  // Textual Convention TDomain from MIB module SNMPv2-TC

  public class TDomain implements TextualConvention {
  	
    public TDomain() {
    }

    public String getModuleName() {
      return TC_MODULE_SNMPV2_TC;
    }
  	
    public String getName() {
      return TC_TDOMAIN;
    }
    
    public Variable createInitialValue() {
    	Variable v = new OID();
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=TDomain::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
     //--AgentGen BEGIN=TDomain::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
     //--AgentGen BEGIN=TDomain::createColumn
     //--AgentGen END
      return col;      
    }
  }

  // Textual Convention IANAPhysicalClass from MIB module IANA-ENTITY-MIB

  public class IANAPhysicalClass implements TextualConvention {
    public static final int other = 1;
    public static final int unknown = 2;
    public static final int chassis = 3;
    public static final int backplane = 4;
    /* -- e.g., chassis slot or daughter-card holder */
    public static final int container = 5;
    public static final int powerSupply = 6;
    public static final int fan = 7;
    public static final int sensor = 8;
    /* -- e.g., plug-in card or daughter-card */
    public static final int module = 9;
    public static final int port = 10;
    /* -- e.g., stack of multiple chassis entities */
    public static final int stack = 11;
    public static final int cpu = 12;
    public static final int energyObject = 13;
    public static final int battery = 14;
  	
    public IANAPhysicalClass() {
    }

    public String getModuleName() {
      return TC_MODULE_IANA_ENTITY_MIB;
    }
  	
    public String getName() {
      return TC_IANAPHYSICALCLASS;
    }
    
    public Variable createInitialValue() {
    	Variable v = new Integer32();
      if (v instanceof AssignableFromLong) {
        ((AssignableFromLong)v).setValue(1);
      }
    	// further modify value to comply with TC constraints here:
     //--AgentGen BEGIN=IANAPhysicalClass::createInitialValue
     //--AgentGen END
	    return v;
    }
  	
    public MOScalar createScalar(OID oid, MOAccess access, Variable value) {
      MOScalar scalar = moFactory.createScalar(oid, access, value);
      ValueConstraint vc = new EnumerationConstraint(
        new int[] { other,
                    unknown,
                    chassis,
                    backplane,
                    container,
                    powerSupply,
                    fan,
                    sensor,
                    module,
                    port,
                    stack,
                    cpu,
                    energyObject,
                    battery });
      scalar.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
     //--AgentGen BEGIN=IANAPhysicalClass::createScalar
     //--AgentGen END
      return scalar;
    }
  	
    public MOColumn createColumn(int columnID, int syntax, MOAccess access,
                                 Variable defaultValue, boolean mutableInService) {
      MOColumn col = moFactory.createColumn(columnID, syntax, access, 
                                            defaultValue, mutableInService);
      if (col instanceof MOMutableColumn) {
        MOMutableColumn mcol = (MOMutableColumn)col;
        ValueConstraint vc = new EnumerationConstraint(
          new int[] { other,
                      unknown,
                      chassis,
                      backplane,
                      container,
                      powerSupply,
                      fan,
                      sensor,
                      module,
                      port,
                      stack,
                      cpu,
                      energyObject,
                      battery });
        mcol.addMOValueValidationListener(new ValueConstraintValidator(vc));                                  
      }
     //--AgentGen BEGIN=IANAPhysicalClass::createColumn
     //--AgentGen END
      return col;      
    }
  }


//--AgentGen BEGIN=_TC_CLASSES_IMPORTED_MODULES_END
//--AgentGen END

//--AgentGen BEGIN=_CLASSES
//--AgentGen END

//--AgentGen BEGIN=_END
//--AgentGen END
}


