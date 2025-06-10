/* Repo: java-festa-ferragnez
State lavorando col servizio di sicurezza dei Ferragnez e il vostro compito è di assicurarvi che accedano alla festa solo gli invitati presenti sulla lista (in fondo al post)

Creare un progetto java-festa-ferragnez con il package com.ferragnez.party, a cui aggiungere la classe CheckGuest

Nel programma occorre:
- creare e inizializzare l’array contenente i nomi degli invitati
- chiedere all’utente come si chiama
- verificare che il nome sia presente nella lista
- lasciarlo entrare o rispedirlo cortesemente da dove è venuto

Bonus
se avete usato il ciclo for per cercare il nome nella lista nella consegna base, implementare lo stesso programma usando il ciclo while, e viceversa

Lista invitati: 
Dua Lipa, Paris Hilton, Manuel Agnelli, J-Ax, Francesco Totti, Ilary Blasi, Bebe Vio, Luis, Pardis Zarei, Martina Maccherone, Rachel Zeilic */

package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner inputUtente = new Scanner(System.in);


        // creare e inizializzare l’array contenente i nomi degli invitati
        String[] arrayInvitati = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
                "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

        // chiedere all’utente come si chiama
        System.out.println("Inserisci il tuo nome: ");
        String nomeUtente = inputUtente.nextLine();
        inputUtente.close();

        //System.out.println(nome);

        // verificare che il nome sia presente nella lista
    /*     boolean isNameFound = false;
        int index = 0;

        while(!isNameFound && index < arrayInvitati.length){
            if(arrayInvitati[index].equals(nomeUtente)){
                isNameFound = true;
            }
            index++;
        } */

            boolean isNameFound = false;
                                //uso !isNameFound && ... al posto di break;
            for (int index = 0; !isNameFound && index < arrayInvitati.length; index++){
                                    //.toLoweCase().trim() per trasformare la string in lowerCase e trimmare gli spazzi
                if(arrayInvitati[index].toLowerCase().trim().equals(nomeUtente.toLowerCase().trim())){
                    isNameFound = true;
                    //break; //con break esco dal ciclo e smetto di iterare una volta trovato il nome
                }
               // System.out.println(arrayInvitati[index]);
            }


            // lasciarlo entrare o rispedirlo cortesemente da dove è venuto

            if (isNameFound){
                System.out.println("Benvenuto alla festa:" + " " + nomeUtente);
            } else {
                System.out.println("Il nome non e nella lista, smamma");
            }
         
    }

}
