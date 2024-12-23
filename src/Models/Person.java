package Models;

public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;
    private boolean gender;

    public Person(String name, String surname, int age, boolean gender) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
    }

    @Override
    public int compareTo(Person o) {
        return surname.compareToIgnoreCase(o.surname);
    }

    public String getGenderString() {
        return gender ? "male" : "female";
    }

    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + "-year-old " + getGenderString() + ".";
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public boolean getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}
