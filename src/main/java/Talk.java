package main.java;

import java.util.Map;

// 会話
public class Talk {
    Map<String, Integer> 内容;

    Talk() {
    }

    void add内容(String 要素, int 程度) {
        this.内容.put(要素, 程度);
    }
}
