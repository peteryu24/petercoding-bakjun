import java.util.HashMap;

class Solution {
	public boolean solution(String[] phoneNum) {
		HashMap<String, Integer> phoneBook = new HashMap<>();
		
		int phoneNumTotalLength = phoneNum.length;
		
		for (int i = 0; i < phoneNumTotalLength; i++) // ["119", "97674223", "1195524421"]
			phoneBook.put(phoneNum[i], i);
		// key: "119", value: 0
		// key: "97674223", value: 1
		// key: "1195524421", value: 2

		// reason for data being in key -> cuz it's faster
		// value is not really important here		
		
		for (int i = 0; i < phoneNumTotalLength; i++) {
			
			int phoneNumItemLength = phoneNum[i].length();
			
			for (int j = 0; j < phoneNumItemLength; j++) {
				if (phoneBook.containsKey(phoneNum[i].substring(0, j)))
					// i = 2 => 1195524421
					// j = 3 => 119
					// phoneBook.containsKey(119)	
					return false;
			}
		}
		return true;
	}
}
