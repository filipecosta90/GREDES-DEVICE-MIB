public void updateSensorsData (MOServer server, OctetString context){ 
  for (Integer index : SerialFilePathMap.keySet()){
    String fileToOpen = this.SerialFilePathMap.get(index);
    System.out.println ("Getting sensor value from :" + fileToOpen);
    FileInputStream fstream;
    try {
      fstream = new FileInputStream(fileToOpen);
      BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
      String strLine;
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
      br.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
