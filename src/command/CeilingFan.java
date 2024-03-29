package command;

public class CeilingFan{
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0; 
	String nome;
	int speed;
	
	public CeilingFan(String nome){
		this.nome = nome;
		speed = OFF;
		System.out.println(nome + " ceiling fan is off");
	}
	
	public void high(){
		speed = HIGH;
		System.out.println(nome + " ceiling fan is high ");
	}
	
	public void medium(){
		speed = MEDIUM;
		System.out.println(nome + " ceiling fan is medium ");
	}
	
	public void low(){
		speed = LOW;
		System.out.println(nome + " ceiling fan is low ");
	}
	
	public void off(){
		System.out.println(nome + " ceiling fan is off");
	}
	
	public int getSpeed(){
		return speed;
	}
}
