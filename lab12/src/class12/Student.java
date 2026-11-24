package class12;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "<" +
                "id:" + id +
                ", name:'" + name + '\'' +
                '>';
    }


    @Override
    public int compareTo(Student s) {
        //ASC on id
//        if(this.id < s.id) return -1;
//        else if (this.id > s.id)  return 1;
//        else return 0;

        return -1 * this.name.compareTo(s.name); //DESC on name
    }
}
