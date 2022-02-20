package addnum;
import java.io.*;
/**
* @author Akmalf
* @version 1.0
* @since 2022-02-09
*/
public class AddNum {
 /**
 * This method is used to add two integers. This is
 * a the simplest form of a class method, just to
 * show the usage of various javadoc Tags.
 * @param numA This is the first paramter to addNum method
 * @param numB This is the second parameter to addNum method
 * @return int This returns sum of numA and numB.
 */
 public int addNum(int numA, int numB) {
 return numA + numB;
 }
 
 /**
 * This is the main method which makes use of addNum method.
 * @param args Unused.
 * @exception IOException On input error.
 * @see IOException
 */
 
 public static void main(String args[]) throws IOException {
 AddNum obj = new AddNum();
 int sum = obj.addNum(10, 20);
 System.out.println("Sum of 10 and 20 is :" + sum);
 }
}
