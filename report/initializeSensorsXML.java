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
        /*SNMP OIDs initilization for Table Row*/
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
    e.printStackTrace();
  } catch (SAXException e) {
    e.printStackTrace();
  } catch (IOException e) {
    e.printStackTrace();
  }
  return numberSensors;  
}
