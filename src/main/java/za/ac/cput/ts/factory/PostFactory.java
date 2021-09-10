package za.ac.cput.ts.factory;

import za.ac.cput.ts.entity.Post;

public class PostFactory {

    public static Post buildPost(
            int postId,
            int studentNo,
            String firstName,
            String lastName,
            String email,
            String institution,
            String major,
            String subject) {

        return new Post.Builder()
                .setPostId(postId)
                .setStudentNo(studentNo)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setInstitution(institution)
                .setMajor(major)
                .setSubject(subject)
                .build();
    }

}
