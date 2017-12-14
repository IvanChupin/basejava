package com.urise.webapp.storage;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// this annotation allows us to gather all tests in one short class
@RunWith(Suite.class)
@Suite.SuiteClasses(
        {
                ListStorageTest.class,
                MapUuidStorageTest.class,
                SortedArrayStorageTest.class,
                ArrayStorageTest.class,
                MapResumeStorageTest.class
        })
public class AllStorageTest {

}
