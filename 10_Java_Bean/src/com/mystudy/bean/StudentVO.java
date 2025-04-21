package com.mystudy.bean;
/*
  ■ 캡슐화(Encapsulation) - 정보은닉(Infomation Hiding)
  - 사용자의 편의와 안정성을 위해 숨길 것은 숨기고, 공개할 것은 공개
  - 주로 속성은 숨기고 속성에 접근시 메소드(기능)를 통해 접근 처리	
	
■ 자바빈(Java Bean)
  - 멤버변수(property)의 접근제어자는 private
  - 멤버변수(property) 마다 get/set 메소드 제공(선택적으로 get만 제공)
  - get/set 메소드는 public
  - get 메소드는 파라미터 없고, set 메소드는 하나 이상의 파라미터 존재
  - 멤버변수(property)가 boolean 타입이면 get 메소드 대신 is 메소드 사용가능
  - 외부에서 멤버변수(property) 접근시에는 get/set 메소드를 통해 접근
 */


/* 자바 빈(Bean) 형태의 클래스 작성
 * VO(Value Object) : 값(데이터)을 저장하기 위한 객체(클래스) - Oxxx , OxxxVO , OxxxVo
 * 	사용예 ( Student, StudentVO , StudentVo )
 * 
 * 
 * DTO (Data Transfer Object) 값을 저장해서 전달하기 위한 클래스
 * Oxxx , OxxxVO , OxxxVo
 * 사용예 ) Student , StudentDto , StudentDTO	
 */
public class StudentVO {

}
