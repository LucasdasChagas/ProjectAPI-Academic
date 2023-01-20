package br.com.API_REST.ProjectApi.Dtos;

import br.com.API_REST.ProjectApi.Domain.User;
import jakarta.persistence.Column;

public record DetailUsers(Long id,String name,String password,String email) {

    public DetailUsers(User user){
        this(user.getId(), user.getName(), user.getPassword(), user.getEmail());

    }
}
