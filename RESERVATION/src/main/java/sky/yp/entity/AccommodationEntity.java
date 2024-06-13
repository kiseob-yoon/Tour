package sky.yp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Accommodation")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AccommodationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ACCNO")
    private int accNo;
    @Column(name = "SAVENO")
    private int saveNo;
    @Column(name = "USERNO")
    private int userNo;
    @Column(name = "ACCNAME")
    private String accName;
    @Column(name = "ACCADDRESS")
    private String accAddress;
    @Column(name = "ACCIMG")
    private String accImg;
    @Column(name = "ACCTEL")
    private String accTel;

    // 생성자, getter 및 setter는 생략되어 있습니다.
    // 필요하다면 추가하십시오.
}
