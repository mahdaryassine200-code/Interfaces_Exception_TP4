package com.entreprise.app;

import com.entreprise.compta.Facture;

public class DecouverteExceptions {

    public static void main(String[] args) {

        try {
            double[] primes = new double[3];
            primes[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            double m = Double.parseDouble("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            Facture f = null;
            f.getMontantAPayer();
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        }

        try {
            int partParPersonne = 9000 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass().getSimpleName() + " : " + e.getMessage());
        } finally {
            System.out.println("Fin des essais");
        }

        /*
         * Avec 9000.0 / 0, plus d'exception : le resultat est Infinity.
         * La division est faite avec des nombres de type double.
         *
         * Regle sur l'ordre des catch : un catch specifique doit etre
         * place avant un catch plus general, sinon le catch specifique
         * devient inaccessible.
         */
    }
}
