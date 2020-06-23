import telran.data.LazySingleton;
import telran.data.ProgramLogger;
import telran.data.Singleton;
import telran.data.SingletonOne;

public class SingletonApp {

    public static void main(String[] args) {

//        System.out.println(SingletonOne.INSTANCE.getNAME());
//        System.out.println(SingletonOne.INSTANCE);

//        System.out.println(LazySingleton.getInstance("Boss").getName());
//        System.out.println(LazySingleton.getInstance("Bo").getName());
//
//        Singleton boss = Singleton.getInstance();
//
          System.out.println(ProgramLogger.getInstance());
          System.out.println(ProgramLogger.getInstance());
          System.out.println(ProgramLogger.getInstance());

          ProgramLogger.getInstance().showLogFile();
          ProgramLogger.getInstance().addLogInfo("log one");
          ProgramLogger.getInstance().addLogInfo("log two");
          ProgramLogger.getInstance().addLogInfo("log three");
          ProgramLogger.getInstance().showLogFile();

    }
}
