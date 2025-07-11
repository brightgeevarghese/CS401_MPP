package lesson12.annottaion_demo;

@BugReport(assignedTo = "John", severity = 3)
public class BadCode {
    public int add(int a, int b) {
        return a - b;
    }
}
