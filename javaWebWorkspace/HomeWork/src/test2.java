import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class test2 {
	public static void main(String[] args) {
		int[] arr = { 1, 5, 4, 2, 2, 1, 4, 5, 3, 4, 8 };
		/*
		 * HashMap<Integer, Integer> map = new HashMap<>(); int count = 0;
		 * 
		 * for(int i=0;i<arr.length;i++){
		 * 
		 * }
		 * 
		 * Set<Entry<Integer, Integer>> entrySet = map.entrySet(); for
		 * (Entry<Integer, Integer> entry : entrySet) { System.out.println("数字"
		 * + entry.getKey() + "有" + entry.getValue()+"个"); }
		 */

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}

		List<Integer> newList = new ArrayList<Integer>();

		for (Integer integer : list) {
			if (!newList.contains(integer)) {
				newList.add(integer);
			}
		}

		for (int i = 0; i < newList.size(); i++) {
			int count = 0;
			for (int j = 0; j < list.size(); j++) {
				if (newList.get(i).equals(list.get(j))) {
					count++;
				}
			}
			System.out.println("数字" + newList.get(i) + "出现了：" + count + "次");
		}
	}
}
