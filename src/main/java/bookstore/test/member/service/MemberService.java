package bookstore.test.member.service;


import bookstore.test.member.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service  //Spring Bean 등록
@RequiredArgsConstructor
public class MemberService {



    public Member createMember(Member member) {  //Member타입의 member  = API계층에서 전달받은 요청 데이터를 기반으로 서비스 계층에서 비즈니스 로직 처리를 위한 데이터를 전달받고 비즈니스 로직을 처리한 후에는 결과값을 다시 API 계층으로 리턴해주는 역할
        return member;
    }

    public Member updateMember(Member memberId) {
        return memberId;
    }

    public List<Member> findMembers() {
        return findMembers();
    }

    public void deleteMember(Long memberId) {


    }
}
