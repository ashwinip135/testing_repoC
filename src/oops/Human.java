package oops;

public class Human {

		String name;
		int age;
		static String country;
		static int pin; 
		static int i=10;
		void speak(String content) {
			System.out.println( name + ": " + content);
		}
			
			void happybirthday() {
				age ++;
				System.out.println("Happy BDay" + " " + name);
				if(age == 18);{
				System.out.println("congrts today you become adult category");
				}
			}
		
		}




