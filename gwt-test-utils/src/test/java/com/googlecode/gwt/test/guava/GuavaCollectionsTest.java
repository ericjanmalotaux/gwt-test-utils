package com.googlecode.gwt.test.guava;

import com.googlecode.gwt.test.GwtTestTest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GuavaCollectionsTest extends GwtTestTest {

    @Test
    public void filterIslandCandidates() {
        // Given
        List<String> list = new ArrayList<>();
        list.add("Jack Shephard");
        list.add("John Locke");
        list.add("Hurley Reyes");

        // When
        Collection<String> candidates = GuavaCollections.filterIslandCandidates(list);

        // Then
        assertThat(candidates).hasSize(2).doesNotContain("John Locke").contains("Jack Shephard").contains(
                "Hurley Reyes");
    }

}
