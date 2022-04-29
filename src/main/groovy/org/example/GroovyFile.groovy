package org.example;

class GroovyFile {
    public final static long STATIC_LONG = 123

    static {
        println('GroovyFile sees ' + STATIC_LONG)
    }
}
