package me.zkingofkill.restapiexample.resource;

import java.util.List;

import me.zkingofkill.restapiexample.model.User;
import me.zkingofkill.restapiexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "/api")
public class UserResource {

    @Autowired
    @NotNull
    private UserRepository repository;

    @GetMapping("/usuarios")
    public List<User> list() {
        return repository.findAll();
    }

    @GetMapping("/usuario/get/{id}")
    public User searchUser(@PathVariable(value = "id") long id) {
        return repository.findById(id);
    }

    @PostMapping("/usuario/post")
    public User saveUser(@RequestBody User usuario) {
        return repository.save(usuario);

    }

    @DeleteMapping("/usuario/delete/{id}")
    public void deleteUser(@PathVariable(value = "id") long id) {
        repository.deleteById(id);

    }

    @PutMapping("/usuario/put")
    public User updateUser(@RequestBody User usuario) {
        return repository.save(usuario);

    }
}
