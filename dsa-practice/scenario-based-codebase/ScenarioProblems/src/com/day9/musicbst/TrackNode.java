package com.day9.musicbst;

public class TrackNode {
    int trackId;
    String title;
    TrackNode left, right;

    public TrackNode(int trackId, String title) {
        this.trackId = trackId;
        this.title = title;
    }
}
