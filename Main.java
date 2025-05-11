package App;

import domain.ApplicationStatus;
import domain.StudentApplication;


public class Main {
    public static <AccommodationApplication> void main(String[] args) {
        //Student Application sample using the Builder
        StudentApplication studentApp = new StudentApplication.Builder()
                .setStudentId("S12345")
                .setName("Dumisane")
                .setSurname("Zikalala")
                .setEmail("dumisane@gmail.com")
                .setAverageMark(75.5)
                .setCurrentCampus("Cape Town Campus")
                .setStatus("PENDING")
                .build();

        //Displaying the sample
        System.out.println("Student ID: " + studentApp.getStudentId());
        System.out.println("Name: " + studentApp.getName() + " " + studentApp.getSurname());
        System.out.println("Email: " + studentApp.getEmail());
        System.out.println("Average Mark: " + studentApp.getAverageMark());
        System.out.println("Preferred Campus: " + studentApp.getCurrentCampus());
        System.out.println("Status: " + studentApp.getStatus());


        ApplicationStatus status = new ApplicationStatus.Builder()
                .setStatusId("STAT001")
                .setStudentId("STD123")
                .setStatus("Pending")
                .setDecisionDate("2025-05-10")
                .setComments("Awaiting final results")
                .build();

        System.out.println("Status: " + status.getStatus() + " for student " + status.getStudentId());


    }
}
