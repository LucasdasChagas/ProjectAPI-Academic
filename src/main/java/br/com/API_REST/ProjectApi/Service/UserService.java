package br.com.API_REST.ProjectApi.Service;

import br.com.API_REST.ProjectApi.Domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByLogin(Long id);
}
