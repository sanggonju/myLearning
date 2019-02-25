package kakaoTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class KakaoOpenChatRoomTest {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String[]> answerList = new ArrayList<>();
        HashMap<String, String> keyValue= new HashMap<>();
        ArrayList<String> ss = new ArrayList<>();
        for (String s : record) {
        	String id =  "";
        	String nick =  "";
        	String message ="";
        	String[] tmp = new String[2];
			if(s.contains("Enter")) {
				id=s.substring(s.indexOf(" "),s.lastIndexOf(" ")).trim();
				nick=s.substring(s.lastIndexOf(" ")).trim();
				message= "님이 들어왔습니다.";
				tmp[0] = id;
				tmp[1] = message;
				answerList.add(tmp);
				keyValue.put(id, nick);
			}else if(s.contains("Leave")) {
				id=s.substring(s.indexOf(" ")).trim();
				nick=s.substring(s.lastIndexOf(" ")).trim();
				message= "님이 나갔습니다.";
				tmp[0] = id;
				tmp[1] = message;
				answerList.add(tmp);
			}else {
				id=s.substring(s.indexOf(" "),s.lastIndexOf(" ")).trim();
				nick=s.substring(s.lastIndexOf(" ")).trim();
				keyValue.put(id, nick);
			}
			
		}
    	for (String[] ans : answerList) {
    		ans[0] = keyValue.get(ans[0]);
    		ss.add(ans[0]+ans[1]);
    	}
        Object[] obj = ss.toArray();
        answer= Arrays.copyOf(obj,obj.length,String[].class);
        
        for (String s : answer) {
			System.out.println(s);
		}
        return answer;
    }
    
    public static void main(String[] args) {
    	KakaoOpenChatRoomTest sol = new KakaoOpenChatRoomTest();
    	String[] s = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};
    	
    	sol.solution(s);
	}
}