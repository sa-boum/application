package exo2;

public class Test {

	public static void main(String[] args) {
		Point a=new Point(5,2);
		Point b=new Point(3,2);
		Segment s=new Segment(a,b);
		s.affiche();
		System.out.println(s.longueur());
		s.deplaceOrigine(2, 1);
		s.affiche();
		s.deplaceExtremite(2, 2);
		s.affiche();
		
		

	}

}

class Point{
	public Point(double x,double y) {
		this.x=x;
		this.y=y;
	}
	public void deplace(double dx,double dy) {
		x+=dx;
		y+=dy;
	}
	public void affiche() {
		 System.out.println ("coordonnees = " + x + " " + y +"\n") ;
	}
	public double getX() {
		return this.x;
		
	}
	public double getY() {
		return this.y;
	}
	private double x;
	private double y;
}

class Segment{
	private Point A;
	private Point B;
	
	public Segment(Point origine, Point extremite) {
		A=new Point(origine.getX(),origine.getY());
		B=new Point(extremite.getX(),extremite.getY());
		
	}
	public Segment(double xOr,double yOr,double xExt,double yExt) {
		A=new Point(xOr,yOr);
		B=new Point(xExt,yExt);
	}
	public double longueur() {
		double d1=(Math.pow(B.getX()-A.getX(), 2)) + (Math.pow(B.getY()-A.getY(), 2));
		double k=Math.sqrt(d1);
		return k;
		
				
	}
	public void deplaceOrigine(double dx,double dy){
		A.deplace(dx,dy);
	}
	public void deplaceExtremite(double dx,double dy) {
		B.deplace(dx,dy);
	}
	public void affiche() {
		System.out.println("L'origine: ");
		A.affiche();
		System.out.println("L'extremite: ");
		B.affiche();
	}
	
}

class dernier {
>>>>>>> login
    
}