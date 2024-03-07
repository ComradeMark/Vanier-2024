package Lab2;

class JavaException {
    public static void main(String args[]){
        try {
            int d =0;
            int n = 20;

            int fraction = n / d;


        } catch (ArithmeticException e) {
            System.out.println("In the catch block due to ArithmeticException = " + e);
            try{
                int g[] = new int[1];
                g[0] = 100;
                int value = g[1];
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("In the second try block due to ArrayIndexOutOfBounds" + e1);
            } try{
                String str = null;
                int strLength = str.length();
            } catch(NullPointerException e2){
                System.out.println("In third try block due to StringIndexOutOfBounds" + e2);
            }
        } catch (Exception e) {
            System.out.println("In the catch block due to ArrayIndexOutOfBoundsException = " +
                    e);
        }
        // there are 4 missing lines in the code
        System.out.println("End Of Main");
    }
}
