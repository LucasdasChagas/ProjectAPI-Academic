package br.com.API_REST.ProjectApi.Service.IMPL;

import br.com.API_REST.ProjectApi.Domain.User;
import br.com.API_REST.ProjectApi.Repositories.UserRepository;
import br.com.API_REST.ProjectApi.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserServiceImplements implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public User findByLogin(Long id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElse(null);
    }
}
