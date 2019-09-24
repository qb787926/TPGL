public class Orange{

	private double prix;
	private String origine;
	
	public static void main (String[]args){
		Orange o1= new Orange(1.20,"Argentine");
		System.out.println(o1.getPrix());
		System.out.println(o1.getOrigine());
		System.out.println("On test");
		System.out.println("On test encore");
	}
	
	public Orange(double p, String o){
	
	if(p<0)
		this.prix=0.12;
	else
		this.prix=p;
		
	this.origine=o;
	}
	
	public double getPrix(){return this.prix;}
	public String getOrigine(){return this.origine;}
	
}
