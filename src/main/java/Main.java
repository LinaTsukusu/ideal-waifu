package main.java;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human me = new Human("創好", "");
        WaifuFactory factory = new WaifuFactory();
        Waifu waifu = factory.彼女生成(
                me, "はなこ", List.of(
                        "ゲーム", "配信", "地球防衛軍", "お絵かき",
                        "料理", "お菓子作り"));

        System.out.println(waifu.アイサツ());
        System.out.println(waifu.toString());
    }
}
