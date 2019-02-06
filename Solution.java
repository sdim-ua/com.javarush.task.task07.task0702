import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        
        for (int i = 0; i < 8; i++){
             String s = reader.readLine();
            str[i] = s;
        }
        
        for (int k = 0; k < str.length ; k++){
        int j =  str.length - k - 1;
        System.out.println(str[j]);
        }
        
    }
}
