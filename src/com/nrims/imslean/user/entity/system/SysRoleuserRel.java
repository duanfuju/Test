package com.nrims.imslean.user.entity.system;
import java.io.Serializable;
import com.nrims.imslean.user.entity.ShareField;



public class SysRoleuserRel extends ShareField implements Serializable {
 	private String user_id;
	private String brole_id;
	private String ru_isdefault;
	private String ru_state;
	public void setUserId(String user_id){
		this.user_id=user_id;
	}
	public String getUserId(){
		return user_id;
	}
	public void setBroleId(String brole_id){
		this.brole_id=brole_id;
	}
	public String getBroleId(){
		return brole_id;
	}
	public void setRuIsdefault(String ru_isdefault){
		this.ru_isdefault=ru_isdefault;
	}
	public String getRuIsdefault(){
		return ru_isdefault;
	}
	public void setRuState(String ru_state){
		this.ru_state=ru_state;
	}
	public String getRuState(){
		return ru_state;
	}
}

