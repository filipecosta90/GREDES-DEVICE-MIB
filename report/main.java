public static void main(String[] args) throws IOException, DuplicateRegistrationException {
  SNMPAgent agent = null;
  agent =  new SNMPAgent("0.0.0.0/2001");
  agent.sensors = new GredesSensorMib(DefaultMOFactory.getInstance());
  agent.initialize();
  agent.sensors.registerMOs(agent.getServer(), agent.getDefaultContext());
  int totalInitializedSensors = agent.sensors.initializeSensorsXML("sensorCatalog.xml");
  System.out.println("Initilized GRedesSensorMib Table with " + totalInitializedSensors + " sensors");
  agent.start();
}
