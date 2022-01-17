package assignments;

public class TypeCasting {
		
		public static void main(String[] args) 
	    { 
	        String si="222";
	        int n = Integer.parseInt(si);
	        System.out.println("Conversion of String to int: "+n);//String to integer
	        
	        String sf="22.2";
	        float f=Float.parseFloat(sf);
	        System.out.println("\nConversion of String to Float: "+f);//String to float
	        
	        String sl="2222222222222";
	        long l=Long.parseLong(sl);
	        System.out.println("\nConversion of String to Long: "+l);//String to long
	        
	        String sd="222.22222";
	        double d=Double.parseDouble(sd);
	        System.out.println("\nConversion of String to Double: "+d);//String to double
	        
	        String sb="Pooja";
	        String sb1="TRUE";
	        Boolean b1=Boolean.valueOf(sb);
	        Boolean b2=Boolean.valueOf(sb1);
	        System.out.println("\nConversion of String to Boolean: "+b1);
	        System.out.println("Conversion of String to Boolean: "+b2);//String to boolean
	        
	        String by="111";
	        byte b=Byte.parseByte(by);
	        System.out.println("\nConvertion of String to Byte:"+b);//String to byte
	        
	        char ch = sb.charAt(4);
	        System.out.println("\nConvertion of String to Character:"+ch);//String to charrecter
	        
	        
	    } 
	}
