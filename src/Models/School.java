package Models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < members.size(); i++) {
            sb.append(i + 1).append(". ").append(members.get(i)).append("\n");
        }

        return sb.toString();
    }


}
