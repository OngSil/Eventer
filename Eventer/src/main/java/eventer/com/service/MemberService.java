package eventer.com.service;

import java.util.List;
import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventer.com.domain.Member;

@Service
public interface MemberService {
	public void doSignUp(Member member);
	public int getMemberSeqNo();
	//public List<History> getHistoryList();
}
