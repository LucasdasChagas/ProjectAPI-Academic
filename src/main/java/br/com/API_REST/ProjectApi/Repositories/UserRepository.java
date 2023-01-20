package br.com.API_REST.ProjectApi.Repositories;

import br.com.API_REST.ProjectApi.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface UserRepository extends JpaRepository<User,Long> {


}
