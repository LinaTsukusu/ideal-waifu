package main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// 人間
public class Human {

    String 苗字;
    String 名前;
    int 年齢;
    Sex 性別;

    // 身体
    int 身長;
    int 体重;
    int バスト;
    int ウエスト;
    int ヒップ;
    String 髪型;

    Emotion 感情;
    Map<String, Memory> 記憶;
    List<Human> 恋人 = new ArrayList<>();
    int 幸福度 = 0;

    Human(String 苗字, String 名前) {
        this.苗字 = 苗字;
        this.名前 = 名前;
        this.幸福度 = 0;
    }

    Talk 話す() {
        Talk 会話内容 = new Talk();
        // TODO 内容の生成
        return 会話内容;
    }
}
