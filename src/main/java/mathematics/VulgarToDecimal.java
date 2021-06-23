package mathematics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VulgarToDecimal {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\mathematics\\scratch.txt");
        Scanner sc = new Scanner(input);

        double num = sc.nextDouble();
        double denom = sc.nextDouble();

        String res = vulg2deci(num,denom);
        System.out.println(res);
    }

    private static String vulg2deci(double num, double denom) {

        Map<Integer,Integer> mp = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        sb.append("0.");
        int resCount=0,containsCnt=0,tmp=(int)num;
        boolean vulgar=false;
        while(num%denom!=0) {
            if(num<denom) {
                num*=10;
                while (num<denom) {
                    sb.append("0");
                    num*=10;
                }
            }
            int rem = (int) ((int)num/denom);
            if(!mp.containsKey(rem)) {
                mp.put(rem,1);
                resCount++;
            } else {
                if(mp.get(rem) == 2)
                {
                    vulgar=true;
                    break;
                }
                mp.put(rem,mp.get(rem)+1);
                containsCnt++;
            }
            num = num%denom;
            if(resCount == containsCnt && mp.size() == resCount) {
                vulgar =true;
                break;
            }
        }

        StringBuilder vul = new StringBuilder();
        if(vulgar) {
            vul.append("(");
            mp.entrySet().forEach(e->{
                if(e.getValue()%2 == 0)
                vul.append(e.getKey());
                else
                    sb.append(e.getKey());
            });
            vul.append(")");
            sb.append(vul);
            return sb.toString();
        }
        else{
            return String.valueOf(tmp/(double) denom);
        }

    }
}
