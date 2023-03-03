package day11;
import java.util.*;

public class HashMapLab1 {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String str1;
        Integer num;
        while(map.size()<5) {
        	System.out.printf("나라이름을 입력하세요 : ");
        	str1 = sc.next();
    		System.out.printf("인구수를 입력하세요 : ");
    		num = sc.nextInt();
    		if(map.containsKey(str1)) {
    			System.out.println("나라명 "+str1+"는 이미 저장되었습니다.");    			
    		}else {
    			map.put(str1, num);
    			System.out.println("저장되었습니다.");
    		}    		
        }
        sc.close();
        System.out.println("5개의 데이터가 모두 입력 되었습니다.");
        Set<String> keys = map.keySet();
        System.out.println(keys);
        int cnt = 1;   
        System.out.print("입력된 데이터 :");
        for(String key : keys) {
        	cnt+=1;
    	   	System.out.printf((cnt>5)?" %s(%d)":" %s(%d), ",key,map.get(key));
        }        
    }
}
