package cm.day06.dom;

import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		run2();
	}
/*@Test
	public  void run() {
		int j=0;
	
		// TODO Auto-generated method stub
		for (int i = 1; i <=20; i++) {
			j+=i;
		}

		System.out.println(j);
	}*/

public static void run2(){
	String str="http://www.baidu.com";
	String[] ns = str.split("[.]");
//	String  [] na= new String[ns.length ] ;
	for (int i = 0; i < (ns.length)/2; i++) {
		 String temp=ns[i];
		 ns[i]=ns[ns.length-1-i];
		 ns[ns.length-1-i]=temp;
	}
	System.out.println(str);
	System.out.println(Arrays.toString(ns).substring(1, Arrays.toString(ns).length()-1).replace(',', '.'));
}


}
