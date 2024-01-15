package JAVA_240112.OOP;

public interface Dog {
	public static final String color = "빨강";
	public abstract void bite();
	public abstract void eat();
	public abstract void ppuzik();
	public default void wolk() {
		System.out.println("산책해줄계");
	}
}
