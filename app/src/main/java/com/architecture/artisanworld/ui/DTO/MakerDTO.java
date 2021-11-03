package com.architecture.artisanworld.ui.DTO;

import java.io.Serializable;
// Serializable과 Parcelable의 장단점을 제대로 비교해볼 것(각각의 방법으로 한 번씩 구현함으로써)
public class MakerDTO implements Serializable {

    public String makerName; // 메이커명
    public String makerImageUrl; // 메이커이미지 Url
    public String Country; // 어느 국가의 메이커인지
    public String makerInstagram; // 해당 메이커의 인스타그램 주소, 아이콘으로 이벤트처리
    public String makerDiscord; // 해당 메이커의 디스코드 주소, 아이콘으로 이벤트처리

    public boolean locked; // 삭제 불가능하게 잠금 여부, 얘는 관리자들한테만 보이게
    public boolean like; // 좋아요 눌렀는지 여부, 하트에 불 들어오게
    public boolean activate; // 현재 활동중인지 여부, 초록불 빨간불로 표시해도 좋을것으로 보임
}