package in.icake.junit;

import static org.junit.Assert.assertEquals;
import in.icake.practice.BinarySearchTreeGeneric;

import org.junit.Test;

public class BinarySearchGenericTest {

    @Test
    public void test345() {
        BinarySearchTreeGeneric<Integer> tree = new BinarySearchTreeGeneric<Integer>();
        tree.add(3);
        tree.add(4);
        tree.add(5);
        assertEquals("[null,3,[null,4,[null,5,null]]]", tree.toString());
    }
    
    @Test
    public void test453() {
        BinarySearchTreeGeneric tree = new BinarySearchTreeGeneric();
        tree.add(4);
        tree.add(5);
        tree.add(3);
        assertEquals("[[null,3,null],4,[null,5,null]]", tree.toString());
    }

    @Test
    public void testNoDups() {
        BinarySearchTreeGeneric tree = new BinarySearchTreeGeneric();
        tree.add(4);
        tree.add(4);
        assertEquals("[null,4,null]", tree.toString());
    }

    @Test
    public void testLinkedList() {
        BinarySearchTreeGeneric tree = new BinarySearchTreeGeneric();
        Integer[] array = {
                1, 2, 3, 4, 5, 6
        };
        tree.addAll(array);
        tree.add(4);
        assertEquals("[null,1,[null,2,[null,3,[null,4,[null,5,[null,6,null]]]]]]", tree.toString());
    }

    @Test
    public void testSecondLarge()
    {
        // BinarySearchTreeInt<Employee> tree = new
        // BinarySearchTreeInt<Employee>();
        BinarySearchTreeGeneric<Integer> tree = new BinarySearchTreeGeneric<Integer>();
        Integer[] array = {
                3, 2, 5, 1, 4
        };
        tree.addAll(array);
        // Employee entity1 = new Employee(1, 20000, "Dean");
        // Employee entity2 = new Employee(2, 30000, "Sam");
        // Employee entity3 = new Employee(3, 40000, "Joe");
        // Employee entity4 = new Employee(4, 50000, "Preeti");
        //
        // tree.add(entity3);
        // tree.add(entity4);
        // tree.add(entity1);
        // tree.add(entity2);
        // assertEquals("Joe", tree.getSecondLarge().getItem().toString());
        System.out.println(tree.getSecondLarge().getItem());
        assertEquals(new Integer(4), tree.getSecondLarge().getItem());

    }

}
