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
