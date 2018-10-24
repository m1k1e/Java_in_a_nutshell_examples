
/*
Класс для тестирования класса Rectangle
*/

public class RectangleAppTest{
	public statc void main(String[] args){
		Rectangle r1 = new Rectangle(1, 1, 4, 4);
		Rectangle r2 = new Rectangle(2, 3, 5, 6);
		Rectangle u = r1.union(r2);
		Rectangle i = r2.intersection(r1);

		if (u.isInside(r2.x1, r2.y1)) {
			System.out.println("(" + r2.x1 + "," + r2.y1 + ") содержиться в объединении");
		}

		System.out.println(r1 + " union " + r2 + " = " + u);
		System.out.println(r1 + " intersect " + r2 + " = " + i)


	}
}