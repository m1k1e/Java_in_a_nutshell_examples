
/*
Этот класс представляет прямоугольник. Его поля представляют координаты
углов этого прямоугольника. Его методы определяют операции,
которые могут осуществляться с объектами Rectangle
Пример взят из книги Java in a nutshell
by Devid Flagan
*/

public class Rectangle{
	//Поля класса
	public int x1, y1, x2, y2;

	/*
    Метод Rect - главный конструктор класса. Он просто использует
    свои аргументы для инициализации полей нового объекта.
	*/

public Rectangle(int x1, int y1, int x2, int y2){
	this.x1 = x1;
	this.y1 = y1;
	this.x2 = x2;
	this.y2 = y2;
}	

	/*
		Это еще один конструктор. Вместо координат высота и ширина
	*/
public Rectangle(int width, int height){
	this(0, 0, width, height);
}

	/*
	Еще один конструктор без параметров
	*/
public Rectangle(){ this(0,0,0,0); }

	//Перемещение прямоугольника на заданное расстояние
public void move(int deltax, int deltay){
	x1 += deltax; x2 += deltax;
	y1 += deltay; y2 += deltay;
}

	//Проверка находится ли точка внутри треугольника
public boolean isInside(int x, int y){
	return ((x >= x1) && (x <= x2) && (y >= y1) && (y <= y2));
} 
	/*
	Метод объединяет два треугольника и возвращает меньший 
	треугольник содержащий оба треугольника.
	*/
public Rectangle union(Rectangle r){
	return new Rectangle((this.x1 < r.x1) ? this.x1 : r.x1,
						 (this.y1 < r.y1) ? this.y1 : r.y1,
						 (this.x2 < r.x2) ? this.x2 : r.x2,
						 (this.y2 < r.y2) ? this.y2 : r.y2);
}

	/*
	Возвращаем пересечение прямоугольника с другим, т.е.
	область их наложения
	*/
public Rectangle intersection(Rectangle r){
	return new Rectangle((this.x1 > r.x1) ? this.x1 : r.x1,
						 (this.y1 > r.y1) ? this.y1 : r.y1,
						 (this.x2 < r.x2) ? this.x2 : r.x2,
						 (this.y2 < r.y2) ? this.y2 : r.y2);
	if (result.x1 > result.x2) {result.x1 = result.x2 = 0;}
	if (result.y1 > result.y2) {result.y1 = result.y2 = 0;}
	return result;
}

	/*
	Метод нашего базового класса Object. Замещение этого метода,
	чтобы объекты класса Rectangle можно осмысленно преобразовать
	в строки, складывать с другими строками при помощи оператора 
	и передавать таким методам, как System.out.println()
	*/
public String toString(){
		return "[" + x1 + "," + y1 + ";" + x2 + "," + y2 + "]";
	}

}