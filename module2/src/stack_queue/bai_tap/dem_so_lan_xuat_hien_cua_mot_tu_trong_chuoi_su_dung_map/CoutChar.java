package stack_queue.bai_tap.dem_so_lan_xuat_hien_cua_mot_tu_trong_chuoi_su_dung_map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class CoutChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chuoi ky tu: ");
        String inputString = scanner.nextLine().toLowerCase();
        TreeMap<Character, Integer> myMap = getCharacterInTreeMap(inputString);
        Set<Character> freqKey = myMap.keySet();//Duyệt phần tử không trùng lặp
        for(Character key : freqKey){
            System.out.println("Tan so xuat hien cua ky tu "+ key + " la " + myMap.get(key));
        }
    }
    public static TreeMap<Character, Integer> getCharacterInTreeMap(String inputString){
        Character eachCharacter;
        int freq;
        //freq: tần số
        TreeMap<Character, Integer> myMap = new TreeMap<Character, Integer>();
        for (int i = 0; i < inputString.length(); i++){
            eachCharacter = inputString.charAt(i);
            //lấy ra ký tự thứ i
            if (eachCharacter != ' '){
                if (myMap.containsKey(eachCharacter)){
                    freq = myMap.get(eachCharacter);
                    freq++;
                }
                else{
                    freq = 1;
                }
                myMap.put(eachCharacter, freq);
            }
        }
        return myMap;
    }
}
