import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

import org.snmp4j.smi.*;
import org.snmp4j.agent.*;
import org.snmp4j.agent.mo.DefaultMOFactory;
import org.snmp4j.agent.mo.DefaultMOMutableRow2PC;
import org.snmp4j.agent.mo.MOAccessImpl;
import org.snmp4j.agent.mo.MOColumn;
import org.snmp4j.agent.mo.MOFactory;
import org.snmp4j.agent.mo.MOMutableTableModel;
import org.snmp4j.agent.mo.MOMutableTableRow;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.agent.mo.MOTable;
import org.snmp4j.agent.mo.MOTableIndex;
import org.snmp4j.agent.mo.MOTableIndexValidator;
import org.snmp4j.agent.mo.MOTableRow;
import org.snmp4j.agent.mo.MOTableRowEvent;
import org.snmp4j.agent.mo.MOTableRowFactory;
import org.snmp4j.agent.mo.MOTableSubIndex;
import org.snmp4j.agent.mo.MOTableRowListener;
import org.snmp4j.agent.mo.snmp.SNMPv2MIB;
import org.snmp4j.agent.mo.snmp.SysUpTime;
import org.snmp4j.agent.mo.snmp.TimeStamp;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

public class GredesSensorMib  implements MOGroup {

  // Factory
  private MOFactory moFactory =  DefaultMOFactory.getInstance();

  // Constants 

  /**
   * OID of this MIB module for usage which can be 
   * used for its identification.
   */
  public static final OID oidGredesSensorMib = new OID(new int[] { 1,3,6,1,2,1,47,1 });

