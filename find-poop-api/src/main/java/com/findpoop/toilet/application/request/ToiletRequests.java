package com.findpoop.toilet.application.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ToiletRequests {
    private String serviceKey;          //서비스키
    private String pageNo;                //페이지 번호
    private String numOfRows;                //한 페이지 결과 수
    private String type;                //XML/JSON 여부
    private String toiletType;                //	구분
    private String toiletNm;                //	화장실명
    private String rdnmadr;                //	소재지도로명주소
    private String lnmadr;                //	소재지지번주소
    private String unisexToiletYn;                //	남녀공용화장실여부
    private String menToiletBowlNumber;                //	남성용-대변기수
    private String menUrineNumber;                //	남성용-소변기수
    private String menHandicapToiletBowlNumber;                //	남성용-장애인용대변기수
    private String menHandicapUrinalNumber;                //	남성용-장애인용소변기수
    private String menChildrenToiletBowlNumber;                //	남성용-어린이용대변기수
    private String menChildrenUrinalNumber;                //	남성용-어린이용소변기수
    private String ladiesToiletBowlNumber;                //	여성용-대변기수
    private String ladiesHandicapToiletBowlNumber;                //	여성용-장애인용대변기수
    private String ladiesChildrenToiletBowlNumber;                //	여성용-어린이용대변기수
    private String institutionNm;                //	관리기관명
    private String phoneNumber;                //	전화번호
    private String openTime;                //	개방시간
    private String installationYear;                //	설치연도
    private String latitude;                //	위도
    private String longitude;                //	경도
    private String toiletPossType;                //	화장실소유구분
    private String toiletPosiType;                //	화장실설치장소유형
    private String careSewerageType;                //	오물처리방식
    private String emgBellYn;                //	비상벨설치유형
    private String enterentCctvYn;                //	화장실입구CCTV설치유무
    private String dipersExchgPosi;                //	기저귀교환대장소
    private String modYear;                //	리모델링연월
    private String referenceDate;                //	데이터기준일자
    private String instt_code;                //	제공기관코드
    private String instt_nm;                //	제공기관기관명
}
