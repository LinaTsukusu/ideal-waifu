package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

// 彼女生成器
public class WaifuFactory {

    private List<String> 語尾List =
            List.of("", "ニャ", "ワン", "なのじゃ", "ですわ", "ザマス", "わよ");

    private List<String> 一人称List = new ArrayList<>(
            Arrays.asList("私", "僕", "俺", "あたい", "わたくし", "ワイ", "我", "朕", "余"));

    Waifu 彼女生成(Human 自分, String 名前, List<String> 趣味List) {
        Waifu 新しい彼女 = new Waifu(名前);
        新しい彼女.結婚(自分);

        新しい彼女.語尾 =
                語尾List.get(random(語尾List.size() - 1));
        this.一人称List.add(新しい彼女.名前);
        this.一人称List.add(新しい彼女.苗字);
        新しい彼女.一人称 =
                一人称List.get(random(一人称List.size() - 1));
        新しい彼女.趣味 =
                趣味List.get(random(趣味List.size() - 1));


        新しい彼女.身長 = random(100) + 100;
        新しい彼女.体重 = random(100) + 新しい彼女.身長 / 8;

        新しい彼女.バブみ = random(100);
        新しい彼女.やさしさ = random(100);
        新しい彼女.エロさ = random(100);
        新しい彼女.kawaii = random(100);
        新しい彼女.病み = random(100);
        新しい彼女.isメガネ = random(100) <= 5;
        return 新しい彼女;
    }

    private int random(int max) {
        return (int)(Math.random() * (double)max);
    }
}
