import java.util.Scanner;
import java.util.Arrays;


/*
Приложение должно сортировать 100 чисел типа float. Затем предлагает пользователю ввести
число и отображает соседнее с ним большее и меньшее числа. Для поиска позиции программа
должна использовать алгоритм двоичного поиска.
Задача взята из книги Дэвида Флегана Java in a nutshell examples.
Author Mikhail Fedorenko.
*/


public class Task1_5{
	//Заполнение массива случайными значениями
    public static void fillarray(float[] arr){
    	for(int i=0; i < arr.length; i++){
    		arr[i] = (float)Math.random()*1000;
    	}

    }
    //Сортировка массива методом пузырька(простой перебор значений)
    public static void sortarray(float[] arr){
    	
    	for(int i=0; i < arr.length; i++){
    		int min = i;
    		for(int j = i; j<arr.length; j++){
    			if(arr[j]<arr[min]) min = j;
    		}

    		float tmp;
    		tmp = arr[i];
    		arr[i] = arr[min];
    		arr[min] = tmp;
    	}

    }



	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("Let's go! \n");

		float[] flarray = new float[100];  //создаем экземпляр массива
        fillarray(flarray); //заполняем массив
        sortarray(flarray); //сортируем массив
        
        //вывод значений массива
        for(int i=0; i < flarray.length; i++){
        	System.out.print(flarray[i] + "; ");
        }

        System.out.println("\n");

        float num = 0.0f;

        Scanner sc =  new Scanner(System.in);
        //Предлагаем пользователю ввести число
        try{
        	System.out.println("> Введите вещественное число(0.0 - 1000.0): ");
        	num = sc.nextFloat();

        }catch(Exception e){
        	System.out.println("Ошибка ввода!!!"); //если это не число или число не вещественное - ошибка!
        }

        
        int intResult = Arrays.binarySearch(flarray, num); //находим индекс значения в массиве
        if(intResult > 0){
        	System.out.println("Результат бинарного поиска " + flarray[intResult-1] + " и " + flarray[intResult+1]); //вывод соседних значений
        }else
        System.out.println("Такого числа в массиве нет! " + intResult);
        

        


		System.out.println("\n");
		System.out.println("The End!");
	}
	
}