package za.ac.cput.ts.service;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.ts.entity.Post;
import za.ac.cput.ts.repository.IPostRepository;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private IPostRepository postRepository;

    public Post create(Post post){
        return this.postRepository.save(post);
    }

    public Post read(int id) {
        return this.postRepository.getById(id);
    }

    public Post update(Post post) {
        return this.postRepository.save(post);
    }

    public void delete(int id) {
        this.postRepository.deleteById(id);
    }

    public boolean checkExists(int id) {
        return this.postRepository.existsById(id);
    }

}
