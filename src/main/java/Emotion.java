package main.java;

public abstract class Emotion {
    int 喜;
    int 怒;
    int 哀;
    int 楽;

    Emotion(int 喜, int 怒, int 哀, int 楽) {
        this.喜 = 喜;
        this.怒 = 怒;
        this.哀 = 哀;
        this.楽 = 楽;
    }

    abstract void お気持ち表明();
}
