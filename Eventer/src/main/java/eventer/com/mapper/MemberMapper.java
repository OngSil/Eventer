package eventer.com.mapper;

import java.util.List;

import eventer.com.domain.Member;
import eventer.com.vo.MemberVo;

public interface MemberMapper {
	//About getAboutInfo();
	//List<History> getHistoryList();
	
	void doSignUp(MemberVo memberVo);
	int getMemberSeqNo();
}