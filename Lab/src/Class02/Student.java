package Class02;

public class Student {
    public String name;
    public String id;
    public double cgpa;
    public int creditsCompleted;

    public int addTheoryCredits(){
        creditsCompleted = creditsCompleted +3;
        return addTheoryCredits();
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.addTheoryCredits());
    }
}

