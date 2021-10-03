package com.simple.common.models.member;

import com.simple.common.models.code.Code;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by marathoner on 2021/09/20
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Member {

    @Id
    @GeneratedValue()
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(unique = true, length = 100)
    private String email;

    private Float age;

    private String about;

    private LoginType type;

    @ManyToOne(targetEntity = Code.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private Code city;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp deletedAt;
}
