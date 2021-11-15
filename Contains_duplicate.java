package geekster;

public class Contains_duplicate {
	
	public static void main(String []args) {
		int arr[]= {1,2,4,3,1};
		int n=arr.length;
		System.out.println(duplicate(arr,n));
		
	}
	
	static boolean duplicate(int arr[], int n) {
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		}
		return false;
	}

}
