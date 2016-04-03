


public class NativeMethodCode {
        
    public static native void printText();
    static {
    System.loadLibrary("happy");
    }
   
    public static void main(String[] args) {
        Happy happy = new Happy();
        happy.printText();
        
    }
}
class Happy{
    public native void printText();
    static{
        System.loadLibrary("happy");
    }
}