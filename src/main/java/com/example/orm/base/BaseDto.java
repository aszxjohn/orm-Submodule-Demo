package com.example.orm.base;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;


@Data
public class BaseDto  implements Serializable {

	private static final long serialVersionUID = 17522302528783844L;

	private String createUser;

    private String updateUser;

    private Timestamp createDate;

    private Timestamp updateDate;

}