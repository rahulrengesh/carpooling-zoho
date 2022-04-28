
import java.util.*;
  
class Shortmap 
{
    static int[]a=new int[10];
    static int j=1;
    
    static class Graph 
    {
        int V; 
        Vector<Integer>[] adj;  
  
        static int level;
  
    
        Graph(int V)
        {
            this.V = V;
            this.adj = new Vector[2 * V];
  
            for (int i = 0; i < 2 * V; i++)
                this.adj[i] = new Vector<>();
        }
  
    
        public void addEdge(int v, int w, int weight)
        {
  
            if (weight == 2) 
            {
                adj[v].add(v + this.V);
                adj[v + this.V].add(w);
            } else 
                adj[v].add(w); 
        }
  
     
        public int printShortestPath(int[] parent, int s, int d)
        {
            level = 0;
  
      
            if (parent[s] == -1)
            {
             
                return level;
            }
  
            printShortestPath(parent, parent[s], d);
  
            level++;
            if (s < this.V )
            {
                a[j]=s;
                j=j+1;
            }
            return level;
        }
  
        public int findShortestPath(int src, int dest)
        {
            boolean[] visited = new boolean[2 * this.V];
            int[] parent = new int[2 * this.V];
  
           
            for (int i = 0; i < 2 * this.V; i++) 
            {
                visited[i] = false;
                parent[i] = -1;
            }
  
            Queue<Integer> queue = new LinkedList<>();
  
       
            visited[src] = true;
            queue.add(src);
  
            while (!queue.isEmpty()) 
            {
  
                
                int s = queue.peek();
  
                if (s == dest)
                    return printShortestPath(parent, s, dest);
                queue.poll();
  
                for (int i : this.adj[s]) 
                {
                    if (!visited[i]) 
                    {
                        visited[i] = true;
                        queue.add(i);
                        parent[i] = s;
                    }
                }
            }
            return 0;
        }
    }
  
    
    public static void display(int src,int dest)
    {
  
        int V = 18;
        Graph g = new Graph(V);
        g.addEdge(0,1,2);
        g.addEdge(0,4,1);
        g.addEdge(1,2,2);
        g.addEdge(2,3,1);
        g.addEdge(3,5,2);
        g.addEdge(5,6,1);
        g.addEdge(5,8,2);
        g.addEdge(4,9,1);
        g.addEdge(9,10,1);
        g.addEdge(9,11,2);
        g.addEdge(8,10,2);
        g.addEdge(9,5,1);
        g.addEdge(8,7,1);
        g.addEdge(6,7,1);
        g.addEdge(7,10,2);
        g.addEdge(10,11,2);
        g.addEdge(7,12,1);
        g.addEdge(10,14,2);
        g.addEdge(10,12,1);
        g.addEdge(12,14,2);
        g.addEdge(12,13,1);
        g.addEdge(12,15,1);
        g.addEdge(12,16,2);
        g.addEdge(15,16,1);
        g.addEdge(15,17,1);
        g.addEdge(1,0,2);
        g.addEdge(4,0,1);
        g.addEdge(2,1,2);
        g.addEdge(3,2,1);
        g.addEdge(5,3,2);
        g.addEdge(6,5,1);
        g.addEdge(8,5,2);
        g.addEdge(9,4,1);
        g.addEdge(10,9,1);
        g.addEdge(11,9,2);
        g.addEdge(10,8,2);
        g.addEdge(5,9,1);
        g.addEdge(7,8,1);
        g.addEdge(7,6,1);
        g.addEdge(10,7,2);
        g.addEdge(11,10,2);
        g.addEdge(12,7,1);
        g.addEdge(14,10,2);
        g.addEdge(12,10,1);
        g.addEdge(14,12,2);
        g.addEdge(13,12,1);
        g.addEdge(15,12,1);
        g.addEdge(16,12,2);
        g.addEdge(16,15,1);
        g.addEdge(17,15,1);
        a[0]=src;
        System.out.println();
        Keytostring kts=new Keytostring();
        g.findShortestPath(src, dest);
        for(int i=0;i<j;i++)
        {
        	kts.convert(a[i]);
            System.out.print("-->");
        }
        System.out.println();
    }
    public static void finalize(int src,int dest,String dname)
    {
    	Drivercselect ds=new Drivercselect();
    	ds.select(0,a,dname);
    }
}
