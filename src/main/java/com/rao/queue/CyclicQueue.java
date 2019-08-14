package com.rao.queue;

import lombok.Getter;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 数组模拟环形队列
 *
 * @author raojing
 * @date 2019/8/14 21:02
 */
public class CyclicQueue {

    /**
     * 设计思想：
     * rear 指向队尾的后一个位置，意味着需要预留出一个空间给 rear，那么队列的长度实际是数组长度 -1
     * 利用取余的技巧来实现环形队列，取余可以保证下标始终在数组长度范围内
     */

    // 指向队首位置
    private Integer front = 0;
    // 指向队尾的后一个位置
    private Integer rear = 0;
    // 最大容量
    private Integer maxSize;
    // 存放数据的数组
    private Integer[] queue;

    public CyclicQueue(int size) {
        queue = new Integer[size + 1];
        maxSize = size + 1;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return front.equals(rear);
    }

    /**
     * 是否满了
     *
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 进队
     *
     * @param value
     */
    public void pushQueue(int value) {
        if (isFull()) {
            System.out.println("》》》》》》队列已满，不能再添加了《《《《《《");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % maxSize;
    }

    /**
     * 出队
     *
     * @return
     */
    public int popQueue() {
        if (isEmpty()) {
            throw new RuntimeException("》》》》》》队列是空的哦《《《《《《");
        }
        int temValue = queue[front];
        front = (front + 1) % maxSize;
        return temValue;
    }

    /**
     * 展示队列数据
     */
    public void showQueue() {
        if (isEmpty()) {
            System.out.println("》》》》》》队列是空的哦《《《《《《");
            return;
        }
        for (int i = front, size = effectValue(); i < size; i++) {
            System.out.println("queue[" + (i % maxSize) + "] = " + queue[i % maxSize]);
        }
    }

    /**
     * 队列有效值
     *
     * @return
     */
    public int effectValue() {
        return (rear + maxSize - front) % maxSize;
    }


    public static void main(String[] args) {
        System.out.println("---------------------------- 程序开始执行 ----------------------------");
        System.out.printf("请输入队列长度(数字): ");
        Scanner scanner = new Scanner(System.in);

        int queueLength = scanner.nextInt();
        CyclicQueue queue = new CyclicQueue(queueLength);

        boolean loop = true;
        char key = ' ';

        while (loop) {
            System.out.println("--------------------------------");
            System.out.println("》》》》》》》队列长度为: " + queueLength);
            System.out.println("》》》》》》》当前有效长度为: " + queue.effectValue());
            System.out.println();
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 取出队列的第一个数据");

            key = scanner.next().charAt(0);
            switch (key) {
                case 's':
                    queue.showQueue();
                    break;
                case 'e':
                    loop = false;
                    System.out.println("---------------------------- 退出程序 ----------------------------");
                    break;
                case 'a':
                    if (queue.isFull()) {
                        System.out.println("》》》》》》队列已满，不能再添加了《《《《《《");
                    } else {
                        try{
                            System.out.printf("请输入值: ");
                            int value = scanner.nextInt();
                            queue.pushQueue(value);
                            System.out.println("添加数据成功");
                        }catch (InputMismatchException e){
                            System.out.println("》》》》》》输入有误《《《《《《");
                        }
                    }
                    break;
                case 'g':
                    try {
                        System.out.println("取出的第一个数据为:" + queue.popQueue());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("》》》》》》暂无此命令，请重新输入 《《《《《《");
                    break;
            }
        }
    }

}
