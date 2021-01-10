package basic;

// how to use lambda and method reference


interface Parser {
    String parse(String text);
}

// make some printing action ( print on server , gui, log  etc  some text action ) depends on parser
class Pr {
    public void print(String s, Parser p) {
        s = p.parse(s);
        System.out.println(s);
    }
}

// some dummy logic string converter that you may want to use
class MyStringParser {
    static String convert(String s) {
        if (s.length() > 3) {
            s = s.toLowerCase();
        } else {
            s = s.toUpperCase();
        }
        return s;
    }
}


public class MyPrinter {
    public static void main(String[] args) {
        String text = "New Printer Class";
        Pr p = new Pr();

        /// the old version java
//        p.print(text, new Parser() {
//            @Override
//            public String parse(String text) {
//                return MyStringParser.convert(text);
//            }
//        });


        /// by using lambda
//        p.print(text, text1 -> MyStringParser.convert(text1));


        /// using function reference CPP style code
        p.print(text, MyStringParser::convert);

    }
}
