package com.rao.linkedlist;

import org.junit.Test;

/**
 * @author raojing
 * @date 2019/8/16 13:10
 */
public class TestList {

    @Test
    public void testSingleLinkedList(){
        SingleLinkedList list = new SingleLinkedList();
        list.addSortByNo(new SingleLinkedListNode(1, "AA"));
        list.addSortByNo(new SingleLinkedListNode(4, "DD"));
        list.addSortByNo(new SingleLinkedListNode(2, "BB"));
        list.addSortByNo(new SingleLinkedListNode(2, "BB001"));
        list.addSortByNo(new SingleLinkedListNode(3, "CC"));
        list.addSortByNo(new SingleLinkedListNode(5, "EE"));
        list.addSortByNo(new SingleLinkedListNode(5, "FF"));
        list.list();
        System.out.println("链表长度为:" + list.size());
        System.out.println("--------------");

//        list.update(new SingleLinkedListNode(8, "DHUIASHDIUS"));
//        list.delete(2);
//        list.delete(3);
//        list.delete(1);
//        list.delete(8);

        list.reverse();
        list.list();
        System.out.println("链表长度为:" + list.size());
    }


}
