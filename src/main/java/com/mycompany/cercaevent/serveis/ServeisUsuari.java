package com.mycompany.cercaevent.serveis;

public class ServeisUsuari {
    public static boolean existeixUsuari(String username, String password) throws Exception {   
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        else {
            throw new Exception("Usuari o contrasenya incorrectes");
        }
    }

    public static void crearUsuari (String username, String password) throws Exception {
        if (username.equals("admin") && password.equals("admin")) {
            throw new Exception("Usuari ja existeix");
        } else {
            // Crea l'usuari
        }

    }

}
