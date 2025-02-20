package com.wipro.java.collection.hashmap;

import java.util.LinkedList;

public class MyHashMap<K, V> {
    private static final int SIZE = 16;  // Size of the array
    private LinkedList<Node<K, V>>[] table;

    public MyHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Node class to store key-value pairs
    private static class Node<K, V> {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    // Hash function to compute index
    private int hash(K key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    // Put a key-value pair in the map
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        // Check if key already exists, if so update value
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        // If key does not exist, add new node
        bucket.add(new Node<>(key, value));
    }

    // Get the value for a given key
    public V get(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null; // If key is not found
    }

    // Remove a key-value pair
    public void remove(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        bucket.removeIf(node -> node.key.equals(key));
    }

    // Check if the map contains the key
    public boolean containsKey(K key) {
        int index = hash(key);
        LinkedList<Node<K, V>> bucket = table[index];

        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return true;
            }
        }
        return false;
    }

    // Main method for testing the HashMap
    public static void main(String[] args) {
        MyHashMap<String, Integer> map = new MyHashMap<>();
        
        // Adding key-value pairs
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // Retrieving values
        System.out.println("Value for 'One': " + map.get("One"));
        System.out.println("Value for 'Two': " + map.get("Two"));
        System.out.println("Value for 'Three': " + map.get("Three"));

        // Checking if a key exists
        System.out.println("Contains key 'Two': " + map.containsKey("Two"));
        
        // Removing a key
        map.remove("Two");
        System.out.println("Contains key 'Two' after removal: " + map.containsKey("Two"));
        
        // Trying to get the removed key
        System.out.println("Value for 'Two' after removal: " + map.get("Two"));
    }
}
