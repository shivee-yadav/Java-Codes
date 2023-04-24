
public class Sttrings2 {

	public static void main(String[] args) {
         String s="Hello";
         String t="Hello";
         
         System.out.println(s.substring(2,4));//ll
         System.out.println(s.substring(4));//o
         System.out.println(s.indexOf("e"));//1
         System.out.println(s.charAt(1));//e
         System.out.println(s.replace('e','a'));//Hallo-->but doesn't change the original value
         System.out.println(s);//Hello
         System.out.println(s.concat("world"));//Hello world
         System.out.println(s);//Hello
         System.out.println("Length"+s.length());
         
         char data[]=s.toCharArray();//Hello-->converted to char[]
         for(char c:data)//each element is extracted and stored in c
         {
        	 System.out.println(c);
         }

         //x==y-->compare value
         int x=7;
         int y=7;
         System.out.println(x==y);//true
         
         System.out.println(s.equals(t));//true
         String z="hello";
         System.out.println(s.equals(z));//false
         System.out.println(s.equalsIgnoreCase(z));//true
         System.out.println(s.contains("lo"));//true
         System.out.println(s.startsWith("H"));//true
         System.out.println(s.startsWith("He"));//true
         System.out.println(s.endsWith("o"));//true
         System.out.println(s.endsWith("lo"));//true
         
         String d="Hello Joe, Good evening";
         int count=0;
         int index=0;
         char dat[]=d.toCharArray();//Hello-->converted to char[]
         for(char c:dat)//each element is extracted and stored in c
         {
        	 
        	 if(c=='e')
        	 {
        		 System.out.println("index :"+index);
        		 count++;
             }
        	 index++;
         }
         System.out.println("no of e :"+count);
         
         String msg="What is java";
         String word[]=msg.split(" ");
         
         System.out.println("The no of words are "+word.length);
         for(String r:word)//each element is extracted and stored in c
         {
        	 System.out.println(r);
         }



	}

}
