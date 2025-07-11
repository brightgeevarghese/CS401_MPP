package lesson11.terminal_operations.toList_terminal;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //every primitive boolean data is automatically BOXED into Boolean wrapper class
        //False => non-defective
        //True => Defective
        List<Boolean> filesDefectiveStatus = List.of(false, true, false, true);
        //anyMatch => if any defective file, raise some alert
        boolean uploadingStatus = filesDefectiveStatus.stream()
                .anyMatch(data -> data.booleanValue());
        System.out.println("uploadingStatus : " + uploadingStatus);
        if (!uploadingStatus) {
            //Allow uploading files
            System.out.println("Uploading....");
        } else {
            //Reject
            System.out.println("Rejected!");
        }

        List<Boolean> fileStatus = List.of(false, false, false);//No defective files
        //apply allMatch (everything must be false)

        List<String> colors = List.of("red", "green", "blue", "red");
        boolean colorStatus = colors.stream()
                .anyMatch(color -> color.equals("red"));
        if (colorStatus) {
            System.out.println("It is found");
        }
    }
}
