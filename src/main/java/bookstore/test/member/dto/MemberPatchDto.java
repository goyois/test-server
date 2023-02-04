package bookstore.test.member.dto;

public class MemberPatchDto {
    private Long memberId;
    private String email;
    private String password;
    private String name;



    public MemberPatchDto(){};


    public MemberPatchDto(Long memberId, String email, String password, String name) {
        this.memberId = memberId;
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
