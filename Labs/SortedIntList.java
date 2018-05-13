package labs;

public class SortedIntList extends IntList {

	public SortedIntList(int size) {
		super(size);

	}

	public void add(int value){
		if (numElements == list.length)
			 System.out.println("Can't add, list is full");
		else{
			list[numElements] = value;
			numElements++; 
		}
		
		for(int i = 0; i<numElements; i++){
			if(value < list[i]){
				for(int k = i; k < numElements; k++){
					list[k+1] = list[k];
				}
				list[i] = value;
				break;
			}
		}
	}
	
	public SortedIntList merge(SortedIntList other)
	{
		SortedIntList a = this.add(other.numElements));
		return a;
	}

}
