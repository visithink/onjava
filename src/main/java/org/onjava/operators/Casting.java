package org.onjava.operators;

/**
 * 类型转换操作符
 * 类型转换的英文单词（cast）原意有“浇铸模具”的意思。在适当的时候，Java会自动将一种类型的数据更改为另一种类型的数据。
 * 例如，将整数值赋给浮点变量的时候，编译器就会自动将int类型转换为float类型。
 * 类型转换机制使得这类转换清晰明确，还可以在无法自动转换的时候进行强制类型转换。
 * 要对某个值执行类型转换，可以将希望得到的数据类型放在括号内，置于该值的左边。如下所示：
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long)i;
        lng = i; // 宽化，因此不需要强制类型转换
        long lng2 = (long)200;
        lng2 = 200;
        // 一个窄化转型
        i = (int)lng2; // 需要强制类型转换
    }
}
/*
你既可以对数值进行类型转换，也可以对变量进行类型转换。类型转换可能是多余的，例如，编译器在必要的时候会自动将int类型提升到long类型。
但你仍然可以做多余的类型转换来表明你的观点，或仅仅使代码更清晰。在其他情况下，可能只有先进行类型转换，代码才能正常编译。
在C和C++中，类型转换让人头痛。
但是在Java中，类型转换则比较安全。
不过，执行被称为窄化转型（narrowing conversion）的操作时，就有可能面临信息丢失的危险。
窄化转型就是说，将能容纳更多信息的数据类型转换成无法容纳那么多信息的数据类型。
此时，编译器会要求我们进行强制类型转换，意在提醒我们：“这可能是一个危险的操作，如果的确要这么做，你必须显式地进行类型转换。
”而对于宽化转型（widening conversion），则不必显式地进行类型转换，因为新类型可以容纳比原来的类型更多的信息，而不会造成任何信息的丢失。

Java可以把任何基本类型转换成别的基本类型，但boolean除外，它不允许进行任何类型的转换处理。
“类”类型（class type）也不允许进行类型转换。
将一种类型转换成另一种类型需要采用特殊的方法（后面会讲到，对象可以在它的类型所属族群里进行类型转换。
例如，“橡树”可以转型为“树”，反之亦然。但不能把它转换成外部的类型，比如“石头”）。
 */