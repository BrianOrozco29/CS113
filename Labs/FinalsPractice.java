package labs;

public class FinalsPractice {
	public int[] eStatistics(String[] names){
		int[] stats = new int[names.length];
		
		for(int i = 0; i<=names.length; i++){
			int count = 0;
			for(int k=0; k<=names[i].length(); k++){
				if(names[i].charAt(k) == 'e'){
					count++;
				}
			}
			stats[i] = count;
		}
		return stats;
	}
}
