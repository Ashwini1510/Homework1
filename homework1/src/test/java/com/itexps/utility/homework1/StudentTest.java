/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.itexps.utility.homework1;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author sunil
 */
public class StudentTest {

    Student mystudent;
    
    
    public StudentTest() {
       
    }
        
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
       mystudent  = new Student();
     
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    
    @Test
    public void testName(){
        mystudent.setName("rima");
        assertEquals("rima", mystudent.getName());
    }
    
   @Test
    public void testId(){
        mystudent.setId(123);
        assertEquals(123, mystudent.getId());
    }
}