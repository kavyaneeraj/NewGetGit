package org.phone;

public class InternalStorage 
{
		public void processorName() 
		{
			System.out.println("Processor Name : xyz");
		}
		public void ramSize()
		{
			System.out.println("Ram size : 4 Gb");
		}
		public static void main(String[] args) 
		{
			InternalStorage a=new InternalStorage();
			a.processorName();
			a.ramSize();
			
			ExternalStorage b = new ExternalStorage();
			b.size();
			
		}
}
