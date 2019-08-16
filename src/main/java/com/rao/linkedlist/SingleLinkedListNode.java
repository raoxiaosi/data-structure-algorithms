package com.rao.linkedlist;

import lombok.*;

/**
 * 单链表节点
 * 
 * @author raojing
 * @date 2019/8/16 12:47
 */
@Getter
@Setter
@NoArgsConstructor
public class SingleLinkedListNode {
    
    private Integer no;
    
    private String name;
    
    private SingleLinkedListNode next;

    public SingleLinkedListNode(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "编号为:" + no + ",名称为:" + name;
    }
}
