import java.util.ArrayList;
public class nov27arraylist{

	public static ArrayList combine(ArrayList<Integer> list1, ArrayList<Integer> list2){
		for(int i=0; i<list2.size(); i++){
				list1.add(list2.get(i));
		}
		return list1;
	}


	public static void main (String[]args){
	ArrayList<Integer> list1= new ArrayList<>();
	ArrayList<Integer> list2= new ArrayList<>();

	for(int i=0; i<10; i++){
		list1.add((int)(Math.random()*9)+1);
		list2.add((int)(Math.random()*9)+1);
	}

	System.out.println(combine(list1, list2));


	}
}