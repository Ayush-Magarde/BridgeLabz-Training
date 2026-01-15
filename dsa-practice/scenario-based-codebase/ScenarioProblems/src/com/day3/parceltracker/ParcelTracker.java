package com.day3.parceltracker;

public class ParcelTracker {

    private StageNode head;

    public void addStage(String stage) {
        StageNode node = new StageNode(stage);

        if (head == null) {
            head = node;
            return;
        }

        StageNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = node;
    }

    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;

        while (temp != null && !temp.stage.equals(afterStage))
            temp = temp.next;

        if (temp != null) {
            StageNode node = new StageNode(newStage);
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void trackParcel() {
        StageNode temp = head;

        while (temp != null) {
            System.out.print(temp.stage + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
