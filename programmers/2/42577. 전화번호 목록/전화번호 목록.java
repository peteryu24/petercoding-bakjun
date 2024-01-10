import java.util.HashMap;

class Solution {
	public boolean solution(String[] phoneNum) {
		HashMap<String, Integer> phoneBook = new HashMap<>();

		for (int i = 0; i < phoneNum.length; i++)
			phoneBook.put(phoneNum[i], i);

		for (int i = 0; i < phoneNum.length; i++)
			for (int j = 0; j < phoneNum[i].length(); j++)
				if (phoneBook.containsKey(phoneNum[i].substring(0, j)))
					return false;

		return true;
	}
}
