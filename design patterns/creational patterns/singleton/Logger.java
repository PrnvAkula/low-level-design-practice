public class Logger{
    private static Logger logger = null;
    
    private Logger(){}

    public static Logger getLogger(){
        if(logger == null){
            logger = new Logger();
        }

        return logger;
    }

    public void log(String messaage){
        System.out.println("Log: " + messaage);
    }
}
