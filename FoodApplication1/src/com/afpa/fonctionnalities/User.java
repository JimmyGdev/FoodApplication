package com.afpa.fonctionnalities;

public class User {
    private static int numberOfUsers;  //garder en mémoire le nombre d'utilisateur qui utilise l'application


    private String username;
    private String password;

    public User(){

    }


















    public static int getNumberOfUsers() {
        return numberOfUsers;
    }

    public static void setNumberOfUsers(int numberOfUsers) {
        User.numberOfUsers = numberOfUsers;
    }


}
