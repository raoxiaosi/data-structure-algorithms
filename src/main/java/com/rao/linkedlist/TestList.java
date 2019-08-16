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
    }
    
}
