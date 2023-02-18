package eventer.com.mapper;

import java.util.List;

import eventer.com.domain.Member;

public interface MemberMapper {
	//About getAboutInfo();
	//List<History> getHistoryList();
	
	void doSignUp(Member member);
	int getMemberSeqNo();
}