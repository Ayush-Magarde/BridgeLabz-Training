package com.linkedList.SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaLinkedList {

    private UserNode head;

    // Add new user
    public void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);

        if (head == null) {
            head = newUser;
            return;
        }

        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newUser;
    }

    // Add friend connection
    public void addFriend(int userId, int friendId) {
        UserNode user = findUser(userId);
        UserNode friend = findUser(friendId);

        if (user == null || friend == null) {
            System.out.println("User not found!");
            return;
        }

        addFriendToList(user, friendId);
        addFriendToList(friend, userId);

        System.out.println("Friend connection added!");
    }

    // Remove friend connection
    public void removeFriend(int userId, int friendId) {
        UserNode user = findUser(userId);
        UserNode friend = findUser(friendId);

        if (user == null || friend == null) {
            System.out.println("User not found!");
            return;
        }

        removeFriendFromList(user, friendId);
        removeFriendFromList(friend, userId);

        System.out.println("Friend connection removed!");
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");

        FriendNode temp = user.friendHead;
        if (temp == null) {
            System.out.println("No friends");
            return;
        }

        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Find mutual friends
    public void findMutualFriends(int user1, int user2) {
        UserNode u1 = findUser(user1);
        UserNode u2 = findUser(user2);

        if (u1 == null || u2 == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Mutual Friends: ");
        boolean found = false;

        FriendNode f1 = u1.friendHead;
        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId) {
                    System.out.print(f1.friendId + " ");
                    found = true;
                }
                f2 = f2.next;
            }
            f1 = f1.next;
        }

        if (!found)
            System.out.print("None");

        System.out.println();
    }

    // Search user by ID or Name
    public void searchUser(int id, String name) {
        UserNode temp = head;

        while (temp != null) {
            if (temp.userId == id || temp.name.equalsIgnoreCase(name)) {
                System.out.println(
                        temp.userId + " | " +
                        temp.name + " | Age: " +
                        temp.age
                );
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found!");
    }

    // Count friends of a user
    public void countFriends(int userId) {
        UserNode user = findUser(userId);

        if (user == null) {
            System.out.println("User not found!");
            return;
        }

        int count = 0;
        FriendNode temp = user.friendHead;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Total friends of " + user.name + ": " + count);
    }

    // ---------- Helper Methods ----------

    private UserNode findUser(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    private void addFriendToList(UserNode user, int friendId) {
        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friendHead;
        user.friendHead = newFriend;
    }

    private void removeFriendFromList(UserNode user, int friendId) {
        FriendNode temp = user.friendHead;

        if (temp == null)
            return;

        if (temp.friendId == friendId) {
            user.friendHead = temp.next;
            return;
        }

        while (temp.next != null && temp.next.friendId != friendId)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
    }
}
