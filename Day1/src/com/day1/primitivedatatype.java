package com.day1;

public class primitivedatatype {

	public static void main(String[] args) {
		
		//byte takes 1 byte
		byte byteMax = 127; //1 byte = 8bit(2^8 / 2)(256 / 2 = 127)considering 0 also
		byte byteMin = -128;
		
		System.out.println("Minimum range of Byte is " + byteMin + " Maximum range of byte is " + byteMax);
		
		//short takes 2 bytes 
		short shortMax = 32767; //1 byte =8 bits*2 =16 (2^16 / 2)(65536/2 = 32767)considering 0also
		short shortMin = -32768;
		
		System.out.println("Minimum range of Short is " + shortMin + " Maximum range of Short is " + shortMax);
		
		//int = 4 bytes 
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("Minimum range of Int is " + minInt + " Maximum range of Int is " + maxInt);
		
		long maxlong = 9223372036854775807l;
		long minlong = -9223372036854775808l;
		System.out.println("Minimum range of long is " + minlong + " Maximum range of Int is " + maxlong);
		
		float f = 3234.141243278345f;
		double d = 3454.14124512345478914f;
		System.out.println("Float value is " + f + " Double value is " + d);
		
		//Boolean 
		boolean flag = false;
		System.out.println("Boolean value is " + flag);
		
		
	
	
	}

}
