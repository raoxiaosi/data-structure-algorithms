package com.rao.linkedlist;

/**
 * 单链表
 * 
 * @author raojing
 * @date 2019/8/16 12:49
 */
public class SingleLinkedList {

    // 初始化链表头节点
    private SingleLinkedListNode head = new SingleLinkedListNode(0, "");

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
     * 修改节点
     *
     * @param node
     */
    public void update(SingleLinkedListNode node){
        SingleLinkedListNode curr = head.getNext();
        boolean hasNode = false;

        if(curr == null){
            System.out.println("链表为空");
            return;
        }
        while (true){
            if(curr == null){
                break;
            }
            if(curr.getNo().equals(node.getNo())){
                hasNode = true;
                break;
            }
            curr = curr.getNext();
        }
        if(hasNode){
            curr.setName(node.getName());
        }else{
            System.out.println("沒有编号为" + node.getNo() + "的节点，修改失败");
        }
    }

    /**
     * 删除节点
     *
     * @param no
     */
    public void delete(int no){
        SingleLinkedListNode curr = head;
        boolean hasNode = false;

        while (true){
            if(curr.getNext() == null){
                break;
            }else if(curr.getNext().getNo() == no){
                hasNode = true;
                break;
            }
            curr = curr.getNext();
        }
        if(hasNode){
            curr.setNext(curr.getNext().getNext());
        }else{
            System.out.println("沒有编号为" + no + "的节点，删除失败");
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

    /**
     * 得到链表长度
     *
     * @return
     */
    public int size(){
        SingleLinkedListNode curr = head.getNext();
        int size = 0;

        while (true){
            if(curr == null){
                break;
            }
            size ++;
            curr = curr.getNext();
        }
        return size;
    }

    /**
     * 反转链表
     *
     * @return
     */
    public SingleLinkedList reverse(){
        SingleLinkedListNode newHead = new SingleLinkedListNode(0, "");

        SingleLinkedListNode tem = head.getNext();
        if(tem == null){
            throw new RuntimeException("链表为空");
        }
        while (true){
            if(tem == null){
                break;
            }

            SingleLinkedListNode newTem = new SingleLinkedListNode();
            newTem.setNo(tem.getNo());
            newTem.setName(tem.getName());

            if(newHead.getNext() == null){
                newHead.setNext(newTem);
            }else{
                newTem.setNext(newHead.getNext());
                newHead.setNext(newTem);
            }
            tem = tem.getNext();
        }
        head = newHead;
        return this;
    }

    /**
     * 获取头结点
     *
     * @return
     */
    public SingleLinkedListNode getHead() {
        return head;
    }
}
