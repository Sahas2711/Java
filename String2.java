public class String2 {
    public static void main(String[] args) {
        String name;
        name = "sahas";
        // length
        System.out.println(name.length());
        // lowercase
        System.out.println(name.toLowerCase());
        // uppercase
        System.out.println(name.toUpperCase());
        // create a substring from
        System.out.println(name.substring(3));
        // create a substring from to
        System.out.println(name.substring(1, 3));
        // replace 1st char by 2nd
        System.out.println(name.replace("a", "b"));
        // replace char by String
        System.out.println(name.replace("s", "nagar"));
        // to find the characters at given index
        System.out.println(name.charAt(4));

        System.out.println(name.indexOf(3));
        // index of s from 3
        System.out.println(name.indexOf("s", 3));
    }
}
