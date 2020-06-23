public class MonitoringApp {

    public static void main(String[] args) {
//        ErrorModule error = new ErrorModule();
//        GeneralModule general = new GeneralModule();
//        SecurityModule security = new SecurityModule();
//
//        error.startMonitoring();
//        general.startMonitoring();
//        security.startMonitoring();

        MonitoringSystem errorMode = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("security module is starting");
            }
        };

        MonitoringSystem generalModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("general module is starting");
            }
        };

        MonitoringSystem securityModule = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("security module is starting");
            }
        };

        generalModule.startMonitoring();
        securityModule.startMonitoring();
        errorMode.startMonitoring();
    }
}
