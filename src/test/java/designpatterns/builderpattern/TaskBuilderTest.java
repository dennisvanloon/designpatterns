package designpatterns.builderpattern;

import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class TaskBuilderTest {

    @Test
    public void testDefaultValues() {
        Task task = TaskBuilder.createBuilder(1L).build();
        assertEquals(1L, task.getId());
        assertEquals("", task.getDescription());
        assertEquals("", task.getSummary());
        assertFalse(task.isDone());
        assertNull(task.getDueDate());
    }

    @Test
    public void testCustomValues() {
        Task task = TaskBuilder.createBuilder(1L)
                .setDescription("description")
                .setSummary("summary")
                .setDueDate(new Date())
                .setDone(true).build();
        assertEquals(1L, task.getId());
        assertEquals("description", task.getDescription());
        assertEquals("summary", task.getSummary());
        assertTrue(task.isDone());
        assertNotNull(task.getDueDate());
    }
}