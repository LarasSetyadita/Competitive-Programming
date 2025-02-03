import java.util.Scanner;
import java.util.TreeMap;
public class MinEs {
    public static void main(String[] args) {

        TreeMap<String, String> kode1 = new TreeMap<String, String>();
        
        kode1.put("AA", "CB");
        kode1.put("AB", "AA");
        kode1.put("AC", "DD");
        kode1.put("AD", "DB");

        kode1.put("BA", "CC");
        kode1.put("BB", "DC");
        kode1.put("BC", "CA");
        kode1.put("BD", "DA");

        kode1.put("CA", "BA");
        kode1.put("CB", "AD");
        kode1.put("CC", "AC");
        kode1.put("CD", "BC");

        kode1.put("DA", "BB");
        kode1.put("DB", "CD");
        kode1.put("DC", "AB");
        kode1.put("DD", "BD");

        TreeMap<String, String> kode2 = new TreeMap<String, String>();
        
        kode2.put("AA", "DA");
        kode2.put("AB", "DD");
        kode2.put("AC", "AC");
        kode2.put("AD", "BC");

        kode2.put("BA", "DB");
        kode2.put("BB", "AB");
        kode2.put("BC", "CC");
        kode2.put("BD", "CD");

        kode2.put("CA", "DC");
        kode2.put("CB", "BA");
        kode2.put("CC", "AD");
        kode2.put("CD", "AA");

        kode2.put("DA", "CA");
        kode2.put("DB", "BB");
        kode2.put("DC", "CB");
        kode2.put("DD", "BD");

        Scanner input = new Scanner (System.in);
        String kode = input.next();
        String hasil1 = "";
        String hasil2 = "";

        for (int i = 0; i <= kode.length() - 1 ; i += 2) {
            String subStr = kode.substring(i, i + 2);
            for (String code : kode2.keySet()) {
                if (subStr.equals(code)) hasil1 += kode2.get(code);           
            }
        }

        
        for (int i = 0; i <= hasil1.length() - 1 ; i += 2) {
            String subStr = hasil1.substring(i, i + 2);
            for (String code : kode1.keySet()) {
                if (subStr.equals(code)) hasil2 += kode1.get(code);           
            }
        }
        System.out.println(hasil2);

    }
}