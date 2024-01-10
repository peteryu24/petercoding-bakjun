import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
	public String[] solution(String[][] tickets) {
		boolean[] vistedFlag = new boolean[tickets.length]; // 방문 여부 체크
		ArrayList<String> possibleRoutes = new ArrayList<>(); // 가능한 모든 경로들

		Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1])); // 시작 전 정렬(알파벳 순)
		dfs("ICN", "ICN", tickets, 0, vistedFlag, possibleRoutes); // ICN에서 시작하는 DFS

		Collections.sort(possibleRoutes); // 알파벳 순 정렬
		return possibleRoutes.get(0).split(" "); // 첫번째 경로 배열로 반환
	}

	private void dfs(String currentAirport, String stackedRoute, String[][] tickets, int currentLegnth, boolean[] vistedFlag,
			List<String> possibleRoutes) {
		int ticketslength = tickets.length;

		if (currentLegnth == ticketslength) { // 끝까지 탐색 완료 (모든 티켓 사용)
			possibleRoutes.add(stackedRoute);
			return;
		}

		for (int i = 0; i < ticketslength; i++) {
			if (currentAirport.equals(tickets[i][0]) && !vistedFlag[i]) { // 출발지가 일치하고, 아직 방문하지 않았다면
				vistedFlag[i] = true;
				dfs(tickets[i][1], stackedRoute + " " + tickets[i][1], tickets, currentLegnth + 1, vistedFlag, possibleRoutes); // 재귀함수
				vistedFlag[i] = false;
			}
		}
	}

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[][] tickets1 = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };
		String[][] tickets2 = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };

		System.out.println(Arrays.toString(sol.solution(tickets1))); // ["ICN", "JFK", "HND", "IAD"]
		System.out.println(Arrays.toString(sol.solution(tickets2))); // ["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]
	}
}

/*
 * [ICN, JFK, HND, IAD] 
 * [ICN, ATL, ICN, SFO, ATL, SFO] 
 */
