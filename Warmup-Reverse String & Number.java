import java.util.*;

class GFG {
    
    public static String ReverseUsingCharArray(String s)
    {
       char[] ch=s.toCharArray();
	    int i=0,j=ch.length-1;
	    while(i<j)
	    {
	        char t=ch[i];
	        ch[i]=ch[j];
	        ch[j]=t;
	        
	        i++;
	        j--;
	    }
	    return new String(ch);
    }
    
    public static int ReverseForNumber(int integer)
    {
       int n=integer,reverse=0;
       while(n!=0)
       {
           int rem=n%10;
           reverse+=n*10;
           n=n/10;
       }
       return reverse;
    }
    
    public static StringBuilder ReverseUsingStringBuilder(String s)
    {
       	StringBuilder str=new StringBuilder(s);
       	return str.reverse();
    }
  
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		
		String s=in.nextLine();
	    int number=in.nextInt();
	    
		System.out.println(ReverseUsingCharArray(s));
		
		System.out.println(ReverseForNumber(number));
	
		System.out.println(ReverseUsingStringBuilder(s));
		
	}
}
