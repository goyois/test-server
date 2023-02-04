package bookstore.test.member.controller;

import bookstore.test.member.dto.MemberPatchDto;
import bookstore.test.member.dto.MemberPostDto;
import bookstore.test.member.entity.Member;
import bookstore.test.member.mapper.MemberMapper;
import bookstore.test.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController  //Spring Bean 등록
@RequiredArgsConstructor //생성자 주입 처리
@Validated  // dto의 유효성검증이 실행되도록 선언
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;
    private  final MemberMapper mapper;


    @PostMapping
    public ResponseEntity createMember(@RequestBody MemberPostDto memberPostDto) {  //@RequestBody : JSON 형식의 Body를 Dto 클래스 객체로 변환해준다
        Member member = memberService.createMember(mapper.memberPostDtoToMember(memberPostDto));
        return new ResponseEntity<>(member, HttpStatus.CREATED);
    }

    @PatchMapping("{member-id}")
    public ResponseEntity patchMember(@PathVariable ("member-Id") Long memberId,
                                      @RequestBody MemberPatchDto memberPatchDto) {
        Member member = memberService.updateMember(mapper.memberPatchDtoToMember(memberPatchDto));
        memberPatchDto.setMemberId(memberId);
        return new ResponseEntity<>(memberPatchDto,HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getMembers() {
        return new ResponseEntity<>(HttpStatus.OK);
    }


    @DeleteMapping("{member-id}")
    public ResponseEntity deleteMember(@PathVariable ("member-id") Long memberId) {
        memberService.deleteMember(memberId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
