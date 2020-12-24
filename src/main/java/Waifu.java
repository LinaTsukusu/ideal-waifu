package main.java;

/**
 * 皆のコメントで作る理想の彼女
 */
public class Waifu extends Human {
    int やさしさ;
    int バブみ;
    int 病み;
    int エロさ;
    int kawaii;
    boolean isメガネ;
    String 趣味;
    String 語尾;
    String 一人称;

    Waifu(String 名前) {
        super("", 名前);
        this.性別 = Sex.女性;
    }

    void 結婚(Human 相手) {
        this.恋人.add(相手);
        相手.恋人.add(this);
        this.苗字 = 相手.苗字;
    }

    void 聴く(Talk 相手の話) {
        // TODO Talkから感情を設定
        this.感情 = new Emotion(1, 1, 1, 1) {
            @Override
            void お気持ち表明() {

            }
        };
    }

    void よしよし(Human 相手) {
        相手.幸福度 += this.バブみ;
    }

    void プンプン() {
        this.感情 = new Emotion(0, 100, 10, 0) {
            @Override
            void お気持ち表明() {

            }
        };
    }

    String アイサツ() {
        return String.format(
                "こんにちは､%sの名前は%s%sです%s｡ 趣味は%s%s｡ 愛してる%s",
                this.一人称, this.苗字, this.名前, this.語尾,
                this.趣味, this.語尾, this.語尾);
    }

    void 洗濯する() {
        // TODO 洗濯物を選択ソート
    }

    @Override
    public String toString() {
        return "Waifu{" +
                "苗字='" + 苗字 + '\'' +
                ", 名前='" + 名前 + '\'' +
                ", 年齢=" + 年齢 +
                ", 性別=" + 性別 +
                ", 身長=" + 身長 +
                ", 体重=" + 体重 +
                ", バスト=" + バスト +
                ", ウエスト=" + ウエスト +
                ", ヒップ=" + ヒップ +
                ", 髪型='" + 髪型 + '\'' +
                ", 感情=" + 感情 +
                ", 記憶=" + 記憶 +
                ", 恋人=" + 恋人 +
                ", 幸福度=" + 幸福度 +
                ", やさしさ=" + やさしさ +
                ", バブみ=" + バブみ +
                ", 病み=" + 病み +
                ", エロさ=" + エロさ +
                ", kawaii=" + kawaii +
                ", isメガネ=" + isメガネ +
                ", 趣味='" + 趣味 + '\'' +
                ", 語尾='" + 語尾 + '\'' +
                ", 一人称='" + 一人称 + '\'' +
                '}';
    }
}
