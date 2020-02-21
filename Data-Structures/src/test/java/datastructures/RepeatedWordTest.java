package datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {
    @Test
    public void test1(){
        RepeatedWord xx = new RepeatedWord();
        xx.repeatedWord("Once upon a time, there was a brave princess who...");
        String expected = "a";
        assertEquals(expected, xx.repeatedWord("Once upon a time, there was a brave princess who..."));
    }

    @Test
    public void test2(){
        RepeatedWord xx = new RepeatedWord();
        String expected = "it";
        assertEquals(expected, xx.repeatedWord("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only..."));
    }

    @Test
    public void test3() {
        RepeatedWord xx = new RepeatedWord();
        String expected = "no duplicates";
        assertEquals(expected, xx.repeatedWord("It is me"));
    }

    @Test
    public void test4Empty() {
        RepeatedWord xx = new RepeatedWord();
        String expected = "no duplicates";
        assertEquals(expected, xx.repeatedWord(""));
    }
    @Test
    public void test5SameWords() {
        RepeatedWord xx = new RepeatedWord();
        String expected = "it";
        assertEquals(expected, xx.repeatedWord("It it it it it it "));
    }

    @Test
    public void test6() {
        RepeatedWord xx = new RepeatedWord();
        String expected = "time";
        assertEquals(expected, xx.repeatedWord("Once upon a time time was upon us "));
    }
}