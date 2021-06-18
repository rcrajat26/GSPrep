package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Map.Entry;

public class TopIPAddress {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("C:\\Users\\Rajat_Chikkodikar\\Desktop\\My files\\Projects\\GSIncubation\\src\\main\\java\\string\\_scratch.txt");
        Scanner sc = new Scanner(input);

        List<String> logs = new ArrayList<>();
        while (sc.hasNext()){
            logs.add(sc.nextLine());
        }
        List<String> topIPs = findTopIPs(logs);
        System.out.println(topIPs);
    }

    private static List<String> findTopIPs(List<String> logs) {

        List<String> ips = new ArrayList<>();
        int maxLen=-1;

        Map<String,Integer> count = new HashMap<>();
        for(String log:logs) {
            String ip = log.split("\\s+")[0];
            if(count.containsKey(ip)) {
                count.put(ip,count.get(ip)+1);
                if(count.get(ip)>maxLen) {
                    maxLen = count.get(ip);
                }
            }
            else {
                count.put(ip,1);
            }
        }

        int finalMaxLen = maxLen;
        count.forEach((k, v)->{
            if(v == finalMaxLen) {
                ips.add(k);
            }
        });

        return ips;
    }
}
