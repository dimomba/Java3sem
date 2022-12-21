package task9x3;

public class Student {
    int score;
    String name;

    public Student(int score, String name)
    {
        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString()
    {
        return name + ", score: " + score;
    }
}