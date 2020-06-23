package telran.data;

public class ProgramLogger {

    private static ProgramLogger programLogger;
    private static String logFile = "this is log file\n";

    private ProgramLogger(){
    }

    public static ProgramLogger getInstance(){
        if(programLogger == null){
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String logInfo){
        logFile += logInfo + "\n";
    }
    public void showLogFile(){
        System.out.println(logFile);
    }
}
