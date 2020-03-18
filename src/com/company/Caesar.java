package com.company;

public class Caesar extends AbstractEncyptor {
    private String word;
    private int move;

    public Caesar() {
    }

    public Caesar(String word, int move) {
        this.word = word;
        this.move = move;
    }

    @Override
    public StringBuilder enrypt(String word, int move) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                char ch = (char) (((int) word.charAt(i) + move - 65) % 26 + 65);
                sb.append(ch);
            } else {
                char ch = (char) (((int) word.charAt(i) + move - 97) % 26 + 97);
                sb.append(ch);
            }
        }
        return sb;
    }

    @Override
    public StringBuilder decrypt(String encrypt, int move) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < encrypt.length(); i++) {
            if (Character.isUpperCase(encrypt.charAt(i))) {
                char ch = (char) (((int) encrypt.charAt(i) - move - 65) % 26 + 65);
                sb.append(ch);
            } else {
                char ch = (char) (((int) encrypt.charAt(i) - move - 96) % 26 + 96);
                sb.append(ch);
            }
        }
        return sb;
    }
}
