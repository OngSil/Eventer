package eventer.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eventer.com.domain.Member;
import eventer.com.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public void doSignUp(Member member) {
		memberMapper.doSignUp(member);
	}
	
	@Override
	public int getMemberSeqNo() {
		return memberMapper.getMemberSeqNo();
	}
}
