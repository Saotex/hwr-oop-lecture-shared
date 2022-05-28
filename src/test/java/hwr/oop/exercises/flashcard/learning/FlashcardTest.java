package hwr.oop.exercises.flashcard.learning;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

class FlashcardTest {

    @Test
    void getAnswer(){
        Answer answer = new StringBasedAnswer("Uncle bob");
        FlashCard flashCard = FlashCard.create(new StringBasedQuestion("Who is Robert Martin?"), new ArrayList<>(Collections.singleton(answer)), new StringBasedSolution("Uncle bob"));
        assertThat(answer.isSolutionTo(flashCard)).isTrue();
    }
}
