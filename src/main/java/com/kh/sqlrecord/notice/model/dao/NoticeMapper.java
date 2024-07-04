package com.kh.sqlrecord.notice.model.dao;

import java.util.List;

import com.kh.sqlrecord.notice.model.vo.Notice;


public interface NoticeMapper {
	List<Notice> findAll();

	Notice findById(int noticeNo);

	int save(Notice notice);

	int update(Notice notice);

	int delete(int NoticeNo);
}
