public class String_Basic_13 {
    public static void main(String[] args) {
        //declare process 1
        String name1 = "Abir"; //this is literal - if we create another string of same value thar variable will refer this one no new instance will be created
        System.out.println("My name is " + name1);

        //declare process 2
        char[] name2 ={'A', 'b', 'i', 'r'};
        String name = new String(name2);
        System.out.println("My name is " + name);

        //concatenate string 1
        String fname1 = "Shah";
        String lname1 = "Alam";
        System.out.println("Concatenate [1] - " + fname1 + lname1);

        //concatenate string 2
        String fname2 = "Shah";
        String lname2 = "Alam";
        System.out.println("Concatenate [1] - " + fname2.concat(lname2));

        //we can do concatenate any other data types with string like this
        int quantity = 12;
        String nameOfFruit = "Oranges";
        System.out.println(quantity + nameOfFruit);

        //escape character
//        System.out.println("They said"We should go now".");
        //this line gives error. So, to use quotation mark we must include backslash with it.
        System.out.println("They said, \"We should go now\".");
        System.out.println("The path is D:\\Docs\\java\\String");   //to use "\" in string we used another \ to write this
        System.out.println("My name is Abir.\nI'm a B.tech student.");  //breaks into new line
        System.out.println();   //randomly escaping one line
        System.out.println("Age:\t20");     //this will give a tab before "20"
        System.out.println("Address \b: Istanbul, Turkey");

        //String methods

        //.length() method - this will give the length of string
        String value = "Istanbul";
        System.out.println("Length is : " + value.length());

        //.indexOf() method - this will give the index of provided char or charset
        System.out.println("Index of t is : " + value.indexOf("t"));

        //.toLowerCase() method - this will convert all the characters to lower case
        System.out.println(value.toLowerCase());

        //.toUpperCase() method - this will convert all the characters to upper case
        System.out.println(value.toUpperCase());

        //string pooling - string literal
        String s1 = "Abir";
        String s2 = "Abir";
        System.out.println(s1==s2); //this will print true. Because, don't makes new string that is using same value as any existing value
        String s3 = new String("Abir");
        String s4 = new String("Abir");
        System.out.println(s3==s4); //this will print false. It create new String [not bothered with same value]

        //trim() method
        String str1 = "Shah Alam Abir";
        System.out.println("Trimmed String - " + str1.trim());

        //subString method
        System.out.println("SubString 1 is - " + str1.substring(2));
        System.out.println("SubString 2 is - " + str1.substring(2, 10));
    }
}
