package domain;

public class StudentApplication {

    private final String studentId;
    private final String name;
    private final String surname;
    private final String email;
    private final double averageMark;
    private final String currentCampus;
    private final String status;

    //The default constructor
    //private StudentApplication() {}

    //The argument constructor
    private StudentApplication(Builder builder) {
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.email = builder.email;
        this.averageMark = builder.averageMark;
        this.currentCampus = builder.currentCampus;
        this.status = builder.status;
    }

    //GET THE GETTERS//
    //StudentID
    public String getStudentId() {
        return studentId;
    }

    //name
    public String getName() {
        return name;
    }

    //surname
    public String getSurname() {
        return surname;
    }

    //email
    public String getEmail() {
        return email;
    }

    //averageMark
    public double getAverageMark() {
        return averageMark;
    }

    //currentCampus
    public String getCurrentCampus() {
        return currentCampus;
    }

    //status
    public String getStatus() {
        return status;
    }

    //DATABASE SETTERS
    public void setStudentId(String studentId) {}
    public void setName(String name) {}
    public void setSurname(String surname) {}
    public void setEmail(String email) {}
    public void setAverageMark(double averageMark) {}
    public void setCurrentCampus(String currentCampus) {}
    public void setStatus(String status) {}


    //BUILDER CLASS//
    public static class Builder {
        private String studentId;
        private String name;
        private String surname;
        private String email;
        private double averageMark;
        private String currentCampus;
        private String status;

        //SET THE SETTERS//
        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAverageMark(double averageMark) {
            this.averageMark = averageMark;
            return this;
        }

        public Builder setCurrentCampus(String currentCampus) {
            this.currentCampus = currentCampus;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }


        public StudentApplication build() {
            return new StudentApplication(this);
        }
    }
}