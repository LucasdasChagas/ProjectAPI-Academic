package br.com.API_REST.ProjectApi.Controller;

import br.com.API_REST.ProjectApi.Domain.User;
import br.com.API_REST.ProjectApi.Dtos.DetailUsers;
import br.com.API_REST.ProjectApi.Dtos.UserDTO;
import br.com.API_REST.ProjectApi.Repositories.UserRepository;
import br.com.API_REST.ProjectApi.Service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository repository;
    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<DetailUsers> cadastrarUsuario(@RequestBody @Valid UserDTO dados, UriComponentsBuilder uriBuilder) {
        var usuario = new User(dados);
        repository.save(usuario);

        var URI = uriBuilder.path("/user/{id}").buildAndExpand(usuario.getId()).toUri();
        return ResponseEntity.created(URI).body(new DetailUsers(usuario));
    }

    @GetMapping
    @RequestMapping(value = "/id")
    public ResponseEntity<User> findById (@PathVariable Long id){
        return ResponseEntity.ok().body(service.findByLogin(id));
    }

}
