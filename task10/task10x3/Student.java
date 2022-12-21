package task10x3;

public class Student {
    String name;
    String surname;
    int speciality;
    int course;
    int group;
    int score;

    public Student(String name, String surname, int speciality, int course, int group, int score)
    {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSecondName(String surname) {
        this.surname = surname;
    }
    public void setSpeciality(int speciality) {
        this.speciality = speciality;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public void setGroup(int group) {
        this.group = group;
    }
    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public int getSpeciality() {
        return speciality;
    }
    public int getCourse() {
        return course;
    }
    public int getGroup() {
        return group;
    }
    public int getScore() {
        return score;
    }

    public String toString()
    {
        return name + " " + surname + ", специальность: " + speciality + ",  курс: " + course + ",  группа: " + group + ", баллы: " + score;
    }
}