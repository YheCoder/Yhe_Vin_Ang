
	import java.util.*;

	public class Number {
		public static void main (String [] args){
			
			int [] a = {51, 1, 2, 7, 8 , 9, 13, 2, 14, 2,52, 33, 7};
			calculate(a);
			}
			
			
			public static void calculate(int [] a){
				
				Map<Integer, ArrayList<Integer>> m = new HashMap<>();
				ArrayList<Integer> FreqArray = new ArrayList<Integer>();
				
				for(int i = 0; i < a.length; i++){
					
					if(m.get(a[i]) == null) {m.put(a[i], new ArrayList<Integer>());}
					
						m.get(a[i]).add(i+1);
											
					}
				Set set = m.entrySet();
				Iterator i = set.iterator();
				while(i.hasNext()){
					Map.Entry me = (Map.Entry)i.next();
					System.out.print(me.getKey() + "::");
					System.out.print((m.get(me.getKey())).size() + "::" + me.getValue() + "\n");	
									
					}	
				
				}
		
		}
