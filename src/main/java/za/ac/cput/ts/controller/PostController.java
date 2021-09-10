package za.ac.cput.ts.controller;

import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.ts.entity.Post;
import za.ac.cput.ts.service.PostService;

@RequestMapping("/ts/api/post")
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/")
    public String h() {
        return "create - read{id} - update - delete{id}";
    }

    @PostMapping("/create")
    public Post createPost(@RequestBody Post post) {
        Post cp = new Post.Builder().copy(post).build();
        return this.postService.create(cp);
    }

    @GetMapping("/read/{id}")
    public Post getPost(@PathVariable int id) {
        return this.postService.read(id);
    }

    @PutMapping("/update")
    public Post updatePost(@RequestBody Post post) {
        Post up = new Post.Builder().copy(post).build();
        return this.postService.update(up);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePost(@PathVariable int id) {
        this.postService.delete(id);
        return this.postService.checkExists(id);

    }

}
