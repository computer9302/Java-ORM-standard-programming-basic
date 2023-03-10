package hellojpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity(name="Member")
@SequenceGenerator(
        name="MEMBER_SEQ_GENERATOR",
        sequenceName="MEMBER_SEQ", //매핑할 데이터베이스 시퀀스 이름
        initialValue = 1, allocationSize = 50
)

public class Member {

    @Id
    @GeneratedValue
    @Column(name="MEMBER_ID")
    private long id;
    @Column(name = "USERNAME")
    private String username;

    //@Column(name="TEAM_ID")
    //private Long teamId;

    @ManyToOne
    @JoinColumn(name="TEAM_ID")
    private Team team;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
