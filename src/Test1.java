import java.util.Arrays;

public class Test1 {
    private String name, schoolName;
    private int age;
    private char gender, grade;

    public String getName() {
        return name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAge(int age) {
        if (age >= 5 && age <= 90) {
            this.age = age;
        }
    }

    public void setGender(char gender) {
        if ((gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f')) {
            this.gender = gender;
        }
    }

    public void setGrade(char grade) {
        if (Arrays.asList('A', 'B', 'C', 'D', 'F').contains(grade))
            this.grade = grade;
    }

    public Test1(String name, String schoolName, int age, char gender, char grade) {
       setAge(age);
       setGender(gender);
       setName(name);
       setGrade(grade);
       setSchoolName(schoolName);

    }
    public void study(){
        System.out.println(name+" is studying "+ schoolName);
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                '}';
    }

}
/*
1. Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at least encapsulate two fields manually)
                    requirments:
                        1. age should not be set less than 5 or greater than 90
                        2. gender should not be set to any chanarcter other than: 'M' and 'F'
                        3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */
