package eventer.com.domain;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {
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
}
