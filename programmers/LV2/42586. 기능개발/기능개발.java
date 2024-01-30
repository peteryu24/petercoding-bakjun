import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		Queue<Integer> deployQueue = new LinkedList<>();
		int progressesLength = progresses.length;
		
		for (int i = 0; i < progressesLength; i++) {
			int dueDate = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
			deployQueue.offer(dueDate);
		}

		ArrayList<Integer> deployCntPerDay = new ArrayList<>();
		while (!deployQueue.isEmpty()) {
			int headDueDate = deployQueue.poll();
			int features = 1;

			while (!deployQueue.isEmpty() && deployQueue.peek() <= headDueDate) {
				deployQueue.poll();
				features++;
			}

			deployCntPerDay.add(features);
		}

		int[] answer = new int[deployCntPerDay.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = deployCntPerDay.get(i);
		}
		return answer; 
	}
}
