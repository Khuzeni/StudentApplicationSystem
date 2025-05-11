package domain;

public class ApplicationStatus {
    private String statusId;
    private String studentId;
    private String status;
    private String decisionDate;
    private String comments;

    //CONSTRUCTOR WITH ARGUMENT//
    private ApplicationStatus(Builder builder) {
        this.statusId = builder.statusId;
        this.studentId = builder.studentId;
        this.status = builder.status;
        this.decisionDate = builder.decisionDate;
        this.comments = builder.comments;
    }

    //GET ALL THE GETTERS
    public String getStatusId() { return statusId; }
    public String getStudentId() { return studentId; }
    public String getStatus() { return status; }
    public String getDecisionDate() { return decisionDate; }
    public String getComments() { return comments; }

    //LET'S GET BUILDING
    public static class Builder {
        private String statusId;
        private String studentId;
        private String status;
        private String decisionDate;
        private String comments;

    //SET ALL THE SETTERS
    public Builder setStatusId(String statusId) { this.statusId = statusId; return this; }
    public Builder setStudentId(String studentId) { this.studentId = studentId; return this; }
    public Builder setStatus(String status) { this.status = status; return this; }
    public Builder setDecisionDate(String decisionDate) { this.decisionDate = decisionDate; return this; }
    public Builder setComments(String comments) { this.comments = comments; return this; }

    //EXECUTE THE BUILD
    public ApplicationStatus build() {return new ApplicationStatus(this);}
    }
}
