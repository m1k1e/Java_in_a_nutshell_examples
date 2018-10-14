
/*
Программа должна выводить ряд чисел аналогичных ряду чисел Фибонначи, только складывать
три предыдущих числа. Вывод ряда ограничим до 20 значений.
Задача взята из книги Девида Флегана Java in a nutshell examples.
Autor Mikhail Fedorenko
*/

public class Task1_2{
	public static void main(String[] args){
		System.out.println("\n Let's go! \n");
		//System.out.println(" ");

		int n0 = 1, n1 = 1, n2 = 2, n3 = 0; //объявление и инициализация первых четырех переменных

		System.out.print(n0 + " " + n1 + " " + n2 + " "); //вывод первых трех переменных, они постоянны

		//вывод оставшихся 17 значений
		for(int i = 0; i < 17; i++){
			n3 = n2 + n1 + n0; //считаем четвертое значение
			System.out.print(n3 + " "); // выводим на экран
			n0 = n1; //смешаем значения вверх
			n1 = n2; //снова складываем и
			n2 = n3; //выводим на экран
		}

		System.out.println(" ");
		System.out.println("\n The End! \n");//конец программы

	}
}