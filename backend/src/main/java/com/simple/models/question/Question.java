package com.simple.models.question;

import com.simple.models.code.Code;
import com.simple.models.member.Member;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Question {

    @Id
    @GeneratedValue()
    @Column(updatable = false, nullable = false)
    private Long id;

    private String title;

    private String content;

    @CreationTimestamp
    private Timestamp createdAt;

    @ManyToOne(targetEntity = Code.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Code categoryId;

    @OneToOne(targetEntity = Member.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private Member user;

}
