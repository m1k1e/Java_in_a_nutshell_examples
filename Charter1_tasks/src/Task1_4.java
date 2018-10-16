import java.io.*;
/*
Программа должна считывать в интерактивном режиме
вводимые пользователем строки и печатает их в
обратном порядке. Прокрамма завершается, когда
пользователь введет "tiuq".
Задача взята из книги Дэвида Флегана Java in a nutshell examples.
Author Mikhail Fedorenko.
*/

public class Task1_4{
	public static void main(String[] args) throws IOException {
		System.out.println("\n");
		System.out.println("Let's go! \n");

		//Создаем объект для чтения вводимых пользователем данных
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//бесконечный цикл
		for(;;){
          System.out.print("Введите текст(tiuq = выход): > ");  //печать подсказки
          String text = br.readLine();            //чтение строки
          //Если пользователь набрал "tiuq" выходим из цикла
          if(text.equals("tiuq")){ 
          	break;}

          //Создаем объект StringBuffer
          StringBuffer buf = new StringBuffer(text);
          //вывод в обратном порядке
          for(int i = buf.length()-1; i>=0; i--){
          	System.out.print("Вы ввели: " + buf.charAt(i));
          }
          break;

		}
		
		System.out.println("\n");
		System.out.println("The End!");
	}
	
}