package dk.ns.series;

import java.util.ArrayList;


public class Appseries {
    public static void main(String[] args){

    	System.out.println("-------Q4-------");
    	
        List<Acteur> acteurs = new ArrayList<>() ;
		
	    acteurs.add( new Acteur( "Gambo" , "Adam") ) ;
	    acteurs.add( new Acteur( "Darboe" , "Beeman" ) ) ;
	    acteurs.add( new Acteur( "Vincente" , "TO" ) ) ;

        for ( Acteur listeActeur:acteurs) {
            System.out.println(listeActeur );
        }
        System.out.println("\n");
        
        for ( Acteur listeActeur:acteurs) {
            System.out.println(listeActeur.getNom());
        }
        System.out.println("\n");
        
        System.out.println("-------Q5-------");

        List<Serie> serieTVs = new ArrayList<>() ;

        Serie bigBangTheory = new Serie("Big Bang Theory");
        
        Saison bigBangTheorySaison1 = new Saison(1, 2007);
        bigBangTheorySaison1.ajouterEpisode(new Episode(1, "La Nouvelle Voisine des surdoués", 23));
        bigBangTheorySaison1.ajouterEpisode(new Episode(2, "Des voisins encombrants", 23));
        bigBangTheorySaison1.ajouterEpisode(new Episode(3, "Le Corollaire de pattes-de-velours", 23));
        bigBangTheorySaison1.ajouterEpisode(new Episode(4, "Les Poissons luminescents", 23));
        bigBangTheorySaison1.ajouterEpisode(new Episode(5, "Le Postulat du hamburger", 23));
        bigBangTheory.ajouterSaison(bigBangTheorySaison1);

        Saison bigBangTheorySaison2 = new Saison(2, 2008);
        bigBangTheorySaison2.ajouterEpisode(new Episode(1,"Un secret bien gardé", 23));
        bigBangTheorySaison2.ajouterEpisode(new Episode(2,"Le Flirt de Leonard", 23));
        bigBangTheorySaison2.ajouterEpisode(new Episode(3,"La Sublimation barbare", 23));
        bigBangTheory.ajouterSaison(bigBangTheorySaison2);
        
        serieTVs.add(bigBangTheory);
        
      //Série big bang Malcolm
        
        Serie malcolm = new Serie("Malcolm");
        
        Saison malcolmSaison1 = new Saison(1, 2000);
        malcolmSaison1.ajouterEpisode(new Episode(1, "Je ne suis pas un monstre", 23));
        malcolmSaison1.ajouterEpisode(new Episode(2, "Alerte rouge", 23));
        malcolmSaison1.ajouterEpisode(new Episode(3, "Seuls à la maison",23));
        malcolm.ajouterSaison(malcolmSaison1);
        
        Saison malcolmSaison2 = new Saison(2, 2001);
        
        malcolmSaison2.ajouterEpisode(new Episode(1, "Embouteillage", 23));
        malcolmSaison2.ajouterEpisode(new Episode(2, "Il n'y a pas d'heure pour Halloween",23));
        malcolm.ajouterSaison(malcolmSaison2);
        
        serieTVs.add(malcolm);
        
      //Série big bang Fromage

        Serie fromage = new Serie("Fromage");

        Saison fromageSaison1 = new Saison(1, 1524);
        
        fromageSaison1.ajouterEpisode(new Episode(1, "fromage", 33));
        fromage.ajouterSaison(fromageSaison1);
        
        serieTVs.add(fromage);
        
        //On affiche titre et nombre de saisons pour chaque série
        
        for (Serie serie : serieTVs){
            System.out.println("Titre : " + serie.getTitre());
            System.out.println("Nombre de saisons : " + serie.getSaison().size());
        }
        System.out.println("\n");
        
        //Afficher le titre et la durée de chaque épisode de la deuxième saison de la première série : 

        for (Serie serie : serieTVs){
            if(serie.getTitre().equals("Big Bang Theory")){
                for(Saison saison : serie.getSaison()){
                    if(saison.getNum() == 2){
                        System.out.println("\n\nLa saison numéro " + saison.getNum() + " est sortie en " + saison.getAnneeSortie() + "\n");
                        for (Episode episode : saison.getEpisodes()) {
                            System.out.println("Elle a comme titre : " + episode.getTitre() + " et dure : " + episode.getNbMinutes() + " min.");
                        }
                    }
                }
            }
        }

        //Afficher le titre et la durée de chaque épisode de chaque saison de la première série :

        for (Serie serieTV : serieTVs){
            if(serieTV.getTitre().equals("Big Bang Theory")){
                for(Saison saison : serieTV.getSaison()){
                    if(saison.getNum() == 1){
                        System.out.println("\n\nLa saison numéro " + saison.getNum() + " est sortie en " + saison.getAnneeSortie() + "\n");
                        for (Episode episode : saison.getEpisodes()) {
                            System.out.println("Elle a comme titre : " + episode.getTitre() + " et dure : " + episode.getNbMinutes() + " min.");
                        }
                    }
                }
            }
        }

        System.out.println("\n\n");

        //Afficher le titre et la durée de chaque épisode de chaque saison de la première série

        for (Serie serieTV : serieTVs){
            System.out.println("\nLe titre de la série est \"" + serieTV.getTitre());
            for(Saison saison : serieTV.getSaison()){
                System.out.println("\n\nLa saison numéro " + saison.getNum() + " est sortie en " + saison.getAnneeSortie() + "\n");
                for (Episode episode : saison.getEpisodes()) {
                    System.out.println("L'épisode n°" + episode.getNum() + " s'appelle : \"" + episode.getTitre() + "\" et dure : " + episode.getNbMinutes() + " min.");
                }
            }
        }

        //Afficher le titre, la durée et l’année de la saison de chaque épisode de chaque série.
    
        System.out.println("\n\n");

        for (Serie serieTV : serieTVs){
            System.out.println("\nLe titre de la série est \"" + serieTV.getTitre());
            for(Saison saison : serieTV.getSaison()){
                System.out.println("\n\nLa saison numéro " + saison.getNum() + " est sortie en " + saison.getAnneeSortie() + "\n");
                for (Episode episode : saison.getEpisodes()) {
                    System.out.println("L'épisode n°" + episode.getNum() + " s'appelle : \"" + episode.getTitre() + "\" et dure : " + episode.getNbMinutes() + " min.");
                }
            }
        }

        //Afficher le titre et la durée totale de chaque saison de la première série.

        System.out.println("\n\n");

        int dureeTotale = 0 ;
        for (Serie serieTV : serieTVs){
            if(serieTV.getTitre().equals("Big Bang Theory")){
                for(Saison saison : serieTV.getSaison()){
                    if(saison.getNum() == 1){
                        System.out.println("\n\nLa saison numéro " + saison.getNum() + " est sortie en " + saison.getAnneeSortie() + "\n");
                        for (Episode episode : saison.getEpisodes()) {
                            dureeTotale += episode.getNbMinutes();
                            System.out.println("Elle a comme titre : " + episode.getTitre() + " et dure : " + episode.getNbMinutes() + " min.");
                        }
                        System.out.println("\nLa durée totale de chaque saison de la première série est de : " + dureeTotale);
                    }
                }
            }
        }

        //Afficher le titre de l’épisode le plus long ainsi que son numéro de saison et le nom de la série.

        System.out.println("\n\n");
        
        String nomSerie = "" ;
        int numeroSaison = 0 ;
        String titre = "" ;
		int nbMinute = 0 ;
		

	    for (Serie serieTV : serieTVs){
            for(Saison saison : serieTV.getSaison()){
                for (Episode episode : saison.getEpisodes()) {
                    if(episode.getNbMinutes() > nbMinute){
                        nbMinute = episode.getNbMinutes();
		                titre = episode.getTitre();
		                numeroSaison = saison.getNum();
		                nomSerie = serieTV.getTitre();
                    }
                }
            }
        }

		System.out.println("L'épisode le plus long apartiens à la série \"" + nomSerie + "\", l'épisode est dans la saison n°" + numeroSaison + " et ce nomme \"" + titre + "\" et dure " + nbMinute + "min") ;

		System.out.println("-------Q6-------");

        List<Roles> roles = new ArrayList<>();

        roles.add(new Roles(acteurs.get(1), serieTVs.get(1), "Cooper", "Sheldon"));
		roles.add(new Roles(acteurs.get(2), serieTVs.get(2), "Wilkerson", "Malcolm"));
		roles.add(new Roles(acteurs.get(3), serieTVs.get(3), "Fromage", "Burger"));
		
        System.out.println("\n");

        for(Roles role : roles){
            System.out.println("\nNom : " + role.getNom() + "\nPrénom : " + role.getPrenom() + "\n");
        }

        //Ensuite affichons le nom et le prénom de chaque rôle ainsi que le titre de la série et le nom et le prénom de l’acteur :

        for (Roles role : roles) {
			    System.out.println("\n Série : " + role.getSerieTV().getTitre() + "\n Nom : " + role.getNom() + "\n Prénom : " + role.getPrenom() + "\n Acteur : " + role.getActeur().getNom() + " " + role.getActeur().getPrenom());
		}

        //Pour finir affichons le titre des séries dans lesquelles joue le deuxième acteur :

        Acteur acteur2 = acteurs.get(1);
	    for (Roles role : roles) {
	        if (role.getActeur().equals(acteur2)) {
	            System.out.println(role.getSerieTV().getTitre());
	        }
	    }

    }
}   
