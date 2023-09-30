package tests;

import manager.HelperStudent;
import models.StudentsDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class StudentRegFormTests extends TestBase implements HelperStudent {

    @BeforeMethod
    public void precondition(){
        selectForm();
        selectPracticeForm();
    }
    @Test
    public void StudentRegFormPositiveTest(){
        StudentsDTO student = new StudentsDTO("Bilbo", "Baggins", "baggins@gmail.com",
                "MALE", "1214251235", "22 Sep 2020", "Math",
                "Sport", "London street", "Washington", "London");
        fillStudentForm(student);
        pause(3);
    }
}
