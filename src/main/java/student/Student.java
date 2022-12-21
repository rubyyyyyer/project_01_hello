package student;

public class Student {
    String id;
    String name;
    int math;
    int english;
    char grading;

    public Student(String name,int math,int english){
        this.name = name;
        this.math = math;
        this.english = english;
    }

    public char getGrading() {
        grading = 'F';
        switch (getAverage() / 10) {
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        return grading;
    }

    public int highest(){
        return (math>english)?math:english;
    }

    public int getAverage(){
        return (math+english)/2;
    }
    public void print(){
        System.out.println(name + "\t" + math + "\t" + english + "\t" + (math+english)/2);
    }

}
