package br.com.API_REST.ProjectApi.Dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserDTO(
        @NotBlank
        String name,

        @NotBlank
        String password,

        @NotBlank
        @Email
        String email
) {


}
