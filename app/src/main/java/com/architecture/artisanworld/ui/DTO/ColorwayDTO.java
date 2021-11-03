package com.architecture.artisanworld.ui.DTO;

import java.io.Serializable;

public class ColorwayDTO implements Serializable {

    public String colorwayImageUrl; // 해당 colorway의 사진 Url
    public String colorwayName; // 해당 colorway의 이름

    //상단부 정보
    public String timeStamp; // 등록된 yy-mm-dd(출시된 날짜 = 등록된 날짜로 가정)
    public Integer likeCount; // 몇 명이 좋아요를 눌렀는지

    //여부 정보, 뱃지로 표현하면 좋을듯
    public boolean like; // 좋아요 여부
    public boolean oneOff; // one-off 여부, 1/1 아이콘
    public boolean raffle; // raffle 여부, R 아이콘
    public boolean commission; //commission 여부, C 아이콘을
    public boolean fulfillment; // fulfillment 여부, F 아이콘
    public Integer quantity; // 해당 colorway가 총 몇 개 만들어졌는지

    //하단부 정보
    public String sculpFrom; // 어느 maker의 sculp인지 // maker - sculp - colorway - detail 로 넘어올 때 maker명, sculp명을 담아뒀다가 넣을 수 있나?
    public String colorwayFrom; // 어느 sculp의 colorway인지
    public String collaborationWith; // 어느 keycap과 콜라보했는지(Nullable)
}
