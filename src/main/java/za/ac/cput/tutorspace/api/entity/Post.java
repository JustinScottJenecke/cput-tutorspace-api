package za.ac.cput.tutorspace.api.entity;

public class Post {

    private int postId;
    private int studentNo;
    private String firstName, lastName, email, institution, major, subject;

    protected Post() {
    }

    private Post(Builder b) {
        this.postId = b.postId;
        this.studentNo = b.studentNo;
        this.firstName = b.firstName;
        this.lastName = b.lastName;
        this.email = b.email;
        this.institution = b.institution;
        this.major = b.major;
        this.subject = b.subject;
    }

    public int getPostId() {
        return postId;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getInstitution() {
        return institution;
    }

    public String getMajor() {
        return major;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postId=" + postId +
                ", studentNo=" + studentNo +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", institution='" + institution + '\'' +
                ", major='" + major + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }

    public class Builder {

        private int postId;
        private int studentNo;
        private String firstName, lastName, email, institution, major, subject;

        public Builder setPostId(int postId) {
            this.postId = postId;
            return this;
        }

        public Builder setStudentNo(int studentNo) {
            this.studentNo = studentNo;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setInstitution(String institution) {
            this.institution = institution;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder copy(Post p) {
            this.postId = p.postId;
            this.studentNo = p.studentNo;
            this.firstName = p.firstName;
            this.lastName = p.lastName;
            this.email = p.email;
            this.institution = p.institution;
            this.major = p.major;
            this.subject = p.subject;
            return this;
        }

        public Post build() {
            return new Post(this);
        }
    }

}
