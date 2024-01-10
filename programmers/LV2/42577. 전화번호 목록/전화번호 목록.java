import java.util.HashSet;

class Solution {
	public boolean solution(String[] phoneBook) {
		HashSet<String> phoneSet = new HashSet<>();

		int phoneBookLength = phoneBook.length;
		for (int i = 0; i < phoneBookLength; i++) {
			phoneSet.add(phoneBook[i]);
		}

		for (int i = 0; i < phoneBookLength; i++) {
			int phoneBookItemLength = phoneBook[i].length();
			for (int j = 1; j < phoneBookItemLength; j++) {
				if (phoneSet.contains(phoneBook[i].substring(0, i))) {
					return false;
				}
			}
		}
		return true;
	}
}
