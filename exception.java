package LABpack;

public class exception {
    public static void main(String[] args) {
        try {
            int num = 4;
            System.out.println(num/0);
        }catch (ArithmeticException e) {
            System.out.println("Exception Type: "+ e);
        }
        try {
            int a[] = { 1, 2, 3 };
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Type: "+ e);
        }
        try{
            String str = null;
            int len = str.length(); // This line will throw a NullPointerException
            System.out.println("Length of the string: " + len);
        } catch(NullPointerException e) {
            System.out.println("Exception Type: " + e);
        }
    }
}

