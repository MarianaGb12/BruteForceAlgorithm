package fuerzabruta;

public class FuerzaBruta {

   

        public static void main (String[] args){
             int [][] P = {
			{ 2,  7}, { 4, 13}, { 5,  7}, {10,  5},
			{13,  9}, {15,  5}, {17,  7}, {19, 10},
			{22,  7}, {25, 10}, {29, 14}, {30,  2}
		};
             int i=3;
             int j=5;
             double d= distance(P,i,j);
             System.out.printf("Distancia: %.12f" , d);
             
             
        }
        
        public static double distance(int [][]P, int i, int j){
            int x1= P[i][0];
            int y1=P[i][1];
            
            int x2= P[j][0];
            int y2=P[j][1];
            
            double d = (x2 - x1) * (x2 - x1) +(y2 - y1) * (y2 - y1);
            
        return d;
        }
        
       
}
