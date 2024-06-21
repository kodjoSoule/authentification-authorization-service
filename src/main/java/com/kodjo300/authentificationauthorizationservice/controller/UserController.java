package com.kodjo300.authentificationauthorizationservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    //Liste des utilisateurs
    @GetMapping("/admin/users")
    public String getAllUsers() {
        return "Liste des utilisateurs";
    }

    //Ajouter un utilisateur
    @GetMapping("/admin/users/add")
    public String addUser() {
        return "Ajouter un utilisateur";
    }

    //Modifier un utilisateur
    @GetMapping("/admin/users/update")
    public String updateUser() {
        return "Modifier un utilisateur";
    }
    //Supprimer un utilisateur
    @GetMapping("/admin/users/delete")
    public String deleteUser() {
        return "Supprimer un utilisateur";
    }
    //Rechercher un utilisateur
    @GetMapping("/admin/users/search")
    public String searchUser() {
        return "Rechercher un utilisateur";
    }
    //Rechercher un utilisateur par son ID
    @GetMapping("/admin/users/search/id")
    public String searchUserById() {
        return "Rechercher un utilisateur par son ID";
    }
    //Rechercher un utilisateur par son email
    @GetMapping("/admin/users/search/email")
    public String searchUserByEmail() {
        return "Rechercher un utilisateur par son email";
    }
    //Rechercher un utilisateur par son nom
    @GetMapping("/admin/users/search/lastname")
    public String searchUserByLastName() {
        return "Rechercher un utilisateur par son nom";
    }
    //Rechercher un utilisateur par son prénom
    @GetMapping("/admin/users/search/firstname")
    public String searchUserByFirstName() {
        return "Rechercher un utilisateur par son prénom";
    }
    //Rechercher un utilisateur par son numéro de téléphone
    @GetMapping("/admin/users/search/phone")
    public String searchUserByPhone() {
        return "Rechercher un utilisateur par son numéro de téléphone";
    }
    //Rechercher un utilisateur par son adresse
    @GetMapping("/admin/users/search/address")
    public String searchUserByAddress() {
        return "Rechercher un utilisateur par son adresse";
    }

}
