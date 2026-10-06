package com.entreprise.rh;

import com.entreprise.exceptions.MontantInvalideException;

// contrat d'interface
public interface Augmentable {

    double TAUX_MAX = 0.20;

    void augmenter(double taux) throws MontantInvalideException;

    // methode par defaut
    default void augmenterStandard() throws MontantInvalideException {
        augmenter(0.05);
    }
}
