package decoratorPattern;

import java.io.*;

public class DecoratorMain {


    public static void main(String[] args) throws FileNotFoundException {
        Coffee coffee = new Americano();
        coffee.brewing();

        Coffee latteCoffee = new Latte(new Americano());
        latteCoffee.brewing();

        Coffee mochaCoffee = new Mocha(new Latte(new Americano()));
        mochaCoffee.brewing();


        Coffee whippedCreamCoffee = new WhippedCream(new Mocha(new Latte(new Americano())));
        whippedCreamCoffee.brewing();

        // 자바 API 속의 데코레이터 패턴
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("a.out")));

        /**
         * public class FileInputStream extends InputStream {
         *     public FileInputStream(String name) throws FileNotFoundException {
         *         this(name != null ? new File(name) : null);
         *     }
         * }
         */

        /***
         * public class InputStreamReader extends Reader {
         *     public InputStreamReader(InputStream in) {
         *         super(in);
         *         sd = StreamDecoder.forInputStreamReader(in, this,
         *                 Charset.defaultCharset()); // ## check lock object
         *     }
         * }
         */

        /**
         * BufferedReader extends Reader {
         *     public BufferedReader(Reader in) {
         *         this(in, defaultCharBufferSize);
         *     }
         * }
         */
    }
}
