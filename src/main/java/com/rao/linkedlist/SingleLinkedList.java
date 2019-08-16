package com.rao.linkedlist;

/**
 * 单链表
 * 
 * @author raojing
 * @date 2019/8/16 12:49
 */
public class SingleLinkedList {

    // 初始化链表头节点
    private final SingleLinkedListNode head = new SingleLinkedListNode(0, "");

    /**
     * 无顺序添加
     * 
     * @param node
     */
    public void add(SingleLinkedListNode node){
        SingleLinkedListNode temp = head;
        while (true) {
            if (temp.getNext() == null) {
                break;
            }
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    /**
     * 按照编号顺序添加
     * 
     * @param node
     */
    public void addSortByNo(SingleLinkedListNode node){
        SingleLinkedListNode temp = head;
        boolean hasNode = false;
        while (true){
            if(temp.getNext() == null){
                break;
            }else if(temp.getNext().getNo() > node.getNo()){
                break;
            }else if(temp.getNext().getNo().equals(node.getNo())){
                node.setNext(temp.getNext().getNext());
                temp.setNext(node);
                hasNode = true;
                break;
            }
            temp = temp.getNext();
        }
        if(!hasNode){
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    /**
     * 遍历链表
     */
    public void list(){
        SingleLinkedListNode temp = head;
        if(temp.getNext() == null){
            System.out.println("链表为空");
            return;
        }
        while (true){
            if(temp.getNext() == null){
                break;
            }
            temp = temp.getNext();
            System.out.println(temp);
        }
    }
    
}
