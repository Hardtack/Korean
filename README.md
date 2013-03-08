Korean
======

Korean formatting for java.  

Provides almost same APIs as `java.util.Formatter` & `String.format`.  

Format string syntax follows [Java's standard](http://docs.oracle.com/javase/6/docs/api/java/util/Formatter.html#syntax)
and you can extend it.  

Format conversions provided by this package
-------------------------------------------

*   `을`

*   `이`
    
Example
-------

    KoreanString.format(
        "%d번째 줄에 앉은 %이 %을 %04d개 구입했다",
        2, "철수", "과자", 32)

It will be formatted to

    "2번째 줄에 앉은 철수가 과자를 0032개 구입했다"
