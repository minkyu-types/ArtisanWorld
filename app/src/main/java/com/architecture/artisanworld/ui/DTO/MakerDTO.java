package com.architecture.artisanworld.ui.DTO;

import java.io.Serializable;
// Serializable과 Parcelable의 장단점을 제대로 비교해볼 것(각각의 방법으로 한 번씩 구현함으로써)
public class MakerDTO implements Serializable {

    public String makerName; // 메이커명
    public String makerImageUrl; // 메이커이미지 Url
    public String Country; // 어느 국가의 메이커인지
    public String makerInstagram; // 해당 메이커의 인스타그램 주소
    public String makerDiscord; // 해당 메이커의 디스코드 주소

    public boolean locked; // 삭제 불가능하게 잠금 여부(해제도 가능함)
    public boolean like; // 좋아요 눌렀는지 여부(해제도 가능함)

}