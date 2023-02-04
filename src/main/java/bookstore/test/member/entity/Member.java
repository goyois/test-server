package bookstore.test.member.entity;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class Member {
    private Long memberId;
    @Email // 유효한 이메일형식인지에 대한 유효성 검증
    private String email;
    private String password;
    private String name;
}
