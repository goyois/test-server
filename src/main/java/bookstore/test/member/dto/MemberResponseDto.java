package bookstore.test.member.dto;

public class MemberResponseDto {
    private Long memberId;
    private String email;
    private String password;
    private String name;

    public MemberResponseDto() {};

    public MemberResponseDto(Long memberId, String email, String password, String name) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Long getMemberId() {
        return memberId;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
