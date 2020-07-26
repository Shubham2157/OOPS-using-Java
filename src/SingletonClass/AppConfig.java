package SingletonClass;

public class AppConfig {
    private AppConfig(){

    }
//    private static AppConfig obj = new AppConfig();
//
//    // But if we do not use this obj then also it will be created and our memory will be wasted so we can use
//    // lagy method
//
//    public static AppConfig getInstance(){
//        return obj;
//    }

    // This is lagy method

    private static AppConfig obj = null;

    public static AppConfig getInstance(){
        if (obj == null){
            obj = new AppConfig();
        }
        return obj;
    }

}
