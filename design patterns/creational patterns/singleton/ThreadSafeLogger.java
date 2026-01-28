public class ThreadSafeLogger {
    private static volatile ThreadSafeLogger logger;
    
    private ThreadSafeLogger(){}
    
    public static ThreadSafeLogger getThreadSafeLogger(){
        if(logger == null){
            synchronized(ThreadSafeLogger.class){
                if(logger == null){
                    logger = new ThreadSafeLogger();
                }
            }
        }

        return logger;
    }

    public void log(String message){
        System.out.println("Log: " + message);
    }
}
