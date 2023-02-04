package bookstore.test.member.mapper;

import bookstore.test.member.dto.MemberPatchDto;
import bookstore.test.member.dto.MemberPostDto;
import bookstore.test.member.dto.MemberResponseDto;
import bookstore.test.member.entity.Member;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")  //Spring Bean 등록
public interface MemberMapper {
    Member memberPostDtoToMember(MemberPostDto memberPostDto);
    Member memberPatchDtoToMember(MemberPatchDto memberPatchDto);
    MemberResponseDto memberToMemberResponseDto(Member member);
}
