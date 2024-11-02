package de.crafterslife.test.packag;

import java.util.logging.Logger;

public class one {
    public void foo(Logger logger , String string) {
        logger.info(string + "C");


        var a = new A();
        a.a(logger);

        var b = new B();
        b.b(logger);
    }
}
