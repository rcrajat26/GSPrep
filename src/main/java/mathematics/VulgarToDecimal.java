package mathematics;

public class VulgarToDecimal {

    public static void main(String[] args) {

        String res = vulg2deci(4l,7l);
        System.out.println(res);
    }

    private static String vulg2deci(double num, double denom) {

        Double res =  num/denom;
        String s = res.toString();

        String[] arr = s.split("\\.");
        s= arr[1];

        //String window =

        return s;
    }
}
