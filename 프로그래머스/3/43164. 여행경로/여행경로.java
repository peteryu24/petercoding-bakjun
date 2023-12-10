import java.util.*;

public class Solution {
    public String[] solution(String[][] tickets) {
        boolean[] vistedFlag = new boolean[tickets.length];
        ArrayList<String> possibleRoutes = new ArrayList<>();

        Arrays.sort(tickets, (a, b) -> a[1].compareTo(b[1]));
        dfs("ICN", "ICN", tickets, 0, vistedFlag, possibleRoutes);

        Collections.sort(possibleRoutes);
        return possibleRoutes.get(0).split(" ");
    }

    private void dfs(String currentAirport, String stackedRoute, String[][] tickets, int currentLegnth, boolean[] vistedFlag, List<String> possibleRoutes) {
        int ticketslength = tickets.length;

        if (currentLegnth == ticketslength) {
            possibleRoutes.add(stackedRoute);
            return;
        }

        for (int i = 0; i < ticketslength; i++) {
            if (currentAirport.equals(tickets[i][0]) && !vistedFlag[i]) {
                vistedFlag[i] = true;
                dfs(tickets[i][1], stackedRoute + " " + tickets[i][1], tickets, currentLegnth + 1, vistedFlag, possibleRoutes);
                vistedFlag[i] = false;
            }
        }
    }
}
