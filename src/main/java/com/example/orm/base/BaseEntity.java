package com.example.orm.base;

import java.io.Serializable;
import java.sql.Timestamp;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;


/**
 * @author John
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 3742475474970641079L;

	@CreatedBy
    @Column(name = "create_user", updatable = false)
    private String createUser;

    @LastModifiedBy
    @Column(name = "update_user")
    private String updateUser;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private Timestamp createDate;

    @UpdateTimestamp
    @Column(name = "update_date")
    private Timestamp updateDate;

    public @interface Create {}

    public @interface Update {}
    
    @Override
    public String toString() {
    	return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
