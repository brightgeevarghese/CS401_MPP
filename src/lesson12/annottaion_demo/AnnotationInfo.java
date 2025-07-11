package lesson12.annottaion_demo;

public class AnnotationInfo {
    public static void main(String[] args) {
        System.out.println("Annotation on bad code");
        //chek whether annotation is present for BadCode
        if (BadCode.class.isAnnotationPresent(BugReport.class)) {
            BugReport bugReport = BadCode.class.getAnnotation(BugReport.class);
            System.out.println("Assigned to: " + bugReport.assignedTo());
            System.out.println("Severity: " + bugReport.severity());
        }

        System.out.println("Annotation on more bad code");
        if (MoreBadCode.class.isAnnotationPresent(BugReport.class)) {
            BugReport bugReport = MoreBadCode.class.getAnnotation(BugReport.class);
            System.out.println("Assigned to: " + bugReport.assignedTo());
            System.out.println("Severity: " + bugReport.severity());
        }
    }
}
