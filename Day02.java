import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Day02 {

    Integer jumlah(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[1] = 1;
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        ArrayList<String> Cars = new ArrayList<>();
        Cars.add("Supra");
        Cars.add("mercedes");
        Cars.add("Honda");

        for(int i = 0; i < Cars.size(); i++){
            System.out.println(Cars.get(i));
        }

        Cars.set(0, "Supra bapak");
        for(String i : Cars){
            System.out.println(i);
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(5);

        Integer total = 0;
        for(int i = 0; i < numbers.size(); i++){
            total += numbers.get(i);
        }

        String nEscapeString = "Pembekalan\nJava";
        System.out.println(nEscapeString);
        String tEscapeString = "Pembekalan\tJava";
        System.out.println(tEscapeString);
        String escapeString = "\"Testing is test\"";
        System.out.println(escapeString);

        //Looping string
        String cobaDulu = "Aku adalah kamu";
        // char[] arrayChar = cobaDulu.toCharArray();
        String reverseString = "";
        for(int i = 0; i < cobaDulu.length(); i++){
            reverseString += cobaDulu.charAt(cobaDulu.length() - 1 - i);
        }
        System.out.println(reverseString);
        
        String str = "Pembekalan";
        String newStr = str.concat(" Java");
        System.out.println("Nilai dari variable str adalah " + newStr);

        String str1 = "Hello";
        String str2 = "HELLO";

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Case Insensitive Equals");
        }
        else{
            System.out.println("Case Insensitive Not Equals");
        }

        if(str1.equals(str2)){
            System.out.println("Case Sensitive Equals");
        }
        else{
            System.out.println("Case Sensitive Not Equals");
        }

        char[] testing = {'a', 'b', 'c', 'd'};
        Integer intTesting = 20;
        String result = String.valueOf(testing);
        String intResult = String.valueOf(intTesting);
        System.out.println(result);
        System.out.println(intResult);

        String gigi = "teeth";
        System.out.println(gigi.replace('e', 'o'));
        char[] gigiChar = gigi.toCharArray();
        gigiChar[gigi.indexOf('e')] = 'o';
        System.out.println(String.valueOf(gigiChar));
        
        String xsis = "PT. Xsis Mitra Utama 123456789 !@#$%^&*()";
        String result1 = xsis.replaceAll("[^A-Za-z\s]", "test");
        String result2 = xsis.replaceAll("[^A-Za-z\s]+", "test");
        String result3 = xsis.replaceAll("[A-Za-z\s]", "test");
        String result4 = xsis.replaceAll("[A-Za-z\s]+", "test");
        String result5 = xsis.replaceAll("[A-Z&&[A-G]]", "coba");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        ArrayList<String> laptop = new ArrayList<>();
        laptop.add("acer");
        laptop.add("msi");
        laptop.add("lenovo");
        System.out.println(String.valueOf(laptop));

        Map<String, String> response = new HashMap<>();
        response.put("status", "200");
        response.put("message", "success");
        response.put("data", "asus");
        System.out.println(String.valueOf(response));

        Day02 day02 = new Day02();
        System.out.println(day02.jumlah(1, 2));
    };
}