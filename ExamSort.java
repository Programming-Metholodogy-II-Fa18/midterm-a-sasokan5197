
public class ExamSort {
	
	
	void merge(int ar[], int l, int m, int r){
		
		int n1=m-l+1;
		int n2=r-m;
		
		int L[]= new int[n1];
		int R[]= new int[n2];
		
		
		for(int i=0;i<n1;i++)
			L[i]=ar[l+i];
		for(int j=0;j<n2;j++)
			R[j]=ar[j+m+1];
		
		
		
		int i=0;
		int j=0;
		int k=l;
		
		
		while( i< n1 && j<n2){
			if(L[i]<=R[j]){
			ar[k]=L[i];
			i++;
			}
			else{
			ar[k]=R[j];
			j++;
			}
			k++;
			
		}
			
		while(i<n1){
			
			ar[k]=L[i];
			i++;
			k++;
			
		}
		
		while(j<n2){
			
			ar[k]=R[j];
			j++;
			k++;
			
		}	
		
	}	
		
		void sort(int ar[], int l, int r)
		{
			
			
			if (l<r){
				int m= (l+r)/2;
				sort(ar,l,m);
				sort(ar,m+1,r);
				merge(ar,l,m,r);
		
		}
		
		}
	
	
	 static void printarray(int ar[] ){
		
		
		int n =ar.length;
		for(int i=0;i<n;i++)
		System.out.print(ar[i]+"  ");
		
	}
	
	public static void main(String args[]){
		int ar[]={15,9,60,44,12,4};
		int n=ar.length;
		ExamSort yes= new ExamSort();
		yes.sort(ar, 0, n-1);
		printarray(ar);
		
		
		
	}
	
		

}