  // Identities
  // Scalars
  public static final OID oidGestaoRedesSensorTableEntrySensorIndex1 = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,2,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorType = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,3,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorValue = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,4,0 });
  public static final OID oidGestaoRedesSensorTableEntrySensorValueTimeStamp = new OID(new int[] { 1,3,6,1,2,1,47,1,1,1,1,5,0 });
  // Tables
  // Notifications
  // Enumerations

  // TextualConventions

  // Scalars

  private MOScalar<Integer32> gestaoRedesSensorTableEntrySensorIndex1;
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

  private MOTableSubIndex[] gestaoRedesSensorTableEntryIndexes  = 
    new MOTableSubIndex[] { moFactory.createSubIndex(oidGestaoRedesSensorTableEntrySensorIndex1, 
        SMIConstants.SYNTAX_INTEGER, 1, 1)    };

  private MOTableIndex gestaoRedesSensorTableEntryIndex = 
    moFactory.createIndex(gestaoRedesSensorTableEntryIndexes, false,
        new MOTableIndexValidator() {
          public boolean isValidIndex(OID index) {
            boolean isValidIndex = true;
            return isValidIndex;
          }
        });

  private MOTable gestaoRedesSensorTableEntry;
  private MOMutableTableModel  gestaoRedesSensorTableEntryModel;

  //added new variables
  private int actualIndex=1;
  private HashMap <Integer, String> SerialFilePathMap = new HashMap<Integer,String>();
  private rowListner RowList;

  /**
   * Constructs a GredesSensorMib instance without actually creating its
   * <code>ManagedObject</code> instances. This has to be done in a
   * sub-class constructor or after construction by calling 
   * {@link #createMO(MOFactory moFactory)}. 
   */
  public GredesSensorMib() {
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
    gestaoRedesSensorTableEntrySensorIndex1 = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorIndex1,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE), 
          new Integer32());
    gestaoRedesSensorTableEntrySensorType = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorType,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE), 
          new OctetString());
    gestaoRedesSensorTableEntrySensorValue = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorValue,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE), 
          new Integer32());
    gestaoRedesSensorTableEntrySensorValueTimeStamp = 
      moFactory.createScalar(oidGestaoRedesSensorTableEntrySensorValueTimeStamp,
          moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE), 
          new TimeTicks());
    createGestaoRedesSensorTableEntry(moFactory);
  }

  public MOScalar<Integer32> getGestaoRedesSensorTableEntrySensorIndex() {
    return gestaoRedesSensorTableEntrySensorIndex1;
  }

  public MOScalar<OctetString> getGestaoRedesSensorTableEntrySensorType() {
    return gestaoRedesSensorTableEntrySensorType;
  }

  public MOScalar<Integer32> getGestaoRedesSensorTableEntrySensorValue(Integer32 index) {
    return gestaoRedesSensorTableEntrySensorValue;
  }

  public MOScalar<TimeTicks> getGestaoRedesSensorTableEntrySensorValueTimeStamp() {
    return gestaoRedesSensorTableEntrySensorValueTimeStamp;
  }

  public MOTable getGestaoRedesSensorTableEntry() {
    return gestaoRedesSensorTableEntry;
  }

  @SuppressWarnings(value={"unchecked"})
    private void createGestaoRedesSensorTableEntry(MOFactory moFactory) {
      // Index definition

      // Columns
      MOColumn[] gestaoRedesSensorTableEntryColumns = new MOColumn[4];
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorIndex] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorIndex, 
            SMIConstants.SYNTAX_INTEGER,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorType] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorType, 
            SMIConstants.SYNTAX_OCTET_STRING,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorValue] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorValue, 
            SMIConstants.SYNTAX_INTEGER,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
      gestaoRedesSensorTableEntryColumns[idxGestaoRedesSensorTableEntrySensorValueTimeStamp] = 
        moFactory.createColumn(colGestaoRedesSensorTableEntrySensorValueTimeStamp, 
            SMIConstants.SYNTAX_TIMETICKS,
            moFactory.createAccess(MOAccessImpl.ACCESSIBLE_FOR_READ_WRITE));
      // Table model
      gestaoRedesSensorTableEntryModel =  moFactory.createTableModel(oidGestaoRedesSensorTableEntry,
          gestaoRedesSensorTableEntryIndex,
          gestaoRedesSensorTableEntryColumns);

      gestaoRedesSensorTableEntryModel.setRowFactory(new GestaoRedesSensorTableEntryRowFactory());
      gestaoRedesSensorTableEntry = moFactory.createTable(oidGestaoRedesSensorTableEntry,
          gestaoRedesSensorTableEntryIndex,
          gestaoRedesSensorTableEntryColumns,
          gestaoRedesSensorTableEntryModel);
      //gestaoRedesSensorTableEntry.addMOTableRowListener( RowList );
    }

  public void registerMOs(MOServer server, OctetString context)  throws DuplicateRegistrationException {
    // Scalar Objects
    server.register(this.gestaoRedesSensorTableEntry, context);
  }

  public void unregisterMOs(MOServer server, OctetString context) {
    // Scalar Objects
    server.unregister(this.gestaoRedesSensorTableEntry, context);
  }

  // Rows and Factories

  public class rowListner implements MOTableRowListener {

    public void rowChanged(MOTableRowEvent event){
    }
  }

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

    public Integer32 getGestaoRedesSensorTableEntrySensorValue(Integer32 index) {
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

    @Override
      public Variable getValue(int column) {
        System.out.println("getvalue");
        switch(column) {
          case idxGestaoRedesSensorTableEntrySensorIndex: 
            return getGestaoRedesSensorTableEntrySensorIndex();
          case idxGestaoRedesSensorTableEntrySensorType: 
            return getGestaoRedesSensorTableEntrySensorType();
          case idxGestaoRedesSensorTableEntrySensorValue: 
            {
              Integer32 index =	getGestaoRedesSensorTableEntrySensorIndex();
              System.out.println("get ");
              return getGestaoRedesSensorTableEntrySensorValue(index);
            }
          case idxGestaoRedesSensorTableEntrySensorValueTimeStamp: 
            return getGestaoRedesSensorTableEntrySensorValueTimeStamp();
          default:
            return super.getValue(column);
        }
      }

    @Override
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

  class GestaoRedesSensorTableEntryRowFactory implements MOTableRowFactory<GestaoRedesSensorTableEntryRow>
  {
    public synchronized GestaoRedesSensorTableEntryRow createRow(OID index, Variable[] values) throws UnsupportedOperationException {
      GestaoRedesSensorTableEntryRow row = new GestaoRedesSensorTableEntryRow(index, values);
      return row;
    }

    public synchronized void freeRow(GestaoRedesSensorTableEntryRow row) {
    }
  }

  public int initializeSensorsXML ( String fileName ){
    int numberSensors = 0;
    File fXmlFile = new File(fileName);
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder dBuilder;
    try {
      dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(fXmlFile);

      doc.getDocumentElement().normalize();
      System.out.println("----------------------------");		
      System.out.println("Reading Devices from :" + fileName );
      System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
      NodeList nList = doc.getElementsByTagName("Sensor");
      System.out.println("----------------------------");

      for (int temp = 0; temp < nList.getLength(); temp++) {

        Node nNode = nList.item(temp);

        System.out.println("\nCurrent Element :" + nNode.getNodeName());

        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

          Element eElement = (Element) nNode;
          String type = eElement.getElementsByTagName("Type").item(0).getTextContent();
          String description = eElement.getElementsByTagName("Description").item(0).getTextContent();
          String filePath = eElement.getElementsByTagName("SerialFilePath").item(0).getTextContent();

          System.out.println("\tType : " + type);
          System.out.println("\tDescription : " + description);
          System.out.println("\tSerialFilePath : " + filePath);
          numberSensors++;

          //SNMP OIDs initilization for Table Row
          Variable[] vars = new Variable[4];
          vars[0]=new Integer32(actualIndex);
          vars[1]=new OctetString(type);
          vars[2]=new Integer32(0);
          vars[3]=new TimeTicks();
          MOMutableTableModel model = (MOMutableTableModel) gestaoRedesSensorTableEntry.getModel();
          model.addRow(new DefaultMOMutableRow2PC(new OID(new int[] {actualIndex}), vars));
          SerialFilePathMap.put(actualIndex, filePath);
          actualIndex++;
        }
      }
      System.out.println("\n----------------------------");

    } catch (ParserConfigurationException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (SAXException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return numberSensors;  
  }


  public void add_sensor( String sensorType, int value){
    Variable[] vars = new Variable[4];
    vars[0]=new Integer32(actualIndex);
    vars[1]=new OctetString(sensorType);
    vars[2]=new Integer32(value);
    vars[3]=new TimeTicks();
    MOMutableTableModel model = (MOMutableTableModel) gestaoRedesSensorTableEntry.getModel();
    model.addRow(new DefaultMOMutableRow2PC(new OID(new int[] {actualIndex}), vars));
    actualIndex++;
  }

  public void updateSensorsData (MOServer server, OctetString context){	
    for (Integer index : SerialFilePathMap.keySet()){
      String fileToOpen = this.SerialFilePathMap.get(index);
      System.out.println ("Getting sensor value from :" + fileToOpen);
      FileInputStream fstream;
      try {
        fstream = new FileInputStream(fileToOpen);
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        //Read File 1st line
        if ((strLine = br.readLine()) != null)   {
          Double temperatura = Double.parseDouble(strLine);
          MOMutableTableModel model = (MOMutableTableModel) gestaoRedesSensorTableEntry.getModel();
          int pos = 1;
          for (Iterator<MOTableRow> i = model.iterator(); i.hasNext() && pos <= index ;) {
            MOMutableTableRow mot = (MOMutableTableRow) i.next();
            if (pos == index) {     	
              mot.setValue( 2  , new Integer32(temperatura.intValue()));
              mot.setValue( 3 , SNMPv2MIB.getSysUpTime(context).get() );
              System.out.println ("\tUpdating " + index + " to " + temperatura.intValue() + " ºC at:" + SNMPv2MIB.getSysUpTime(context).get().toString());
            }
          }		       
        }
        //Close the input stream
        br.close();
      } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
