package org.example;

import java.text.Normalizer;

public class CheckPhoneNumber {

  public static void checkPhoneNumber(String inputPhoneNumber){
    //携帯電話番号を半角に統一（UNICODE正規化）
    inputPhoneNumber = Normalizer.normalize(inputPhoneNumber, Normalizer.Form.NFKC);

    //電話番号が有効であればTrue
    //日本の国内電話は必ず0から始まる
    boolean isValid = inputPhoneNumber.matches("^(070|080|090)-\\d{4}-\\d{4}$");

    if (isValid){
      System.out.println(inputPhoneNumber + " は有効な携帯電話番号です。");
    }else{
      System.out.println(inputPhoneNumber + " は無効な携帯電話番号です。");
    }
  }

}
