public class Pattern13 {
    public static void main(String[] args) 
    {
		int i, j, k = 0; 
		//Scanner sc = new Scanner(System.in);
		
                int n=6;
        for (i = 1; i <= n; i++)  
        { 
            
            for (j = i; j < n; j++)  
                System.out.print(" "); 
                while (k != (2 * i - 1)) 
                { 
                    if (k == 0 || k == 2 * i - 2) 
                        System.out.print((char)(i+64) + " "); 
                    else
                        System.out.print(" "); 
                    k++; 
                    
                } 
                k = 0; 
                System.out.println();  
        } 
       
    
        for (i = n-1; i >= 1; i--)  
            { 
                
                for (j = i; j < n; j++)  
                    System.out.print(" "); 
                    while (k != (2 * i - 1)) 
                    { 
                        if (k == 0 || k == 2 * i - 2) 
                            System.out.print((char)(i+64) + " "); 
                        else
                            System.out.print(" "); 
                        k++; 
                        
                    } 
                    k = 0; 
                    System.out.println();  
            } 
        
        }
    }

