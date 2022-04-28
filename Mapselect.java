import java.util.ArrayList;
import java.util.List;
public class Mapselect {
    public int count=1;
  
    private int v;
    static int[] intArray = new int[100];
  
    private ArrayList<Integer>[] adjList;
 
   
    public Mapselect(int vertices)
    {
 
        this.v = vertices;
 
  
        initAdjList();
    }
 
   
    private void initAdjList()
    {
        adjList = new ArrayList[v];
 
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
 
  
    public void addEdge(int u, int v)
    {
       
        adjList[u].add(v);
    }
 
    public void printAllPaths(int s, int d,int c,String dn,int stop)
    {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
 
        pathList.add(s);
 
        printAllPathsUtil(s, d, isVisited, pathList,c,dn,stop);
    }
 

    private void printAllPathsUtil(Integer u, Integer d,
                                   boolean[] isVisited,
                                   List<Integer> localPathList,int c,String dn,int stop)
    {
 
        if (u.equals(d)) {
         
           
            int index=0;
            for(Integer number:localPathList)
            {
            	if(number==stop)
            	{
            		if(count==c)
            		{
            		for(Integer number1:localPathList)
            		{
            		
                    	intArray[index++]=number1;

            		}
            		}
            		count=count+1;
            	}
            	
            	
            
            
           }
           
            return;
        }
 
     
        isVisited[u] = true;
 
    
        for (Integer i : adjList[u]) {
            if (!isVisited[i]) {
            
                localPathList.add(i);
                printAllPathsUtil(i, d, isVisited, localPathList,c,dn,stop);
 
                localPathList.remove(i);
            }
        }
 
       
        isVisited[u] = false;
    }
 
 
    public static void checkroute(int s,int d,int c,String dn,int stop)
    {
    	 Mapselect g = new Mapselect(18);

         g.addEdge(0,1);
         g.addEdge(0,4);
         g.addEdge(1,2);
         g.addEdge(2,3);
         g.addEdge(3,5);
         g.addEdge(5,6);
         g.addEdge(5,8);
         g.addEdge(4,9);
         g.addEdge(9,10);
         g.addEdge(9,11);
         g.addEdge(8,10);
         g.addEdge(9,5);
         g.addEdge(8,7);
         g.addEdge(6,7);
         g.addEdge(7,10);
         g.addEdge(10,11);
         g.addEdge(7,12);
         g.addEdge(10,14);
         g.addEdge(10,12);
         g.addEdge(12,14);
         g.addEdge(12,13);
         g.addEdge(12,15);
         g.addEdge(12,16);
         g.addEdge(15,16);
         g.addEdge(15,17);
         g.addEdge(1,0);
         g.addEdge(4,0);
         g.addEdge(2,1);
         g.addEdge(3,2);
         g.addEdge(5,3);
         g.addEdge(6,5);
         g.addEdge(8,5);
         g.addEdge(9,4);
         g.addEdge(10,9);
         g.addEdge(11,9);
         g.addEdge(10,8);
         g.addEdge(5,9);
         g.addEdge(7,8);
         g.addEdge(7,6);
         g.addEdge(10,7);
         g.addEdge(11,10);
         g.addEdge(2,7);
         g.addEdge(14,10);
         g.addEdge(12,10);
         g.addEdge(14,12);
         g.addEdge(13,12);
         g.addEdge(15,12);
         g.addEdge(16,12);
         g.addEdge(16,15);
         g.addEdge(17,15);
 
        g.printAllPaths(s, d,c,dn,stop);
        Drivercselect ds=new Drivercselect();
    	ds.select(c,intArray,dn);
    }
}

