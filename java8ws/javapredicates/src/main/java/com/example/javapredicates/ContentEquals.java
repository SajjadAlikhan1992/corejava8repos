package com.example.javapredicates;

import java.util.function.BiPredicate;

public class ContentEquals {

    public boolean test_content_equality(String exi, CharSequence cu) {
        BiPredicate<String, CharSequence> bp = (ex, cur) -> exi.contentEquals(cu);
        return bp.test(exi, cu);
    }

    ;

}
