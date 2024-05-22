import static org.junit.Assert.*;
import org.junit.Test;

public class TaskInboxTest {

    @Test
    public void testGetTaskInbox() {
        TaskInbox inbox = new TaskInbox();
        String studentId = "12345";
        String expectedOutput = "Task1: Submitted, Feedback: Pending\n" +
                                "Task2: Submitted, Feedback: Given\n" +
                                "Chat: Hi there!, Sure, let me check.";
        assertEquals(expectedOutput, inbox.getTaskInbox(studentId));
    }

    @Test
    public void testGetTaskInboxNoTasks() {
        TaskInbox inbox = new TaskInbox();
        String studentId = "54321";
        String expectedOutput = "No tasks found for the given student ID.";
        assertEquals(expectedOutput, inbox.getTaskInbox(studentId));
    }
}
