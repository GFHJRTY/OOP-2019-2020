package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  

        Cat topcat = new Cat();
        topcat.speak();
		
		int MAX = topcat.getNumLives();
		
		for(int i=0;i<=MAX;i++){
			
			topcat.kill();
			
		}
    }
}