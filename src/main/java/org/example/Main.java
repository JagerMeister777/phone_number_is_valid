package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      //ハイフン付きの国内電話番号の有効性を確認する
      //正規表現を使用
      Scanner scanner = new Scanner(System.in);

      System.out.print("携帯電話番号を入力してください。: ");
      CheckPhoneNumber.checkPhoneNumber(scanner.next());
    }
}