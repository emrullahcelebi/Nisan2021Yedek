package day_05;

import java.util.ArrayList;
import java.util.List;

public class Question01 {
	/*
     * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
	public static void main(String[] args) {
		
		
		String arr1[]= {"John","Brad","Ange","Sofia","Emily"};
		String arr2[]={"sofia","brad","grace","emily","hazel"};
		
		List<String> list=new ArrayList<>();
		
		
		for(String each:arr1) {
			for(String each2:arr2) {
				if(each.equalsIgnoreCase(each2)) {
					list.add(each);
				}
			}
			
		}
		System.out.print(list);
	}

}
