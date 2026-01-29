package com;

class StringBuilderExample {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello");

        sb.append(" world");
        sb.insert(5, ",");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 3);

        System.out.println(sb);
    }
}

