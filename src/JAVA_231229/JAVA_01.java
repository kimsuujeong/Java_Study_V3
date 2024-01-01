package JAVA_231229;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.swing.text.Keymap;

public class JAVA_01 {

	private static int[] keymaps(String[] keymap, String[] targets) {

		// 같은 외계 문자가 휴대폰 전체에 여러번 할당된 경우도 있고,
		// 키 하나에 같은 외계 문자가 여러번 할당된 경우도 있다.
		// 아에 할당되지 않은 경우도 있다.
		// 몇몇 외계 문자열은 작성할 수 없다.

		HashMap<Character, Integer> hm = new HashMap<>();
        int[] my_life_te_Aiur = new int[targets.length];
        
        for(String key : keymap) {
            for(int i=0 ; i<key.length() ; i++) {
                char c = key.charAt(i);
                if(!hm.containsKey(c) || i<hm.get(c)) {
                    hm.put(c, i+1);
                }
            }
        }
        
        for(int i=0 ; i<targets.length ; i++) {
            int cnt = 0;
            for(int j=0 ; j<targets[i].length() ; j++) {
                char c = targets[i].charAt(j);
                if(!hm.containsKey(c)) {
                    cnt = 0;
                    break;
                } else {
                    cnt += hm.get(c);
                }
            }
            my_life_te_Aiur[i] = cnt==0?-1:cnt;
        }
        return my_life_te_Aiur;
		// Iterator -> 컬렉션에 저장되어 있는 요소들을 순회하는 인터페이스

		// 키맵을 받은 만큼 배열을 생성해 주고, targets에 입력된 숫자를 최적의 숫자로 찾아준다.

	}

	public static void main(String[] args) {


		System.out.println(keymaps(new String[]{"XYYZ", "WXYZ"}, new String[]{"XYZ","XXYY"}));

	}

}
