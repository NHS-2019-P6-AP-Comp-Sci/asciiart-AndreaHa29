/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void Skewer() {
		 System.out.println("             o ");
		 System.out.println("             | ");
		 System.out.println("             | ");
	}
	
	public static void Bun() {
		 System.out.println("    ___________________ ");
		 System.out.println("   ( ' ' '  '   ' ' '  )");
		 System.out.println("  ( '      '    '    '  )");
		 System.out.println("   (_'___'___'__'_'__'_)");
	
	}
	public static void Meat() {
		System.out.println("   _____________________  ");
		System.out.println("  (_____________________)  ");
			} 
	public static void Lettuce() {
		System.out.println(" <vWWvWWVWVWVVWWVWVWVWVWV>  ");

			} 
	public static void CheeseBun() {
		System.out.println("  (  ',           ,'    ) ");
		System.out.println("  (____',       ,'______)");
		System.out.println("         ',   ,' ");
		System.out.println("           '.'   ");
			} 
	
    public static void main(String[] args) {
    	Skewer();
    	Bun();
    	Lettuce();
    	Meat();
    	CheeseBun();
        Lettuce();
        Lettuce();
        Meat();
        Lettuce();
        Meat();
        CheeseBun();
        System.out.println("This is a double cheese burger with a sandwich skewer at the top to keep it together");
    }
    
}