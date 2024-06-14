package vo;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {
	private int idx, readHit, ref, step, depth;
	private String name, subject, content, pwd, ip;
	private Date regdate;
}
