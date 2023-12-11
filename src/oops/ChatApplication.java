package oops;

public class ChatApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
              Human h1 = new Human();
              h1.name ="Ashwini";
              h1.age =15;
         
              Human h2 = new Human();
              h2.name ="Sanjay";
              h2.age =24;
              
              Human h3 = new Human();
              h3.name ="Seeta";
              
              
              
             // System.out.println(h3.name);
              
               
              h1.speak("Hello");
              h2.speak("I am fine");
              //System.out.println(h1.age);
              h1.happybirthday();
              System.out.println(h1.age);
              
	}

}
