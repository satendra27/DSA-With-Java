public class string1 {
    public static void main(String[] args) {
        // String pooling
        String a = "Student";
        String b = "Student";
        System.out.println(a==b);

        String c = new String("Student");
        String d = new String("Student");
        // System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a.charAt(0));

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"


        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        String x = "10";
        int y = 20;
        String z = x + y;
        System.out.println(z);

        byte ascii[] = { 71, 70, 71 };

        String firstString = new String(ascii);
        System.out.println(firstString);

        System.out.println("GeeksforGeeks".substring(3));
        System.out.println("GeeksforGeeks".substring(2, 8));

        String word1 = " Learn Share Learn ";
        String word2 = word1.trim(); // returns “Learn Share Learn”
        System.out.println(word2);

        String s1 = "feeksforfeeks";
        String s2 = "feeksforfeeks".replace('f' ,'g'); // return “geeksforgeeks”

        // String s1="geeksforgeeks";
        // String s2="geeks";
        // s1.contains(s2) // return true

        // String s1="geeksforgeeks";
// char []ch=s1.toCharArray();  // returns [ 'g', 'e' , 'e' , 'k' , 's' , 'f', 'o', 'r' , 'g' , 'e' , 'e' , 'k' ,'s' ]
    }
}
