package com.simple.models.code;

import com.simple.models.member.Member;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by marathoner on 2021/08/21
 */
@Table(name = "Code")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Code {
    @Id
    @GeneratedValue()
    @Column(updatable = false, nullable = false)
    private Long id;

    private String name;

    private Float ord;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    private Timestamp deletedAt;

}
