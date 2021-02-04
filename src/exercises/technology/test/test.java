package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class test {

    Computer test_computer;
    Laptop test_laptop;
    SmartPhone test_phone;

    @Before
    public void createComputer() {test_computer = new Computer(false, "x86", 2.4);}
    @Before
    public void createLaptop() {test_laptop = new Laptop(true, "x86_64", 3.2, "Windows 10");}
    @Before
    public void createSmartPhone() {test_phone = new SmartPhone(true, "ARM", 1.3, "Sprint");}

    @Test
    public void emptyTest(){
        assertEquals(true, true);
    }

    @Test
    public void computerIsCreated(){
        assertEquals(test_computer.getInstructionSet(), "x86");
    }

    @Test
    public void computerKeyboardDetected(){
        assertEquals(test_computer.keyboardType(), "external");
    }

    @Test
    public void laptopIsCreated(){
        assertEquals(test_laptop.getOs(), "Windows 10");
    }

    @Test
    public void laptopInheritanceTest(){
        assertEquals(test_laptop.getInstructionSet(), "x86_64");
    }

    @Test
    public void laptopOverrideWorks(){
        assertEquals(test_laptop.keyboardType(), "integrated");
    }

    @Test
    public void smartPhoneIsCreated(){
        assertEquals(test_phone.getCarrier(), "Sprint");
    }

    @Test
    public void smartPhoneInheritanceTest(){
        assertEquals(test_phone.getInstructionSet(), "ARM");
    }

    @Test
    public void laptopSetID(){
        test_laptop.setId(888);
        assertEquals(test_laptop.getId(), 888);
    }


}
