import javax.lang.model.util.ElementScanner14;

/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) {
        if (n<=0){
        return original; } 
    else {
        return original+ appendNTimes(original, n-1);    //already printed original string once, so must do n-1 to account for the string already being printed 
    }
    }

    public static void main (String[] args) {

        System.out.println(appendNTimes("cat", 1));
        System.out.println(appendNTimes("cat",0)); 
        System.out.println(appendNTimes("cat",5)); 
        System.out.println(appendNTimes("cat",9)); 
    }
}
