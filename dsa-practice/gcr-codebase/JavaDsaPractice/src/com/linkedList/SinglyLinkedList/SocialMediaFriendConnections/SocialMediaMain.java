package com.linkedList.SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaMain {

    public static void main(String[] args) {

        SocialMediaLinkedList network = new SocialMediaLinkedList();

        network.addUser(1, "Ayush", 21);
        network.addUser(2, "Neha", 20);
        network.addUser(3, "Ravi", 22);
        network.addUser(4, "Aarya", 21);

        network.addFriend(1, 2);
        network.addFriend(1, 3);
        network.addFriend(2, 3);
        network.addFriend(3, 4);

        network.displayFriends(1);
        network.displayFriends(3);

        network.findMutualFriends(1, 2);
        network.countFriends(3);

        network.removeFriend(1, 3);
        network.displayFriends(1);

        network.searchUser(4, "");
    }
}
