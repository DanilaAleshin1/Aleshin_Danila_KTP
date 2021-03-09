public class Point3d{
	private double a, b, c;
	//конструктор инициализации
	Point3d(double a, double b, double c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	//
	//конструктор по умочанию
	Point3d()
	{
		this(0.0, 0.0, 0.0);
	}
	//

	//вывод a
	public double geta()
	{
		return a;
	}
	//

	//вывод b
	public double getb()
	{
		return b;
	}
	//

	//вывод c
	public double getc()
	{
		return c;
	}
	//

	//сравнение двух объектов
	public boolean sravn(Point3d o)
	{
		return ((this.a==o.a) && (this.b==o.b) && (this.c==o.c)) ? true:false;
	}
	//
	//вычисление расстояния между точками а и b
	public double distanceTo(Point3d o)
	{
		return Math.ceil(Math.sqrt(Math.pow((o.a-this.a), 2)+Math.pow((o.b-this.b), 2)+Math.pow((o.c-this.c), 2))*100)/100;
	}
	//

	//ввод a
	public void seta(double a)
	{
		this.a=a;
	}
	//

	//ввод b
	public void setb(double b)
	{
		this.b=b;
	}
	//
	//ввод c
	public void setc(double c)
	{
		this.c=c;
	}
	//
}