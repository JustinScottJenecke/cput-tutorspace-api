package za.ac.cput.ts.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.ts.entity.Post;
import za.ac.cput.ts.service.PostService;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/ts/api/post/create")
    public Post createPost(@RequestBody Post post) {
        Post cp = new Post.Builder().copy(post).build();
        return this.postService.create(cp);
    }

    @GetMapping("/ts/api/post/read/{id}")
    public Post getPost(@PathVariable int id) {
        return this.postService.read(id);
    }

    @PutMapping("/ts/api/post/update")
    public Post updatePost(@RequestBody Post post) {
        Post up = new Post.Builder().copy(post).build();
        return this.postService.update(up);
    }

    @DeleteMapping("/ts/api/post/delete/{id}")
    public boolean deletePost(@PathVariable int id) {
        this.postService.delete(id);
        return this.postService.checkExists(id);

    }

}
