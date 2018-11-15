/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package h1;
import java.util.*;
/**
 *
 * @author Work-US
 */
public class H1 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        boolean flag=false;
        String st = sc.nextLine();
         for (String counter : st.split(" ")) {
            i++;
         }
         Integer[] arr = new Integer[i];
         i=0;
            for (String num : st.split(" ")) {
            arr[i]=Integer.valueOf(num);
            i++;
         }
         SortedSet<Integer> treeSet = new TreeSet<Integer>();
         Set<Integer> set = new HashSet<>();
          for (Integer inp : arr){
              if (inp>0)
              set.add(inp);
              else
                  flag=true;
          }
          i=0;
          for (Integer inp : set) {
              treeSet.add(inp);
              i++;
          }
          
          int t;
          if(i!=0){
              t=treeSet.first();
              if(t!=1){
                      System.out.println("1");
                       System.exit(0);
                      
              }
          }
          else
              t=1;
          treeSet.remove(t);
            for (Integer inp : treeSet){
                i=inp;       
                if (++t!=inp)
                    break;   
                else
                    t=inp; 
            }
            if (t==i)
                t++;

System.out.println(t);
    }
    
}
