package com.api.rest.user.registration.dto;

import com.api.rest.user.registration.model.Status;
import com.api.rest.user.registration.model.User;

public record UserListingDto(Long id, String username, String email, Status status) {

    public UserListingDto(User user) { //construtor
        this(user.getId(), user.getUsername(), user.getEmail(), user.getStatus());
    }
}
//Com a classe UserListingDto, consigo fitrar os dados que quero exibir,
// protegendo dados sensiveis como senhas dos usuarios.
//Poupando tambem, tempo de processamento.