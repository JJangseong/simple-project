package com.simple.models.member;

/**
 * Created by marathoner on 2021/09/20
 */
public enum LoginType {
    KAKAO("kakao"), NAVER("naver"), APPLE("apple"), FACE_BOOK("faceBook");

    private final String value;

    LoginType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
