public void start()  {
  super.run();
  if (super.agentState == super.STATE_RUNNING){
    System.out.println("Agent running on: " + this.address);
  }
  while(super.agentState == super.STATE_RUNNING){
    sensors.updateSensorsData(this.getServer(), this.getDefaultContext());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
