package com.example.orm.base;

import java.util.List;


/**
 * 1. 各物件轉換使用
 * 2. 說明
 * DTO：與前端溝通使用
 * Entity： 與資料庫溝通使用
 *
 * @author John
 */
public interface BaseMapper<DTO, ENTITY> {

	ENTITY toEntity(DTO dto);

	DTO toDto(ENTITY entity);

    List <ENTITY> toEntity(List<DTO> dtoList);

    List <DTO> toDto(List<ENTITY> entityList);

}
