package br.com.estudo.locadora.models;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Usuario {
    Scanner insereSenha = new Scanner(System.in);
    private String usuario;
    private String senha;
    private String email;
    private boolean admin;

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public void verificaUsuario(String usuario){
        if (this.usuario.equals("Guilherme")) {
            this.admin = true;
        } else {
            this.admin = false;
        }
    }

    public void verificaSenha(String senha) {
        if (this.senha.equals("Gui312025!")) {
            System.out.println("Usuario admin");
            this.admin = true;
        } else {
            System.out.println("Usuario reconhecido");
            this.admin = false;
        }
    }

    public void trocaSenha() {
        System.out.println("Informe a nova senha");
        String novaSenha1 = insereSenha.nextLine();
        System.out.println("Confirme a nova senha");
        String novaSenha2 = insereSenha.nextLine();
        if (novaSenha1.equals(novaSenha2)) {
            setSenha(novaSenha2);
            System.out.println("Senha alterada com sucesso!!");
        } else {
            System.out.println("A senhas são diferentes");
        }
    }

}
