package dk.ns.series;

public class Episode {
    private int num ;
    private String titre;
    private int nbMinutes ;

    public Episode(int numero, String titre, int nbMinutes) {
        this.num = numero;
        this.titre = titre;
        this.nbMinutes = nbMinutes;
    }

    public int getNum() {
		return num;
	}

	public void setNumero(int num) {
		this.num = num;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public int getNbMinutes() {
		return nbMinutes;
	}

	public void setNbMinutes(int nbMinutes) {
		this.nbMinutes = nbMinutes;
	}

	public String toString() {
		return "Episode [num=" + num + ", titre=" + titre + ", nbMinutes=" + nbMinutes + "]";
	}


}
