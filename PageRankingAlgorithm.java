import java.util.*;
public class PageRankingAlgorithm {
	public static int path[][]=new int[10][10];
	public static double pagerank[]=new double[100];
	
	//
	public static void main(String[] args) {
		//
		int nodes,i,j,cost;
		System.out.println("Enter the number of nodes");
		Scanner sc=new Scanner(System.in);
		nodes=sc.nextInt();
		for(i=1;i<=nodes;i++)
		{
			for(j=1;j<=nodes;j++)
			{
				path[i][j]=sc.nextInt();
				if(i==j)
					path[i][j]=0;
			}
		}
		calc(nodes);
	}
public static void  calc(double n) {
		//double n=double(nodes);
		double init;
		double c=0;
		double temp[]=new double[10];
		int i,j,k=1,u=1;
		init=1/n;
		System.out.println("n value:"+n+"    init value"+init+"\n");
		for(i=1;i<=n;i++)
		{
			pagerank[i]=init;
		}
		System.out.println("Initial Pagerank values are: \n");
		for(i=1;i<=n;i++)
		{
			System.out.println("  Pagerank of "+i+"    is   "+pagerank[i]);
		}
		while(u<=4)
		   {
		    for(i=1;i<=n;i++)
		       {  temp[i]=pagerank[i];
		          pagerank[i]=0;
		       }
		    
		    for(j=1;j<=n;j++)
		        for(i=1;i<=n;i++)
		           if(path[i][j] == 1)
		           {  
		        	   k=1;c=0; 
		               while(k<=n)
		               {
		                   if( path[i][k] == 1 )
		                   c=c+1;
		                   k=k+1;
		               } 
		              pagerank[j] = pagerank[j] + temp[i]*( 1/c );    
		           }
		    
		    System.out.printf("\n After "+ u +"th Step \n");
		    for( i=1; i<=n; i++ ) 
		        System.out.printf(" Page Rank of "+ i +" is :\t" + pagerank[i] + "\n"); 
		    u=u+1;
		    
		    } 
	}
}
