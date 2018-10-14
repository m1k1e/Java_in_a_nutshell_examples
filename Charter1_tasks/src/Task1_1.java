//package charter1.tasks;

/*
Программа считает от 1 до 15, выводит каждое 
число на экран и затем стидает в обратном 
направлении, через два числа, до 1 выводя 
каждое число на экран.
Задача взята из книги Java in a nutshell
by Devid Flagan
Autor Mikhail Fedorenko 
*/

public class Task1_1 {
	public static void main(String[] args){

		System.out.println("Let's go!");

		for(int i=1; i<=15; i++){
			System.out.print(i + " ");
		}

		System.out.println(" ");

		for(int i=15; i>=1; i-=2){
			System.out.print(i + " ");
		}

		System.out.println("\nThe end!");

	}

}