package io.pivotal.pal.gradle;


public class Hello {
    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        System.out.println(messenger.getMessage());
    }
}
