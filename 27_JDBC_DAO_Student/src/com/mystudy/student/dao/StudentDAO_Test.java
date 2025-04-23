package com.mystudy.student.dao;

import java.util.List;

import com.mystudy.student.vo.StudentVO;

public class StudentDAO_Test {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        System.out.println("----------");
        StudentDAO dao2 = new StudentDAO();
        System.out.println("=====================");

        String id = "2025005";
        System.out.println("--- selectOne(id) ---");
        StudentVO stu1 = dao.selectOne(id);
        System.out.println("stu1 : " + stu1);
        stu1.computeTotAvg();
        System.out.println("stu1 : " + stu1);
        System.out.println("stu1 id : " + stu1.getId());
        System.out.println("stu1 name : " + stu1.getName());

        System.out.println("--- selectAll() ---");
        List<StudentVO> list = dao.selectAll();
        System.out.println("list : " + list);
        for (StudentVO vo : list) {
            System.out.println(vo + "\n");
        }

        System.out.println("--- insert(vo) ---");
        StudentVO insertVO = new StudentVO("S2025010", "강감찬10", 95, 88, 75);
        System.out.println("입력할 데이터 : " + insertVO);
        int result = dao.insert(insertVO);
        System.out.println("입력건수 : " + result);
        StudentVO insertedVO = dao.selectOne(insertVO.getId());
        System.out.println("입력된 DB 데이터 조회 : " + insertedVO);

        System.out.println("--- update(vo) ---");
        StudentVO updateVO = new StudentVO("S2025010", "강감찬수정", 99, 88, 77);
        System.out.println("변경전 데이터 : " + dao.selectOne(updateVO.getId()));
        System.out.println("수정할 VO : " + updateVO);
        int updateCnt = dao.update(updateVO);
        System.out.println("수정건수 : " + updateCnt);
        System.out.println(">> 수정결과 확인");
        System.out.println("수정결과 : " + dao.selectOne(updateVO.getId()));

        System.out.println("--- updateName(id, name) ---");
        int updateNameCnt = dao.updateName("S2025010", "이순신수정");
        System.out.println("이름수정건수 : " + updateNameCnt);
        System.out.println("이름수정결과 : " + dao.selectOne("S2025010"));

        System.out.println("--- updateKor(id, kor) ---");
        int updateKorCnt = dao.updateKor("2025005", 85);
        System.out.println("국어점수수정건수 : " + updateKorCnt);
        System.out.println("국어점수수정결과 : " + dao.selectOne("2025005"));

        System.out.println("--- updateTotAvg(id) ---");
        int updateTotAvgCnt = dao.updateTotAvg("S2025010");
        System.out.println("총점, 평균 재계산 건수 : " + updateTotAvgCnt);
        System.out.println("총점, 평균 재계산 결과 : " + dao.selectOne("S2025010"));

        System.out.println("--- updateTotAvgAll() ---");
        int updateTotAvgAllCnt = dao.updateTotAvgAll();
        System.out.println("전체 총점, 평균 재계산 건수 : " + updateTotAvgAllCnt);

        System.out.println("--- delete(id) ---");
        int deleteCnt = dao.delete(updateVO.getId());
        System.out.println("삭제건수 : " + deleteCnt);

        System.out.println("=== main() 끝 =====");
    }
}
