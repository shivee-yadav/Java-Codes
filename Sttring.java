
public class Sttring {

	public static void main(String[] args) {
        String s="Hello";
        String t="Hello";
        System.out.println(s.hashCode());
        System.out.println(t.hashCode());
        String z=s;
        System.out.println(z.hashCode());
        z="abc";
        System.out.println(z.hashCode());
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println("contains e:"+s.contains("e"));
        System.out.println("contains z:"+s.contains("z"));
        System.out.println("position of e:"+s.indexOf("e"));
        System.out.println("position of z:"+s.indexOf("z"));
        
        String enrol="0206EE191031";
        System.out.println("College code :"+enrol.substring(0,4));//0206
        System.out.println("Branch :"+enrol.substring(4,6));//EE
	}

}
