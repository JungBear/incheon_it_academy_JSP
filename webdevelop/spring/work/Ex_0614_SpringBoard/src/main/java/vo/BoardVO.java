package vo;

import lombok.Data;

@Data
public class BoardVO {
	private int idx, readhit, ref, step, depth, del_info;
	private String name, subject, content, pwd, ip;
	private String regdate;
}
