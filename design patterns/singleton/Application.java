public class Application {
    public void run(){
        Logger logger = Logger.getLogger();
        logger.log("The logger is working!!!");

        ThreadSafeLogger threadSafeLogger = ThreadSafeLogger.getThreadSafeLogger();
        threadSafeLogger.log("The thread safe logger is also working!!!");
    }
}
