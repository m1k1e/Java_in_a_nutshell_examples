
/*
Задача написать программу, которая получает в качестве
аргументов командной строки два числа и слово-строку.
Числа указывают программе начальный символ и кол-во
символов подстроки, которое программа должна вывести
на экран. Пример
% java Substring hello 1 3 вывод: ell

Программа должна обрабатывать все исключения, обусловленные
неправильным вводом.
Задача взята из книги Дэвида Флегана Java in a nutshell examples.
Author Mikhail Fedorenko.
*/

public class Task1_3{
	public static void main(String[] args){
		System.out.println("\n");
		System.out.println("Let's go! \n");

		//определение переменных
		String word ;
        int start = 0, end = 0;

        /*Присвоение переменным значений. Значения определяются при запуске приложения
          Пример правильного запуска прилоения: java -classpath Task1_3 word start end
          */
        try {
        	word = args[0]; //присваиванивание переменной word
        	start = Integer.parseInt(args[1]);//присваиванивание переменной start
        	end = Integer.parseInt(args[2]);//присваиванивание переменной end
            

        	System.out.println(word.substring(start,end)); //вывод подстроки
        	System.out.println("Awesome! It's OK!");

        }catch(ArrayIndexOutOfBoundsException e){// неверное кол-во аргументов
        	System.out.println("Количество аргументов -  " + e.getMessage());
        	System.out.println("Пример: java -classpath Task1_3 word start end");
        	System.out.println("Где word - слово латиницей; start, end - целое число");
        	System.out.println("Разница между start и end должно быть целое число не больше кол-ва букв в word");
        }catch (StringIndexOutOfBoundsException e) {//неверный формат аргументов
        	System.out.println("Неверный формат аргументов!!!??? ");
        	System.out.println("Пример: java -classpath Task1_3 word start end");
        	System.out.println("Где word - слово латиницей; start, end - целое число");
        	System.out.println("Разница между start и end должно быть целое число не больше кол-ва букв в word");
        }catch (NumberFormatException e) {//второй или третий аргумент отрицательное число
        	System.out.println("Второй и третий аргументы целые, положительные числа!!!" + e.getMessage());
        }catch (IllegalArgumentException e) {//разница между третим и вторым отрицательное число или больше чем символов в слове
        	System.out.println("Второй и третий аргумент должны быть положительными: " + e.getMessage());
        }

		System.out.println("\n");
		System.out.println("The End!");
	}
	/*
    Что можно улучшить? Пока осталась проблема с количеством параметров больше 3-х, после
    третьего параметры игнорируются. Также не понятно как узнать, что первый аргумент слово,
    если ввести в аргументах три единицы программа работает без исключения?

	*/
}