package JAVA_240118;

public class Entry {
	private String word;
	
	public Entry() {
		// TODO Auto-generated constructor stub
		System.out.println("***약어사전***");
	}
	Entry(String w){
		this();
		this.word = word;
		
	}
	public void writeView() {
		
		System.out.println("약어 : " + word);
		
	}
}

class SubEntry extends Entry{
	String definition;
	int year;
	
	SubEntry(String w){
	}
	SubEntry(String w, String d, int y) {
		this(w);
		this.definition = definition;
		this.year = year;
	}
	public void printView() {
		super.writeView();
		System.out.println("원어 : " + definition);
		System.out.println("시기 : " + year);
	} 
	
}

class Main{
	public static void main(String[] args) {
		SubEntry sub = new SubEntry("OOP","Object Oriented Programming", 1991);
		
		SubEntry;
		
	}
}
