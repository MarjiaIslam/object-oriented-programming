package p1;

import java.util.Scanner;

public class CricketWorldCup {
    //This is where we simulate the world cup
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the number of teams:");
        int n = sc.nextInt();
        Team[] teams = new Team[n+1];//adjusting for indexing

        System.out.println("Now Insert Team name and captains name for each team");
        sc.nextLine();
        for(int i = 1; i < teams.length; i++){
            String name = sc.nextLine();
            String cap = sc.nextLine();
            teams[i] = new Team(name, cap);
        }
        System.out.println("Please Enter the number of matches:");
        int m = sc.nextInt();
        System.out.println("Enter Match Data in each line:");
        for (int i = 1; i<=m; i++){
            int team1 = sc.nextInt();//first team no
            int team2 = sc.nextInt();//second team no
            int runs1 = sc.nextInt();//runs scored by team1
            int runs2 = sc.nextInt();//runs scored by team2
            //create a new match with teams from team array
            Match match = new Match(teams[team1], teams[team2]);
            match.updateResult(runs1, runs2);

        }
        //finally print the points table
        printPointTable(teams);

    }

    public static void printPointTable(Team[] teams){
        System.out.println("-----------Points Table------------");
        System.out.println("Team Name | Captain Name | Total Matches | Points");
        for (int i = 1; i<teams.length; i++) {
            Team t = teams[i];
            System.out.println(t.getCountry() + " | " +t.getCaptainName()+
                    " | "+t.getTotalMatches()+ " | "+t.getPoints());
        }
    }
}

class Team {
    private String country;
    private String captainName;
    private int points;
    private int totalMatches;

    //points and number of matches set to zero by default.
    public Team(String country, String captainName) {
        this.country = country;
        this.captainName = captainName;
    }

    public void updateResult(int result){
        // 0 => (No result = 0 points), 1 => (Win = 3 points), 2 =>(loss = 0 points)
        if(result == 0 || result == 2){
            totalMatches++; //number of match played increases
        } else if (result == 1) {
            totalMatches++; //number of match played increases
            points += 3; //points increases
        }
    }

    public String getCountry() {
        return country;
    }

    public String getCaptainName() {
        return captainName;
    }

    public int getPoints() {
        return points;
    }

    public int getTotalMatches() {
        return totalMatches;
    }
}

class Match {
    private Team teamA,teamB;

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void updateResult(int runsA, int runsB){
        if (runsA > runsB) {
            //team A won, team B lost
            teamA.updateResult(1);
            teamB.updateResult(2);
        } else if (runsB > runsA) {
            //team B won, team A lost
            teamA.updateResult(2);
            teamB.updateResult(1);
        } else {
            //match tied, no result
            teamA.updateResult(0);
            teamB.updateResult(0);
        }
    }

}