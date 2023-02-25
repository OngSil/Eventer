package eventer.com.vo;
import java.sql.Date;
import java.util.List;
import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVo {
	private int seq_no;
	String user_type;
	String name;
	String user_id;
	String password;
	String phone;
	String email;
	Date register_date;
	String interest_item1;
	String interest_item2;
	String interest_item3;

	
	public MemberVo(int seqNo, String userType, String name, String userId, String password, String phone, String email, Date registerDate, String interestItem1, String interestItem2, String interestItem3) {
		this.seq_no = seqNo;
		this.user_type = userType;
		this.name = name;
		this.user_id = userId;
		this.password = password;
		this.phone = phone;
		this.email = email;
		this.register_date = registerDate;
		this.interest_item1 = interestItem1;
		this.interest_item2 = interestItem2;
		this.interest_item3 = interestItem3;
	}

}


