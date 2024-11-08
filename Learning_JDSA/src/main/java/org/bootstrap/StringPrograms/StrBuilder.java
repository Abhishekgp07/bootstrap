package org.bootstrap.StringPrograms;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");

        sb.insert(5,"b");
      sb.deleteCharAt(5);
        System.out.println(sb);

    }
}
