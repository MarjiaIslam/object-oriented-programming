package class4.practice;

import java.util.Scanner;

public class CricketWorldCup {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Team[] teamArray = new Team[n];

        for(int i = 0; i< teamArray.length; i++){
            String cntr = sc.nextLine();
            String cap = sc.nextLine();

            Team t = new Team(cntr,cap);
            teamArray[i] = t;
        }
    }
}

class Team{
    private String country;
    private String captainName;
    private int point;
    private int totalMatches;

    public Team(String country, String captainName) {
        this.country = country;
        this.captainName = captainName;
    }

    public void updateResult(int result){
        //0 = no result,1 = win, 2 =loss
        if(result == 1){
            this.point += 3;
            this.totalMatches += 1;
        }else if(result == 2 || result == 0){
            this.totalMatches += 1;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getTotalMatches() {
        return totalMatches;
    }

    public void setTotalMatches(int totalMatches) {
        this.totalMatches = totalMatches;
    }
}

class Match{

    private Team teamA;
    private Team teamB;

    public Match(Team teamA, Team teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public void updateResult(int runsA, int runsB){
        if(runsB > runsA){
            teamB.updateResult(1);
            teamA.updateResult(2);
        }else if(runsB < runsA){
            teamB.updateResult(2);
            teamA.updateResult(1);
        }else {
            teamB.updateResult(0);
            teamA.updateResult(0);
        }
    }


    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }
}
