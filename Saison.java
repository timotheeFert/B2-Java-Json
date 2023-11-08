package dk.ns.series;
import java.util.ArrayList;
import java.util.List;

public class Saison {
    private int num ;
    private int anneeSortie ;
    List<Episode> episodes = new ArrayList<>();

    public Saison(int num, int anneeSortie) {
        this.num = num;
        this.anneeSortie = anneeSortie;
    }

    public int getNum(){
        return this.num ;
    }

    public void setNum(int num){
        this.num = num ; 
    }

    public int getAnneeSortie(){
        return this.anneeSortie ;
    }

    public void setAnneeSortie(int anneeSortie){
        this.anneeSortie = anneeSortie ;
    }

    public List<Episode> getEpisodes(){
        return episodes ;
    }

    public void ajouterEpisode(Episode episode){
        episodes.add(episode);
    }


    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            ", anneeSortie='" + getAnneeSortie() + "'" +
            "}";
    }
    


}
