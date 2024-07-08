import static org.junit.jupiter.api.Assertions.*;

import edu.sdccd.cisc191.template.Student;
import edu.sdccd.cisc191.template.StudentArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testStudent {
    private StudentArray studentArray;

    @BeforeEach
    public void setUp() {
        studentArray = new StudentArray(3, 3);
    }

    @Test
    public void testSetAndGetAtIndex() {
        Student student = new Student("Jordan Le", 19, 97);
        studentArray.setAtIndex(0, 0, student);
        assertEquals(student, studentArray.getAtIndex(0, 0));
    }

    @Test
    public void testFindIndexOf() {
        Student student = new Student("Jane Doe", 20, 90);
        studentArray.setAtIndex(1, 1, student);
        int[] index = studentArray.findIndexOf("Jane Doe");
        assertNotNull(index);
        assertEquals(1, index[0]);
        assertEquals(1, index[1]);
    }

    @Test
    public void testDeleteAtIndex() {
        Student student = new Student("John Doe", 20, 85);
        studentArray.setAtIndex(0, 0, student);
        studentArray.deleteAtIndex(0, 0);
        assertNull(studentArray.getAtIndex(0, 0));
    }

    @Test
    public void testExpandArray() {
        studentArray.expandArr(5, 5);
        assertNull(studentArray.getAtIndex(4, 4)); // Ensure new space is created
    }

    @Test
    public void testShrinkArray() {
        Student student = new Student("John Doe", 20, 85);
        studentArray.setAtIndex(0, 0, student);
        studentArray.shrinkArr(2, 2);
        assertEquals(student, studentArray.getAtIndex(0, 0));
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            studentArray.getAtIndex(2, 2); // Ensure array is shrunk
        });
    }

    @Test
    public void testPrintAll() {
        Student student1 = new Student("John Doe", 20, 85);
        Student student2 = new Student("Jane Doe", 22, 90);
        studentArray.setAtIndex(0, 0, student1);
        studentArray.setAtIndex(1, 1, student2);


        studentArray.print();
    }
}
