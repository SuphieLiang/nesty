package org.nesty.core.server.utils;

import java.util.concurrent.atomic.AtomicLong;

public class Hitcounter {

    private final AtomicLong counter = new AtomicLong();

    public long hit() {
        return counter.incrementAndGet();
    }

    public long count() {
        return counter.get();
    }
}
