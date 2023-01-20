package br.com.API_REST.ProjectApi.Controller;

import br.com.API_REST.ProjectApi.Domain.User;
import br.com.API_REST.ProjectApi.Dtos.UserDTO;
import br.com.API_REST.ProjectApi.Repositories.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid UserDTO dados){
        var usuario = new User(dados);

        repository.save(usuario);
        return ResponseEntity.ok().build();
    }

}
