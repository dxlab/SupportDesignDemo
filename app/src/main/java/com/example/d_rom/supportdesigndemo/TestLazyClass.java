package com.example.d_rom.supportdesigndemo;

/**
 * Created by Dima on 05.09.2015.
 */
public class TestLazyClass {

    private int mLazyValueA = 6;
    private int mLazyValueB = 2000;

    public int getLazyValueA() {
        return mLazyValueA;
    }

    public void setLazyValueA(int _lazyValueA) {
        this.mLazyValueA = _lazyValueA;
    }

    public int getLazyValueB() {
        return mLazyValueB;
    }

    public void setLazyValueB(int _lazyValueB) {
        this.mLazyValueB = _lazyValueB;
    }


}
