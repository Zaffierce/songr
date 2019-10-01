package com.Zaffierce.songr;

//Example from Monday's lecture
public class Emotion {
    String emotionName;
    int strength;
    String reason;

    public Emotion(String emotionName, int strength, String reason) {
        this.emotionName = emotionName;
        this.strength = strength;
        this.reason = reason;
    }


    public String toString() {
        return String.format("Feeling %s because %s", emotionName, reason);
    }
}
