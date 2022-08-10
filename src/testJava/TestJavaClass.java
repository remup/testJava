package testJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,5,9,0,1};
		int intSize = arr.length;
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i =0;i<arr.length;i++) {
			list.add(arr[i]);
			//System.out.println(arr[i]);
			
		}
		
		sort(arr,intSize);
		for(int i =0;i<arr.length;i++) {
			
			System.out.println("forloopsort "+arr[i]);
			
		}
		
		list.stream().sorted((a,b)->a.compareTo(b)).forEach((d)->System.out.println("java8 sort "+d));
		
		HashMap<String, Integer> domainNames = new HashMap<>();
		  domainNames.put("google.com", 10);
		  domainNames.put("chat.google.com", 30);
		  domainNames.put("xyz.com", 30);
		  domainNames.put("chat.xyz.com", 30);
		  domainNames.put("ayz.com", 30);
		  domainNames.put("htg.in", 40);
		  HashMap<String, Integer> domainNames2 = new HashMap<>();
		  domainNames.forEach((key,value)->
		  {
			  String name =key;
			  String splitArr[]=name.split("\\.");
			  int count=value;
			  String temp="";
			  for(int i=splitArr.length-1;i>=0;i--) {
				  
				  if(temp.length()==0) {
					  temp="";
				  }
				  else
					  temp="."+temp;
				 
				  temp=splitArr[i]+temp;
				  System.out.println(temp);
				  domainNames2.put(temp,domainNames2.getOrDefault(temp, 0) +count);
				  }
			  
			  
		  }
		  
		  );
		  
		  domainNames2.forEach((key,value)->{System.out.println("new domain  "+key+"  "+value);});
		
	}
	
	private static  void sort(int[] arr, int n) {
		int temp = 0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}}
		}
	}
	
	

}
