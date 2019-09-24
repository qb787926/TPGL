
import java.util.ArrayList;

public class Panier{

private ArrayList<Orange> liste;
private int max;

public Panier(){
        this.liste = new ArrayList<Orange>();
        this.max=50;
        }
        
public Panier(int m){
        this.liste = new ArrayList<Orange>();
        this.max=m;
        }
        
public int getTaille(){return this.liste.size();}

public boolean estVide(){
        if(this.liste.size()==0)
                return true;
        else
                return false;
}
public boolean estPlein(){
        if(this.liste.size()==max)
                return true;
        else
                return false;
}

public boolean ajoute(Orange o){
        if(liste.size()<max){
                this.liste.add(o);
                return true;
         }
         return false;
}
public void afficher(){
        for(int i=0; i<this.liste.size();i++)
        {
                System.out.println(""+this.liste.get(i).toString());
        }
    }
    
   
public static void main (String[]args){

    Panier p = new Panier(1);
    Orange o = new Orange(1.45,"Mexique");
    Orange o2 = new Orange(1.65,"Colombie");
    
    p.ajoute(o);p.ajoute(o2);
    
    p.afficher();
    System.out.println(p.getTaille());
    System.out.println(p.estPlein());
    System.out.println(p.estVide());
   
   }

}

