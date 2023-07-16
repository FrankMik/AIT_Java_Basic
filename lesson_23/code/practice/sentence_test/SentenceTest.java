package practice.sentence_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

// pole class
    Sentence sentence; //определяем поле с типом тестируемого класса

    @BeforeEach
    void setUp() {
        sentence = new Sentence("Какое либо предложениею."); // создали объект класса
    }

    @Test
    void wordsInSentenceTest() {
        String st = "Hello and bye!";
      assertEquals(3, sentence.wordsInSentence(st));
    }

    @Test
    void lettersInSentenceTest() {
        String st = "Я вам пишу, чего же боле...";
        assertEquals(18, sentence.lettersInSentence(st));
    }
}