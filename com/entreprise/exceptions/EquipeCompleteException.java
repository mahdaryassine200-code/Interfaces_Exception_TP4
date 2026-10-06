package com.entreprise.exceptions;

// exception non verifiee
public class EquipeCompleteException extends RuntimeException {

    public EquipeCompleteException(int capacite) {
        super("équipe complète (capacité : " + capacite + ")");
    }
}
